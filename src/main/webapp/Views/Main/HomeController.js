"use strict";
/**
 * RequireJS 使用define来定义模块
 */
define(['application-configuration'], function (app) {

    app.register.controller('homeController', ['$scope', '$rootScope', function ($scope, $rootScope) {

        $rootScope.applicationModule = "Main";

    }]);

});
/**
* scope与rootscope的区别
* scope是html和单个controller之间的胶水，model和view之间的数据绑定通过它完成。
* rootscope是各个controller中scope的根。用rootscope定义的值，可以在各个controller中使用。
* 作用域的差别。
*/