"use strict";

define(['application-configuration', 'mainService', 'alertsService'], function (app) {

    app.register.controller('logoutController', ['$cookieStore','$scope', '$rootScope', 'mainService', 'alertsService', 
	function ($cookieStore,$scope, $rootScope, mainService, alertsService) {

        $scope.initializeController = function () {
            mainService.logout($scope.logoutComplete, $scope.logoutError);
        }

        $scope.logoutComplete = function (response) { 
        	$cookieStore.remove('authtoken');
        	$rootScope.IsloggedIn = false;
        	$rootScope.loggedUser = null;
            window.location = "/index.html";
        }

        $scope.logoutError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }

    }]);
});