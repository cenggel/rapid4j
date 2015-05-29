define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('UserService', ['ajaxService', function (ajaxService) {

        this.getUser = function (data, successFunction, errorFunction) {          
        	console.log(data);
            ajaxService.AjaxGetWithData(data, "/rest/activiti/tasks", successFunction, errorFunction);
        };

    }]);
});
/*angular.module('activitiApp').factory('UserService', function ($resource) {
    var data = $resource('/service/identity/users/:user', {user: "@user", size: 100});
    return data;
});
*/