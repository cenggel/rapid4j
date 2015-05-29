define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('FormDataService', ['ajaxService', function (ajaxService) {
                 
        this.getFormdata = function (data,successFunction, errorFunction) {
            ajaxService.AjaxGetWithData(data,"/rest/activiti/formdata", successFunction, errorFunction);
        };
        
        this.post = function (data,successFunction, errorFunction) {
        	ajaxService.AjaxPost(data,"/rest/activiti/formdata", successFunction, errorFunction);
        };
        
    }]);
});