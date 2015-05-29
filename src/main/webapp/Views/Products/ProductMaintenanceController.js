"use strict";

define(['application-configuration', 'productsService', 'alertsService'], function (app) {

    app.register.controller('productMaintenanceController', ['$scope', '$rootScope', '$routeParams', 'productsService', 'alertsService',
    function ($scope, $rootScope, $routeParams, productService, alertsService) {

        $scope.initializeController = function () {

            var productID = ($routeParams.id || "");

            $rootScope.applicationModule = "Products";
            $rootScope.alerts = [];

            $scope.ProductID = productID;

            if (productID == "") {

                $scope.ProductCode = "";
                $scope.Description = "";
                $scope.UnitPrice = "0.00";
                $scope.UnitOfMeasure = "";

                $scope.setOriginalValues();

                $scope.EditMode = true;
                $scope.DisplayMode = false;

                $scope.ShowCreateButton = true;
                $scope.ShowEditButton = false;
                $scope.ShowCancelButton = false;
                $scope.ShowUpdateButton = false;

            }
            else {
                var getProduct = new Object();
                getProduct.ProductID = productID;
                productService.getProduct(getProduct, $scope.getProductCompleted, $scope.getProductError);

            }

        }

        $scope.getProductCompleted = function (response) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;

            $scope.ProductCode = response.Product.ProductCode;
            $scope.Description = response.Product.Description;
            $scope.UnitPrice = response.Product.UnitPrice;
            $scope.UnitOfMeasure = response.Product.UnitOfMeasure;

            $scope.setOriginalValues();
        }

        $scope.getProductError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);          
        }

        $scope.clearValidationErrors = function () {

            $scope.ProductCodeInputError = false;
            $scope.DescriptionInputError = false;
            $scope.UnitPriceInputError = false;
            $scope.UnitOfMeasureInputError = false;         

        }

        $scope.setOriginalValues = function () {

            $scope.OriginalProductCode = $scope.ProductCode;
            $scope.OriginalDescription = $scope.Description;
            $scope.OriginalUnitPrice = $scope.UnitPrice;
            $scope.OriginalUnitOfMeasure = $scope.UnitOfMeasure;         

        }

        $scope.resetValues = function () {

            $scope.ProductCode = $scope.OriginalProductCode;
            $scope.Description = $scope.OriginalDescription;
            $scope.UnitPrice = $scope.OriginalUnitPrice;
            $scope.UnitOfMeasure = $scope.OriginalUnitOfMeasure;
      
        }

        $scope.editProduct = function () {
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = false;
            $scope.ShowCancelButton = true;
            $scope.ShowUpdateButton = true;
            $scope.EditMode = true;
            $scope.DisplayMode = false;
        }

        $scope.cancelChanges = function () {

            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;
            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $rootScope.alerts = [];

            $scope.resetValues();
        }

        $scope.createProduct = function () {

            var product = $scope.createProductObject();
            productService.createProduct(product, $scope.createProductCompleted, $scope.createProductError);
        }

        $scope.updateProduct = function () {
            var product = $scope.createProductObject();
            product.ProductID = $scope.ProductID;
            productService.updateProduct(product, $scope.updateProductCompleted, $scope.updateProductError);
        }

        $scope.createProductCompleted = function (response, status) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;

            $scope.ProductID = response.Product.ProductID;
            alertsService.RenderSuccessMessage(response.ReturnMessage);

            $scope.setOriginalValues();
        }

        $scope.createProductError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
            $scope.clearValidationErrors();
            alertsService.SetValidationErrors($scope, response.ValidationErrors);         
        }

        $scope.updateProductCompleted = function (response, status) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;

            alertsService.RenderSuccessMessage(response.ReturnMessage);

            $scope.setOriginalValues();
        }

        $scope.updateProductError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
            $scope.clearValidationErrors();
            alertsService.SetValidationErrors($scope,response.ValidationErrors);
        }


        $scope.createProductObject = function () {

            var product = new Object();

            product.ProductCode = $scope.ProductCode;
            product.Description = $scope.Description;
            product.UnitPrice = $scope.UnitPrice;
            product.UnitOfMeasure = $scope.UnitOfMeasure;           
          
            return product;

        }


    }]);

});