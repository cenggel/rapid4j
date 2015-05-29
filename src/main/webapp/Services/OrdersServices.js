define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('ordersService', ['ajaxService', function (ajaxService) {

        this.createOrder = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/CreateOrder", successFunction, errorFunction);
        };

        this.createOrderDetailLineItem = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/CreateOrderLineItem", successFunction, errorFunction);
        };

        this.updateOrderDetailLineItem = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/UpdateOrderLineItem", successFunction, errorFunction);
        };

        this.deleteOrderDetailLineItem = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/DeleteOrderLineItem", successFunction, errorFunction);
        };

        this.initializeOrder = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/InitializeOrder", successFunction, errorFunction);
        };

        this.getOrders = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/GetOrders", successFunction, errorFunction);
        };
    
        this.getOrder = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/GetOrder", successFunction, errorFunction);
        };

        this.updateOrder = function (order, successFunction, errorFunction) {
            ajaxService.AjaxPost(order, "/rest/orders/UpdateOrder", successFunction, errorFunction);
        };

    }]);
});