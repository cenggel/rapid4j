"use strict";
// customerMaintenanceController.js
define(['application-configuration', 'customersService', 'alertsService'], function (app) 
{
    app.register.controller('customerMaintenanceController', 
    ['$scope', '$rootScope', '$routeParams', 'customersService', 'alertsService',

    function ($scope, $rootScope, $routeParams, customerService, alertsService) 
    {
        $scope.initializeController = function () {
    
            var customerID = ($routeParams.id || "");
           
            $rootScope.alerts = [];
            $scope.CustomerID = customerID;
    
            if (customerID == "") {
                $scope.CustomerCode = "";
                $scope.CompanyName = "";
                $scope.Address = "";
                $scope.City = "";
                $scope.Region = "";
                $scope.PostalCode = "";
                $scope.CountryCode = "";
                $scope.PhoneNumber = ""
                $scope.WebSiteURL = "";
             
                $scope.EditMode = true;
                $scope.DisplayMode = false;
                $scope.ShowCreateButton = true;
                $scope.ShowEditButton = false;
                $scope.ShowCancelButton = false;
                $scope.ShowUpdateButton = false;
              
            }
            else
            {
                var customer = new Object();
                customer.CustomerID = customerID;
                customerService.getCustomer(customer, 
                                $scope.getCustomerCompleted, 
                                $scope.getCustomerError);
            }
          
        }

        $scope.getCustomerCompleted = function (response) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.ShowUpdateButton = false;

            $scope.CustomerCode = response.Customer.CustomerCode;
            $scope.CompanyName = response.Customer.CompanyName;
            $scope.Address = response.Customer.Address;
            $scope.City = response.Customer.City;
            $scope.Region = response.Customer.Region;
            $scope.PostalCode = response.Customer.PostalCode;
            $scope.CountryCode = response.Customer.Country;
            $scope.PhoneNumber = response.Customer.PhoneNumber;
            $scope.WebSiteURL = response.Customer.WebSiteUrl;          
        }

        $scope.getCustomerError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }
        
  
        $scope.createCustomer = function () {          
            var customer = $scope.createCustomerObject();
            customerService.createCustomer(customer, 
                                            $scope.createCustomerCompleted, 
                                            $scope.createCustomerError);
        }
      
        $scope.createCustomerCompleted = function (response, status) {

            $scope.EditMode = false;
            $scope.DisplayMode = true;
            $scope.ShowCreateButton = false;
            $scope.ShowEditButton = true;
            $scope.ShowCancelButton = false;
            $scope.CustomerID = response.Customer.CustomerID;

            alertsService.RenderSuccessMessage(response.ReturnMessage);

            $scope.setOriginalValues();
        }

        $scope.createCustomerError = function (response) {
            alertsService.RenderErrorMessage(response.ReturnMessage);
            $scope.clearValidationErrors();
            alertsService.SetValidationErrors($scope, response.ValidationErrors);
        }
    
        $scope.createCustomerObject = function () {

            var customer = new Object();

            customer.CustomerCode = $scope.CustomerCode;
            customer.CompanyName = $scope.CompanyName;
            customer.Address = $scope.Address;
            customer.City = $scope.City;
            customer.Region = $scope.Region;
            customer.PostalCode = $scope.PostalCode;
            customer.Country = $scope.CountryCode;
            customer.PhoneNumber = $scope.PhoneNumber;
            customer.WebSiteUrl = $scope.WebSiteURL;

            return customer;
        }

        $scope.clearValidationErrors = function () {
            $scope.CustomerCodeInputError = false;
            $scope.CompanyNameInputError = false;          
        }
      
    }]);
});
