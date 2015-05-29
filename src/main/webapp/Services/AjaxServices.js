/**
 *  ajaxService.js
 *  封装了ajax常用请求，并在请求过程中使用blcokUI做动画效果
 *  AjaxPost 										正常post
 *  AjaxPostWithNoAuthenication		不校验权限post
 *  AjaxGet										正常get
 *  AjaxGetWithData							传值get[带参数查询]
 *  AjaxGetWithNoBlock					不阻塞get
 *  
 */
define(['application-configuration'], function (app) {

    app.register.service('ajaxService', ['$http', 'blockUI', function ($http, blockUI) {
    	var blocktime = 0;//1000
        // setting timeout of 1 second to simulate a busy server.

        this.AjaxPost = function (data, route, successFunction, errorFunction) {
            blockUI.start();
            setTimeout(function () {
                $http.post(route, data).success(function (response, status, headers, config) {
                    blockUI.stop();
                    successFunction(response, status);
                }).error(function (response) {
                    blockUI.stop();                   
                    if (response.IsAuthenicated == false) { window.location = "/index.html"; }
                    errorFunction(response);
                });
            }, blocktime);

        }

        this.AjaxPostWithNoAuthenication = function (data, route, successFunction, errorFunction) {
            blockUI.start();
            setTimeout(function () {
                $http.post(route, data).success(function (response, status, headers, config) {
                    blockUI.stop();
                    successFunction(response, status);
                }).error(function (response) {
                    blockUI.stop();                 
                    errorFunction(response);
                });
            }, blocktime);

        }

        this.AjaxGet = function (route, successFunction, errorFunction) {
            blockUI.start();
            setTimeout(function () {
                $http({ method: 'GET', url: route }).success(function (response, status, headers, config) {
                    blockUI.stop();
                    successFunction(response, status);
                }).error(function (response) {
                    blockUI.stop();
                    if (response.IsAuthenicated == false) { window.location = "/index.html"; }
                    errorFunction(response);
                });
            }, blocktime);

        }

        this.AjaxGetWithData = function (data, route, successFunction, errorFunction) {
            blockUI.start();
            setTimeout(function () {
                $http({ method: 'GET', url: route, params: data }).success(function (response, status, headers, config) {
                    blockUI.stop();
                    successFunction(response, status);
                }).error(function (response) {
                    blockUI.stop();
                    if (response.IsAuthenicated == false) { window.location = "/index.html"; }
                    errorFunction(response);
                });
            }, blocktime);

        }


        this.AjaxGetWithNoBlock = function (data, route, successFunction, errorFunction) {            
            setTimeout(function () {
                $http({ method: 'GET', url: route, params: data }).success(function (response, status, headers, config) {                 
                    successFunction(response, status);
                }).error(function (response) {                  ;
                    if (response.IsAuthenicated == false) { window.location = "/index.html"; }
                    errorFunction(response);
                });
            }, 0);

        }


    }]);
});


