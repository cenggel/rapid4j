define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('productsService', ['ajaxService', function (ajaxService) {

        this.importProducts = function (successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/products/ImportProducts", successFunction, errorFunction);
        };

        this.getProducts = function (product, successFunction, errorFunction) {
            ajaxService.AjaxGetWithData(product, "/rest/products/GetProducts", successFunction, errorFunction);
        };
             
        this.getProductsWithNoBlock = function (product, successFunction, errorFunction) {
            ajaxService.AjaxGetWithNoBlock(product, "/rest/products/GetProducts", successFunction, errorFunction);
        };

        this.createProduct = function (product, successFunction, errorFunction) {
            ajaxService.AjaxPost(product, "/rest/products/CreateProduct", successFunction, errorFunction);
        };

        this.updateProduct = function (product, successFunction, errorFunction) {
            ajaxService.AjaxPost(product, "/rest/products/UpdateProduct", successFunction, errorFunction);
        };

        this.getProduct = function (productID, successFunction, errorFunction) {
            ajaxService.AjaxGetWithData(productID, "/rest/products/GetProduct", successFunction, errorFunction);
        };

    }]);
});