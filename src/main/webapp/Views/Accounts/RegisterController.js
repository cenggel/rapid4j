"use strict";

define(['application-configuration', 'accountsService', 'alertsService'], function (app) {

    app.register.controller('registerController', ['$cookieStore','$scope', '$rootScope', 'accountsService', 'alertsService',
        function ($cookieStore,$scope, $rootScope, accountsService, alertsService) {

            $rootScope.closeAlert = alertsService.closeAlert;
            $rootScope.alerts = [];

            $scope.initializeController = function () {

                $scope.FirstName = "";
                $scope.LastName = "";
                $scope.UserName = "";
                $scope.EmailAddress = "";
                $scope.Password = "";
                $scope.PasswordConfirmation = "";

            }

            $scope.registerUser = function () {
                var user = $scope.createUser();
                if($scope.Password!=$scope.PasswordConfirmation){
                	alertsService.RenderErrorMessage("两次密码不同!");return
                }
                accountsService.registerUser(user, $scope.registerUserCompleted, $scope.registerUserError);
            }

            $scope.registerUserCompleted = function (response) {
            	if(response.User){
            		//将user信息写入cookie put -get-remove
            		$cookieStore.put('authtoken',response.User);
            		$rootScope.MenuItems = response.MenuItems;       
            		$rootScope.IsloggedIn = true;
            		$rootScope.loggedUser = response.User;
            		window.location = "/applicationMasterPage.html#/Customers/CustomerInquiry";
            	}else{
            		 alertsService.RenderErrorMessage(response.ReturnMessage);
                     $scope.clearValidationErrors();
                     alertsService.SetValidationErrors($scope, response.ValidationErrors);    
            	}
            }

            $scope.registerUserError = function (response) {

                alertsService.RenderErrorMessage(response.ReturnMessage);
                $scope.clearValidationErrors();              
                alertsService.SetValidationErrors($scope, response.ValidationErrors);

            }

            $scope.clearValidationErrors = function () {

                $scope.FirstNameInputError = false;
                $scope.LastNameInputError = false;
                $scope.UserNameInputError = false;
                $scope.EmailAddressInputError = false;
                $scope.PasswordInputError = false;
                $scope.PasswordConfirmationInputError = false;

            }

            $scope.createUser = function () {

                var user = new Object();

                user.firstname = $scope.FirstName;
                user.lastname = $scope.LastName;
                user.username = $scope.UserName;
                user.emailaddress = $scope.EmailAddress;
                user.password = $scope.Password;
                //user.passwordconfirmation = $scope.PasswordConfirmation;
                
                return user;

            }

        }]);
});
