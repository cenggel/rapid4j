"use strict";

define(['application-configuration', 'accountsService', 'alertsService'], function (app) {
	//add $cookieStore to store login user when it log in
    app.register.controller('loginController', ['$cookieStore','$scope', '$rootScope', 'accountsService', 'alertsService',
        function ($cookieStore,$scope, $rootScope, accountsService, alertsService) {

            $rootScope.closeAlert = alertsService.closeAlert;
            $rootScope.alerts = [];

            $scope.initializeController = function () {
               
                $scope.UserName = "";               
                $scope.Password = "";

                alertsService.RenderSuccessMessage("Please register if you do not have an account.");

            }

            $scope.login = function () {
                $rootScope.IsloggedIn = false;
                //封装登录字段user，password到user对象
                var user = $scope.createLoginCredentials();
                accountsService.login(user, $scope.loginCompleted, $scope.loginError);
            }

            $scope.loginCompleted = function (response) {
            	if(response.User){
            		//将user信息写入cookie put -get-remove
            		$cookieStore.put('authtoken',response.User);
            		$rootScope.IsloggedIn = true;
            		$rootScope.MenuItems = response.MenuItems;             
            		$rootScope.loggedUser = response.User;
            		window.location = "/applicationMasterPage.html#/Customers/CustomerInquiry";
            	}else{
            		 alertsService.RenderErrorMessage(response.ReturnMessage);
                     $scope.clearValidationErrors();
                     alertsService.SetValidationErrors($scope, response.ValidationErrors);    
            	}
            }

            $scope.loginError = function (response) {

                alertsService.RenderErrorMessage(response.ReturnMessage);
        
                $scope.clearValidationErrors();
                alertsService.SetValidationErrors($scope, response.ValidationErrors);              

            }

            $scope.clearValidationErrors = function () {
              
                $scope.UserNameInputError = false;               
                $scope.PasswordInputError = false;               

            }

            $scope.createLoginCredentials = function () {

                var user = new Object();
               
                user.username = $scope.UserName;              
                user.password = $scope.Password;
             
                return user;

            }

        }]);
});
