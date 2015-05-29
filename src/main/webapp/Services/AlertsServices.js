/**
 * alertsService
 * 统一处理各种提示信息
 */
define(['application-configuration'], function (app) {

    app.register.service('alertsService', ['$rootScope', function ($rootScope) {

        $rootScope.alerts = [];
        $rootScope.MessageBox = "";

        this.SetValidationErrors = function (scope, validationErrors) {

            for (var prop in validationErrors) {
                var property = prop + "InputError";
                scope[property] = true;
            }        

        }

        this.RenderErrorMessage = function (message) {

            var messageBox = formatMessage(message);
            $rootScope.alerts = [];
            $rootScope.MessageBox = messageBox;
            $rootScope.alerts.push({ 'type': 'danger', 'msg': '' });

        };

        this.RenderSuccessMessage = function (message) {

            var messageBox = formatMessage(message);
            $rootScope.alerts = [];
            $rootScope.MessageBox = messageBox;
            $rootScope.alerts.push({ 'type': 'success', 'msg': '' });
        };

        this.RenderWarningMessage = function (message) {

            var messageBox = formatMessage(message);
            $rootScope.alerts = [];
            $rootScope.MessageBox = messageBox;
            $rootScope.alerts.push({ 'type': 'warning', 'msg': '' });
        };

        this.RenderInformationalMessage = function (message) {

            var messageBox = formatMessage(message);
            $rootScope.alerts = [];
            $rootScope.MessageBox = messageBox;
            $rootScope.alerts.push({ 'type': 'info', 'msg': '' });
        };

        this.closeAlert = function (index) {
            $rootScope.alerts.splice(index, 1);
        };

        function formatMessage(message) {
            var messageBox = "";
            if (angular.isArray(message) == true) {
                for (var i = 0; i < message.length; i++) {
                    messageBox = messageBox + message[i] + "<br/>";
                }
            }
            else {
                messageBox = message;
            }

            return messageBox;

        }

    }]);
});