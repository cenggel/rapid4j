/*angular.module('activitiApp').factory('ProcessDefinitionService', function ($resource) {
    var data = $resource('service/repository/process-definitions/:processDefinitionId', {processDefinitionId: "@processDefinitionId"},{
            update: {method: 'PUT', params: {processDefinitionId: "@processDefinitionId"}}
        }
    );
    return data;
});*/

define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('ProcessDefinitionService', ['ajaxService', function (ajaxService) {
                 
    	 this.getLatest = function (successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/activiti/process-definitions?latest=true", successFunction, errorFunction);
        };
       /* this.getDefById = function (processDefinitionId,successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/activiti/process-definitions/"+processDefinitionId, successFunction, errorFunction);
        };*/
    }]);
});