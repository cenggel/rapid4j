/*
angular.module('activitiApp').factory('TasksService', function ($resource) {
    var data = $resource('service/runtime/tasks/:taskId', {taskId: "@taskId"},{
        update: {method: 'PUT', params: {taskId: "@taskId"}}
    });
    return data;
});
*/
define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('TasksService', ['ajaxService', function (ajaxService) {

        this.getTasks = function (data, successFunction, errorFunction) {          
            ajaxService.AjaxGetWithData(data, "/rest/activiti/tasks", successFunction, errorFunction);
        };
        
        this.updateTask = function (data,taskid, successFunction, errorFunction) {          
        	ajaxService.AjaxPost(data, "/rest/activiti/tasks/"+taskid, successFunction, errorFunction);
        };

    }]);
});