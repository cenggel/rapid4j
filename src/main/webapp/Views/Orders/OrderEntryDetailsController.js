"use strict";

define(['application-configuration', 'customersService', 'productLookupModalController', 'ordersService', 'productsService', 'alertsService'], function (app) {

    app.register.controller('orderEntryDetailsController', ['$location', '$modal', '$log', '$filter', '$scope', '$rootScope', '$routeParams', '$document',
        'customersService', 'ordersService', 'productsService', 'alertsService',

    function ($location, $modal, $log, $filter, $scope, $rootScope, $routeParams, $document, customerService, orderService, productService, alertsService) {   

        $scope.initializeController = function () {

            var orderID = ($routeParams.id || "");

            $scope.ProductID = "";

            $rootScope.applicationModule = "Orders";
            $rootScope.alerts = [];
            $scope.OrderDetails = [];
            
            $scope.OrderID = orderID;
            var order = new Object();
            order.OrderID = orderID;
            orderService.getOrder(order, $scope.getOrderCompleted, $scope.getOrderError);

        }

        $scope.open = function ($event) {
            $event.preventDefault();
            $event.stopPropagation();
            $scope.opened = true;
        };

        $scope.clear = function () {
            $scope.RequiredDate = null;
        };

        $scope.disabled = function (date, mode) {
            //return (mode === 'day' && (date.getDay() === 0 || date.getDay() === 6));
            return false;
        };


        $scope.getProductCompleted = function (response) {

            $scope.ProductID = response.Product.ProductID;
            $scope.ProductCode = response.Product.ProductCode;
            $scope.Description = response.Product.Description;
            $scope.UnitPrice = response.Product.UnitPrice;
            $scope.UnitOfMeasure = response.Product.UnitOfMeasure;
            $scope.Quantity = 1;
            $rootScope.alerts = [];

        }

        $scope.getProductError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }

     
        $scope.getOrderCompleted = function (response) {  

            $scope.CustomerCode = response.Customer.CustomerCode;
            $scope.CompanyName = response.Customer.CompanyName;
            $scope.Address = response.Customer.Address;
            $scope.City = response.Customer.City;
            $scope.Region = response.Customer.Region;
            $scope.PostalCode = response.Customer.PostalCode;
            $scope.CountryCode = response.Customer.Country;
            $scope.Shippers = response.Shippers;
            $scope.ShipVia = response.Order.ShipVia;
            $scope.ShipperID = response.Order.ShipVia;
            $scope.OrderTotal = response.Order.OrderTotal;
            $scope.OrderDate = response.Order.OrderDate;

            $scope.RequiredDate = $filter('date')(response.Order.RequiredDate, 'MM/dd/yyyy');

            $scope.ShipName = response.Order.ShipName;
            $scope.ShipAddress = response.Order.ShipAddress;
            $scope.ShipCity = response.Order.ShipCity;
            $scope.ShipRegion = response.Order.ShipRegion;
            $scope.ShipPostalCode = response.Order.ShipPostalCode;
            $scope.ShipCountry = response.Order.ShipCountry;

            $scope.OrderDetails = $scope.dataBindOrderDetails(response.OrderDetails);
            $scope.setDefaultShipper();       
            $rootScope.alerts = [];
                      
        }



        $scope.orderHeader = function () {

            if ($scope.InEditMode == true) {
                alertsService.RenderErrorMessage("In edit mode.");
                return false;
            }
            var url = '/Orders/OrderEntryHeader/' + $scope.OrderID;
            $location.path(url);

        }

        $scope.setDefaultShipper = function () {

            for (var i = 0; i < $scope.Shippers.length; i++) {
                if ($scope.Shippers[i].ShipperID == $scope.ShipperID) {
                    $scope.ShipVia = $scope.Shippers[i];
                    $scope.selectedShipperName = $scope.Shippers[i].ShipperName;
                    break;
                }
            }

        }

        $scope.getOrderError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }

        $scope.addLineItem = function () {

            $rootScope.alerts = [];
            if ($scope.InEditMode == true) {
                alertsService.RenderErrorMessage("Already in edit mode.");
                return false;
            }
          
            var orderDetail = $scope.createOrderDetailObject();
            orderService.createOrderDetailLineItem(orderDetail, $scope.createOrderDetailLineItemCompleted, $scope.createOrderDetailLineItemError);

        }

        $scope.createOrderDetailLineItemCompleted = function (response) {

            $scope.ProductID = "";
            $scope.ProductCode = "";
            $scope.Description = "";
            $scope.UnitPrice = "";
            $scope.UnitOfMeasure = "";
            $scope.Quantity = "";
    
            $scope.OrderDetails = $scope.dataBindOrderDetails(response.OrderDetails);
            $scope.OrderTotal = response.Order.OrderTotal;
            alertsService.RenderSuccessMessage(response.ReturnMessage);
        
        }

        $scope.createOrderDetailLineItemError = function (response) {           
            alertsService.RenderErrorMessage(response.ReturnMessage);                           
        }

        $scope.deleteOrderDetailLineItemCompleted = function (response) {

            $scope.OrderDetails = $scope.dataBindOrderDetails(response.OrderDetails);
            $scope.OrderTotal = response.Order.OrderTotal;
            alertsService.RenderSuccessMessage(response.ReturnMessage);

        }

        $scope.deleteOrderDetailLineItemError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }


        $scope.createOrderDetailObject = function () {

            var order = new Object();

            order.OrderID = $scope.OrderID;
            order.ProductID = $scope.ProductID;
            order.Quantity = $scope.Quantity;
          
            return order;

        }

        $scope.editLineItem= function (i) {
         
            $rootScope.alerts = [];
            if ($scope.InEditMode == true) {
                alertsService.RenderErrorMessage("Already in edit mode.");
                return false;
            }

            $scope.originalQuantity = $scope.OrderDetails[i].Quantity;

            $scope.OrderDetails[i].DisplayMode = false;
            $scope.OrderDetails[i].EditMode = true;
            $scope.InEditMode = true;

        }

        $scope.deleteLineItem = function (i) {
                 
            $scope.lineItemNumberToDelete = $scope.OrderDetails[i].LineItemNumber;
            $scope.productCodeToDelete = $scope.OrderDetails[i].ProductCode;
            $scope.descriptionToDelete = $scope.OrderDetails[i].Description;
            $scope.orderDetailIDToDelete = $scope.OrderDetails[i].OrderDetailID;
            $scope.indexToDelete = i;

            $scope.openDeleteLineItemModal();
          
        }

        $scope.cancelEdit = function (i) {
           
            $scope.OrderDetails[i].DisplayMode = true;
            $scope.OrderDetails[i].EditMode = false;
            $scope.InEditMode = false;

            $scope.OrderDetails[i].Quantity = $scope.originalQuantity;

        }

        $scope.updateLineItem = function (i) {

            var order = new Object();          
            order.OrderID = $scope.OrderID;
            order.OrderDetailID = $scope.OrderDetails[i].OrderDetailID;
            order.Quantity = $scope.OrderDetails[i].Quantity;

            $scope.OrderDetails[i].DisplayMode = true;
            $scope.OrderDetails[i].EditMode = false;

            orderService.updateOrderDetailLineItem(order, $scope.updateOrderDetailLineItemCompleted, $scope.updateOrderDetailLineItemError);
           
        }

        $scope.updateOrderDetailLineItemCompleted = function (response) {         
            $scope.OrderTotal = response.Order.OrderTotal;
            $scope.InEditMode = false;
            alertsService.RenderSuccessMessage(response.ReturnMessage);
        }


        $scope.updateOrderDetailLineItemError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }


        var ModalInstanceCtrl = function ($scope, $modalInstance) {

            $scope.ProductCode = "";
            $scope.ProductDescription = "";

            $scope.ok = function (productID) {
                $modalInstance.close(productID);
            };

            $scope.cancel = function () {
                $modalInstance.dismiss('cancel');
            };


        };

        var DeleteLineItemController = function ($scope, $modalInstance,
            lineItemNumberToDelete, productCodeToDelete, descriptionToDelete, indexToDelete, orderDetailIDToDelete, orderID) {

            $scope.thisLineItemToDelete = lineItemNumberToDelete;
            $scope.thisProductCodeToDelete = productCodeToDelete;
            $scope.thisDescriptionToDelete = descriptionToDelete;
            $scope.thisIndexToDelete = indexToDelete;
            $scope.thisOrderDetailIDToDelete = orderDetailIDToDelete;
            $scope.thisOrderID = orderID;

            $scope.okToDelete = function () {
                var order = new Object();
                order.OrderID = $scope.thisOrderID;
                order.OrderDetailID = $scope.thisOrderDetailIDToDelete;
                $modalInstance.close(order);
            };

            $scope.cancelDelete = function () {
                $modalInstance.dismiss('cancel');
            };


        };

        $scope.openDeleteLineItemModal = function () {

            var modalInstance = $modal.open({
                templateUrl: 'deleteLineItemModal.html',
                controller: DeleteLineItemController,
                windowClass: 'app-modal-window',
                resolve: {
                    lineItemNumberToDelete: function () {
                        return $scope.lineItemNumberToDelete;
                    },
                    productCodeToDelete: function () {
                        return $scope.productCodeToDelete;
                    },
                    descriptionToDelete: function () {
                        return $scope.descriptionToDelete;
                    },
                    indexToDelete: function () {
                        return $scope.indexToDelete;
                    },
                    orderDetailIDToDelete: function () {
                        return $scope.orderDetailIDToDelete;
                    },
                    orderID: function () {
                        return $scope.OrderID;
                    }
                }
            });

            modalInstance.result.then(function (order) {
                orderService.deleteOrderDetailLineItem(order, $scope.deleteOrderDetailLineItemCompleted, $scope.deleteOrderDetailLineItemError);

            }, function () {
                //$log.info('Modal dismissed at: ' + new Date());
            });
        };

        $scope.openModal = function () {

            var modalInstance = $modal.open({
                templateUrl: 'myModalContent.html',
                controller: ModalInstanceCtrl,
                windowClass: 'app-modal-window'
            });

            modalInstance.result.then(function (productID) {
                var getProduct = new Object();
                getProduct.ProductID = productID;
                productService.getProduct(getProduct, $scope.getProductCompleted, $scope.getProductError);

            }, function () {
                //$log.info('Modal dismissed at: ' + new Date());
            });
        };

        $scope.dataBindOrderDetails = function (orderDetail) {

            var orderDetails = [];

            angular.forEach(orderDetail, function (lineItem) {

                var order = new Object();

                order.OrderDetailID = lineItem.OrderDetail.OrderDetailID;
                order.LineItemNumber = lineItem.OrderDetail.LineItemNumber;
                order.ProductCode = lineItem.Product.ProductCode;
                order.Description = lineItem.Product.Description;
                order.Quantity = lineItem.OrderDetail.Quantity;
                order.UnitPrice = lineItem.Product.UnitPrice;

                order.EditMode = false;
                order.DisplayMode = true;

                orderDetails.push(order);

            });

            return orderDetails;

        }


    }]);

});