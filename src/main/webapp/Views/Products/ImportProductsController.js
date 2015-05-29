"use strict";

define(['application-configuration', 'productsService', 'alertsService'], function (app) {

    app.register.controller('importProductsController', ['$scope', '$rootScope', 'productsService', 'alertsService', function ($scope, $rootScope, productsService, alertsService) {

        $rootScope.closeAlert = alertsService.closeAlert;

        $scope.initializeController = function () {
            $rootScope.applicationModule = "Products";
        }

        $scope.importProducts = function () {
            productsService.importProducts($scope.importProductsCompleted, $scope.importProductsError);
        }

        $scope.importProductsCompleted = function (response) {
            alertsService.RenderSuccessMessage(response.ReturnMessage);
        }

        $scope.importProductsError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }

    }]);
});