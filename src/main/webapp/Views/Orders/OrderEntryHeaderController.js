"use strict";

define(['application-configuration', 'customersService', 'ordersService', 'alertsService'], function (app) {

    app.register.controller('orderEntryHeaderController', ['$location', '$filter','$scope', '$rootScope', '$routeParams', '$document', 'customersService', 'ordersService', 'alertsService',
    function ($location, $filter, $scope, $rootScope, $routeParams, $document, customerService, orderService, alertsService) {

        $scope.initializeController = function () {

            $scope.dateOptions = {
                formatYear: 'yy',
                startingDay: 1
            };
           
            var entityID = ($routeParams.id || "");
                      
            $rootScope.applicationModule = "Orders";
            $rootScope.alerts = [];
                      
            if (entityID.length==36)
            {             
                $scope.CustomerID = entityID;
                var order = new Object();
                order.CustomerID = entityID;
                orderService.initializeOrder(order, $scope.initializeOrderCompleted, $scope.initializeOrderError);
            }
            else
            {               
                $scope.OrderID = entityID;
                var order = new Object();
                order.OrderID = entityID;
                orderService.getOrder(order, $scope.getOrderCompleted, $scope.getOrderError);
            }      

        }


        $scope.splitString = function (input) {
            var values = input.split("/");
            return values;
        };

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

        $scope.initializeOrderCompleted = function (response) {

            $scope.EditMode = true;
            $scope.DisplayMode = false;
            $scope.ShowCreateButton = true;
            $scope.ShowEditButton = false;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;
            $scope.ShowDetailsButton = false;

            $scope.CustomerCode = response.Customer.CustomerCode;
            $scope.CompanyName = response.Customer.CompanyName;
            $scope.Address = response.Customer.Address;
            $scope.City = response.Customer.City;
            $scope.Region = response.Customer.Region;
            $scope.PostalCode = response.Customer.PostalCode;
            $scope.CountryCode = response.Customer.Country;
            $scope.Shippers= response.Shippers;
            $scope.ShipVia = [];
            $scope.OrderTotal = 0.00;

            $scope.setOriginalValues();
        }

        $scope.initializeOrderError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }


        $scope.getOrderCompleted = function (response) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;
            $scope.ShowDetailsButton = true;

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
      
            $scope.setDefaultShipper();

            $scope.setOriginalValues();
        }

        $scope.getOrderError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }

        $scope.setOriginalValues = function () {

            $scope.OriginalShipName = $scope.ShipName;
            $scope.OriginalShipAddress = $scope.ShipAddress;
            $scope.OriginalShipCity = $scope.ShipCity;
            $scope.OriginalShipRegion = $scope.ShipRegion;
            $scope.OriginalShipPostalCode = $scope.ShipPostalCode;
            $scope.OriginalShipCountry = $scope.ShipCountry;
       
            $scope.OriginalRequiredDate = $scope.RequiredDate;
        }

        $scope.resetValues = function () {
           
            $scope.ShipName = $scope.OriginalShipName;
            $scope.ShipAddress = $scope.OriginalShipAddress;
            $scope.ShipCity = $scope.OriginalShipCity;
            $scope.ShipRegion = $scope.OriginalShipRegion;
            $scope.ShipPostalCode = $scope.OriginalShipPostalCode;
            $scope.ShipCountry = $scope.OriginalShipCountry;
            $scope.RequiredDate = $scope.OriginalRequiredDate;

            $scope.setDefaultShipper();

        }

        $scope.editOrder = function () {
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = false;
            $scope.ShowCancelButton = true;
            $scope.ShowUpdateButton = true;
            $scope.ShowDetailsButton = false;
            $scope.EditMode = true;
            $scope.DisplayMode = false;
        }

        $scope.cancelChanges = function () {

            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;
            $scope.ShowDetailsButton = true;
            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $rootScope.alerts = [];

            $scope.resetValues();
            $scope.clearValidationErrors();
        }

        $scope.createOrder = function () {

            var order = $scope.createOrderObject();
            orderService.createOrder(order, $scope.createOrderCompleted, $scope.createOrderError);
        }

        $scope.updateOrder = function () {
            var order = $scope.createOrderObject();            
            orderService.updateOrder(order, $scope.updateOrderCompleted, $scope.updateOrderError);
        }

        $scope.orderDetails = function () {      
            var url = '/Orders/OrderEntryDetails/' + $scope.OrderID;
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

        $scope.createOrderCompleted = function (response, status) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowDetailsButton = true;

            $scope.OrderID = response.Order.OrderID;
            $scope.OrderDate = $scope.RequiredDate = $filter('date')(response.Order.OrderDate, 'MM/dd/yyyy');
            alertsService.RenderSuccessMessage(response.ReturnMessage);

            $scope.clearValidationErrors();

            $scope.setDefaultShipper();

            $scope.setOriginalValues();
        }

        $scope.createOrderError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
            $scope.clearValidationErrors();
            alertsService.SetValidationErrors($scope, response.ValidationErrors);
        }


        $scope.updateOrderCompleted = function (response, status) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;
            $scope.ShowDetailsButton = true;

            alertsService.RenderSuccessMessage(response.ReturnMessage);

            $scope.setOriginalValues();
        }

        $scope.updateOrderError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
            $scope.clearValidationErrors();
            alertsService.SetValidationErrors($scope, response.ValidationErrors);
        }


        $scope.createOrderObject = function () {

            var order = new Object();

            if ($scope.OrderID != null) order.OrderID = $scope.OrderID;
           
            order.CustomerID = $scope.CustomerID;           
            order.RequiredDate = $scope.RequiredDate;
            order.ShipName = $scope.ShipName;
            order.ShipAddress = $scope.ShipAddress;
            order.ShipCity = $scope.ShipCity;
            order.ShipRegion = $scope.ShipRegion;
            order.ShipPostalCode = $scope.ShipPostalCode;
            order.ShipCountry = $scope.ShipCountry;
            order.ShipperID = $scope.ShipVia.ShipperID;
      
            return order;

        }

        $scope.clearValidationErrors = function () {

            $scope.ShipViaInputError = false;
            $scope.RequiredDateInputError = false;
            $scope.ShipNameInputError = false;
            $scope.ShipAddressInputError = false;
            $scope.ShipCityInputError = false;
            $scope.ShipRegionInputError = false;
            $scope.ShipPostalCodeInputError = false;
            $scope.ShipCountryInputError = false;

        }



    }]);

});