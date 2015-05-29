/*angular.module('activitiApp').factory('GroupService', function ($resource) {
    var data = $resource('service/identity/groups/:group', {group: "@group"});
    return data;
});*/
define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('GroupService', ['ajaxService', function (ajaxService) {

        this.get = function (data, successFunction, errorFunction) {          
            ajaxService.AjaxGetWithData(data, "/rest/activiti/groups", successFunction, errorFunction);
        };

    }]);
});