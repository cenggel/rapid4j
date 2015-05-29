"use strict";

define(['application-configuration', 'accountsService', 'alertsService'], function (app) {

    app.register.controller('myAccountController', ['$cookieStore','$scope', '$rootScope', 'accountsService', 'alertsService',
        function ($cookieStore,$scope, $rootScope, accountsService, alertsService) {

            $rootScope.closeAlert = alertsService.closeAlert;        
            $rootScope.applicationModule = "Main";
            $rootScope.alerts = [];

            $scope.initializeController = function () {

                $scope.FirstName = "";
                $scope.LastName = "";
                $scope.UserName = "";
                $scope.EmailAddress = "";
                $scope.Password = "";
                $scope.PasswordConfirmation = "";
				var userid = $cookieStore.get('authtoken').id;
				if(!userid){
					userid=1;
				}
                accountsService.getUser(userid, $scope.getUserCompleted, $scope.getUserError);

            }
        
            $scope.getUserCompleted = function (response) {

                $scope.clearValidationErrors();

                $scope.FirstName = response.User.firstname;
                $scope.LastName = response.User.lastname;
                $scope.UserName = response.User.username;
                $scope.EmailAddress = response.User.emailaddress;
                $scope.Password = response.User.password;
                $scope.PasswordConfirmation = response.User.password;

            }

            $scope.getUserError = function (response) {

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
                user.userid =  $cookieStore.get('authtoken').userid;
                user.firstname = $scope.FirstName;
                user.lastname = $scope.LastName;
                user.username = $scope.UserName;
                user.emailaddress = $scope.EmailAddress;
                user.password = $scope.Password;
                //user.passwordconfirmation = $scope.PasswordConfirmation;

                return user;

            }

            $scope.updateUser = function () {
                var user = $scope.createUser();
                if($scope.Password!=$scope.PasswordConfirmation){
                	alertsService.RenderErrorMessage("两次密码不同!");return
                }
                accountsService.updateUser(user, $scope.updateUserCompleted, $scope.updateUserError);
            }

            $scope.updateUserCompleted = function (response) {
                $scope.clearValidationErrors();
                alertsService.RenderSuccessMessage(response.ReturnMessage);               
            }

            $scope.updateUserError = function (response) {

                alertsService.RenderErrorMessage(response.ReturnMessage);
                $scope.clearValidationErrors();              
                alertsService.SetValidationErrors($scope, response.ValidationErrors);

            }

        }]);
});
