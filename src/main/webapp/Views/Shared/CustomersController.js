"use strict";
//严格模式,注意,只在第一行有效
/**
 * 
 * customerInquiryController
 */
define(['application-configuration', 'customersService', 'alertsService', 'dataGridService'], function (app) {

    app.register.controller('customerInquiryController', ['$scope', '$rootScope', 'customersService', 'alertsService', 'dataGridService',
        function ($scope, $rootScope, customerService, alertsService, dataGridService) {

            $scope.initializeController = function (customerLink, applicationModule) {              

                $scope.customerLink = customerLink;

                $rootScope.applicationModule = applicationModule;

                dataGridService.initializeTableHeaders();

                dataGridService.addHeader("Customer Code", "CustomerCode");
                dataGridService.addHeader("Company Name", "CompanyName");
                dataGridService.addHeader("Address", "Address");
                dataGridService.addHeader("City", "City");
                dataGridService.addHeader("Region", "Region");
                dataGridService.addHeader("Postal Code", "PostalCode");

                $scope.tableHeaders = dataGridService.setTableHeaders();
                $scope.defaultSort = dataGridService.setDefaultSort("Company Name");

                $scope.changeSorting = function (column) {

                    dataGridService.changeSorting(column, $scope.defaultSort, $scope.tableHeaders);

                    $scope.defaultSort = dataGridService.getSort();
                    $scope.SortDirection = dataGridService.getSortDirection();
                    $scope.SortExpression = dataGridService.getSortExpression();
                    $scope.CurrentPageNumber = 1;

                    $scope.getCustomers();

                };


                $scope.setSortIndicator = function (column) {
                    return dataGridService.setSortIndicator(column, $scope.defaultSort);
                };

                $scope.CustomerCode = "";
                $scope.CompanyName = "";

                $scope.PageSize = 15;
                $scope.SortDirection = "ASC";
                $scope.SortExpression = "CompanyName";
                $scope.CurrentPageNumber = 1;

                $rootScope.closeAlert = dataGridService.closeAlert;

                $scope.customers = [];

                $scope.getCustomers();

            }

            $scope.customerInquiryCompleted = function (response, status) {

                alertsService.RenderSuccessMessage(response.ReturnMessage);
                $scope.customers = response.Customers;
                $scope.TotalCustomers = response.TotalRows;
                $scope.TotalPages = response.TotalPages;
            }
			
			/* 点击查询按钮 */
            $scope.searchCustomers = function () {
                $scope.CurrentPageNumber = 1;
				/* scope in scope */
				$scope.CustomerCode = this.CustomerCode;
                $scope.CompanyName = this.CompanyName;
                $scope.getCustomers();
            }

            $scope.pageChanged = function () {
                $scope.getCustomers();
            }

            $scope.getCustomers = function () {
                var customerInquiry = $scope.createCustomerInquiryObject();
                customerService.getCustomers(customerInquiry, $scope.customerInquiryCompleted, $scope.customerInquiryError);
            }

            $scope.customerInquiryError = function (response, status) {
                if (response.IsAuthenicated == false) {
                    window.location = "/index.html";
                }
                alertsService.RenderErrorMessage(response.ReturnMessage);
            }

            $scope.resetSearchFields = function () {
                $scope.CustomerCode = "";
                $scope.CompanyName = "";
                $scope.getCustomers();
            }

            $scope.createCustomerInquiryObject = function () {

                var customerInquiry = new Object();

                customerInquiry.customercode = $scope.CustomerCode;
                customerInquiry.companyname = $scope.CompanyName;
                customerInquiry.currentpagenumber = $scope.CurrentPageNumber;
                customerInquiry.sortexpression = $scope.SortExpression;
                customerInquiry.sortdirection = $scope.SortDirection;
                customerInquiry.pagesize = $scope.PageSize;

                return customerInquiry;
            }


        }]);

});
