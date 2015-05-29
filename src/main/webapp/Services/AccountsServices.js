/**
 * 账户服务
 * 
 * tips:如果模块有依赖,define的第一个参数应该是依赖名字的数组,第二个参数应该是函数定义
 */
define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('accountsService', ['ajaxService', function (ajaxService) {

    	/**
    	 * 注册用户
    	 */
        this.registerUser = function (user, successFunction, errorFunction) {
            ajaxService.AjaxPostWithNoAuthenication(user, "/rest/accounts/RegisterUser", successFunction, errorFunction);
        };

        /**
         * 登录
         */
        this.login = function (user, successFunction, errorFunction) {
            ajaxService.AjaxPostWithNoAuthenication(user, "/rest/accounts/Login", successFunction, errorFunction);
        };

        /**
         * 获取用户
         */
        this.getUser = function (userid,successFunction, errorFunction) {
            ajaxService.AjaxGet("/rest/accounts/GetUser/"+userid, successFunction, errorFunction);
        };        

        /**
         * 更新用户
         */
        this.updateUser = function (user, successFunction, errorFunction) {
            ajaxService.AjaxPost(user, "/rest/accounts/UpdateUser", successFunction, errorFunction);
        };

    }]);
});