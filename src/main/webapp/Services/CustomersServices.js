/**
 * customersService
 * 
 */
define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('customersService', ['ajaxService', function (ajaxService) {

        this.importCustomers = function (successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/customers/ImportCustomers", successFunction, errorFunction);
        };

        this.getCustomers = function (customerInquire, successFunction, errorFunction) {          
            ajaxService.AjaxGetWithData(customerInquire, "/rest/customers/GetCustomers", successFunction, errorFunction);
        };

        this.createCustomer = function (customer, successFunction, errorFunction) {
            ajaxService.AjaxPost(customer, "/rest/customers/CreateCustomer", successFunction, errorFunction);
        };

        this.updateCustomer = function (customer, successFunction, errorFunction) {
            ajaxService.AjaxPost(customer, "/rest/customers/UpdateCustomer", successFunction, errorFunction);
        };
     
        this.getCustomer = function (customerID, successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/customers/GetCustomer/"+customerID, successFunction, errorFunction);
        };

    }]);
});