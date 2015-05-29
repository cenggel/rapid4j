"use strict";

define(['application-configuration', 'productsService', 'alertsService', 'dataGridService'], function (app) {

    app.register.controller('productInquiryController', ['$scope', '$rootScope', 'productsService', 'alertsService', 'dataGridService',
        function ($scope, $rootScope, productService, alertsService, dataGridService) {

            $scope.initializeController = function () {

                $rootScope.applicationModule = "Products";
                $rootScope.alerts = [];

                dataGridService.initializeTableHeaders();

                dataGridService.addHeader("Product Code", "ProductCode");
                dataGridService.addHeader("Product Description", "Description");
                dataGridService.addHeader("Unit Of Measure", "UnitOfMeasure");
                dataGridService.addHeader("Unit Price", "UnitPrice");               

                $scope.tableHeaders = dataGridService.setTableHeaders();
                $scope.defaultSort = dataGridService.setDefaultSort("Description");

                $scope.changeSorting = function (column) {

                    dataGridService.changeSorting(column, $scope.defaultSort, $scope.tableHeaders);

                    $scope.defaultSort = dataGridService.getSort();
                    $scope.SortDirection = dataGridService.getSortDirection();
                    $scope.SortExpression = dataGridService.getSortExpression();
                    $scope.CurrentPageNumber = 1;

                    $scope.getProducts();

                };


                $scope.setSortIndicator = function (column) {
                    return dataGridService.setSortIndicator(column, $scope.defaultSort);
                };

                $scope.ProductCode = "";
                $scope.Description = "";

                $scope.PageSize = 15;
                $scope.SortDirection = "ASC";
                $scope.SortExpression = "Description";
                $scope.CurrentPageNumber = 1;

                $rootScope.closeAlert = dataGridService.closeAlert;

                $scope.products = [];

                $scope.getProducts();

            }

            $scope.productInquiryCompleted = function (response, status) {
                alertsService.RenderSuccessMessage(response.ReturnMessage);
                $scope.products = response.Products;
                $scope.TotalProducts = response.TotalRows;
                $scope.TotalPages = response.TotalPages;
            }

            $scope.searchProducts = function () {
                $scope.CurrentPageNumber = 1;
                $scope.getProducts();
            }

            $scope.pageChanged = function () {
                $scope.getProducts();
            }

            $scope.getProducts = function () {
                var productInquiry = $scope.createProductInquiryObject();
                productService.getProducts(productInquiry, $scope.productInquiryCompleted, $scope.productInquiryError);
            }

            $scope.productInquiryError = function (response, status) {
                alertsService.RenderErrorMessage(response.Error);
            }

            $scope.resetSearchFields = function () {
                $scope.ProductCode = "";
                $scope.Description = "";
                $scope.getProducts();
            }

            $scope.createProductInquiryObject = function () {

                var productInquiry = new Object();

                productInquiry.ProductCode = $scope.ProductCode;
                productInquiry.Description = $scope.Description;
                productInquiry.CurrentPageNumber = $scope.CurrentPageNumber;
                productInquiry.SortExpression = $scope.SortExpression;
                productInquiry.SortDirection = $scope.SortDirection;
                productInquiry.PageSize = $scope.PageSize;

                return productInquiry;
            }

            $scope.setHeaderAlignment = function (label) {
                if (label=="Unit Price")
                    return { 'textAlign': 'right' }
                else
                    return { 'textAlign': 'left' }
            }


        }]);

});
