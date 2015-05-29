/*angular.module('activitiApp').factory('ProcessInstancesService', function ($resource) {
    var data = $resource('service/runtime/process-instances/:processInstance', {processInstance: "@processInstance"});
    return data;
});
*/
define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('ProcessInstancesService', ['ajaxService', function (ajaxService) {

        this.getProcessInstances = function (data, successFunction, errorFunction) {          
        	console.log(data);
            ajaxService.AjaxGetWithData(data, "/rest/activiti/tasks", successFunction, errorFunction);
        };

    }]);
});