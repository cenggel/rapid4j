"use strict";

define(['application-configuration', 'ordersService', 'alertsService', 'dataGridService'], function (app) {

    app.register.controller('orderInquiryController', ['$scope', '$rootScope', 'ordersService', 'alertsService', 'dataGridService',
        function ($scope, $rootScope, orderService, alertsService, dataGridService) {

            $scope.initializeController = function () {
            
                $rootScope.applicationModule = "Orders";

                dataGridService.initializeTableHeaders();
               
                dataGridService.addHeader("Order #", "OrderID");
                dataGridService.addHeader("Customer Code", "CustomerCode");
                dataGridService.addHeader("Company Name", "CompanyName");
                dataGridService.addHeader("Order Date", "OrderDate");
                dataGridService.addHeader("Order Total", "OrderTotal");
            
                $scope.tableHeaders = dataGridService.setTableHeaders();
                $scope.defaultSort = dataGridService.setDefaultSort("Order Date");

                $scope.changeSorting = function (column) {

                    dataGridService.changeSorting(column, $scope.defaultSort, $scope.tableHeaders);

                    $scope.defaultSort = dataGridService.getSort();
                    $scope.SortDirection = dataGridService.getSortDirection();
                    $scope.SortExpression = dataGridService.getSortExpression();
                    $scope.CurrentPageNumber = 1;

                    $scope.getOrders();

                };


                $scope.setSortIndicator = function (column) {
                    return dataGridService.setSortIndicator(column, $scope.defaultSort);
                };

                $scope.CustomerCode = "";
                $scope.CompanyName = "";

                $scope.PageSize = 15;
                $scope.SortDirection = "DESC";
                $scope.SortExpression = "OrderDate";
                $scope.CurrentPageNumber = 1;

                $rootScope.closeAlert = dataGridService.closeAlert;

                $scope.orders = [];

                $scope.getOrders();

            }

            $scope.orderInquiryCompleted = function (response, status) {

                alertsService.RenderSuccessMessage(response.ReturnMessage);
                $scope.orders = response.Orders;
                $scope.TotalOrders = response.TotalRows;
                $scope.TotalPages = response.TotalPages;
            }

            $scope.searchOrders = function () {
                $scope.CurrentPageNumber = 1;
                $scope.getOrders();
            }

            $scope.pageChanged = function () {
                $scope.getOrders();
            }

            $scope.getOrders = function () {
                var orderInquiry = $scope.createOrderInquiryObject();
                orderService.getOrders(orderInquiry, $scope.orderInquiryCompleted, $scope.orderInquiryError);
            }

            $scope.orderInquiryError = function (response, status) {
                if (response.IsAuthenicated == false) {
                    window.location = "/index.html";
                }
                alertsService.RenderErrorMessage(response.ReturnMessage);
            }

            $scope.resetSearchFields = function () {
                $scope.CustomerCode = "";
                $scope.CompanyName = "";
                $scope.getOrders();
            }

            $scope.createOrderInquiryObject = function () {

                var orderInquiry = new Object();

                orderInquiry.CustomerCode = $scope.CustomerCode;
                orderInquiry.CompanyName = $scope.CompanyName;
                orderInquiry.CurrentPageNumber = $scope.CurrentPageNumber;
                orderInquiry.SortExpression = $scope.SortExpression;
                orderInquiry.SortDirection = $scope.SortDirection;
                orderInquiry.PageSize = $scope.PageSize;

                return orderInquiry;
            }


        }]);

});
