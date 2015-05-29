define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('mainService', ['ajaxService', function (ajaxService) {
                 
        this.initializeApplication = function (isAuthenicated,successFunction, errorFunction) {       
            ajaxService.AjaxGet("/rest/main/InitializeApplication/"+isAuthenicated+"", successFunction, errorFunction);           
        };
    
        this.authenicateUser = function (successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/main/AuthenicateUser", successFunction, errorFunction);
        };

        this.logout = function (successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/main/Logout", successFunction, errorFunction);
        };
    }]);
});