"use strict";

define(['application-configuration', 'mainService', 'alertsService'], function (app) {

    app.register.controller('defaultController', ['$cookieStore','$scope',  '$rootScope', 'mainService', 'alertsService', function ($scope,  $rootScope, mainService, alertsService) {

        $rootScope.closeAlert = alertsService.closeAlert;
        //InitializeApplication
        $scope.initializeController = function () {
        	var authtoken = $cookieStore.get('authtoken');
        	var isAuthenicated = false;
        	if(authtoken){
        		isAuthenicated = true;
        	}
            mainService.initializeApplication(isAuthenicated,$scope.initializeApplicationComplete, $scope.initializeApplicationError);           
        }

        $scope.initializeApplicationComplete = function (response)
        {     
            $rootScope.MenuItems = response.MenuItems;
            $rootScope.displayContent = true;
        
            if (response.IsAuthenicated == true) {
                window.location = "/applicationMasterPage.html#/Customers/CustomerInquiry";
            }
            else {       
                
                // set timeout needed to prevent AngularJS from raising a digest error
                setTimeout(function () {
                    window.location = "#Accounts/Login";  
                }, 10);

            }
        }

        $scope.initializeApplicationError = function (response)
        {         
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }

     

    }]);
});


