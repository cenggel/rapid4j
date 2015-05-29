"use strict";

define(['angularAMD', 'angular-route', 'angular-cookies','ui-bootstrap', 'angular-sanitize', 'blockUI', ], function (angularAMD) {
    //新增ngCookies依赖，对Cookie操作
	var app = angular.module("mainModule", ['ngRoute', 'ngCookies','blockUI', 'ngSanitize', 'ui.bootstrap']);
   
	//自定义补零的filter
    app.filter("leadingZeroes", function () {
        return function (data) {
            var pad = "000" + data;
            pad = pad.substr(pad.length - 3);
            return pad;
        }
    });
   

    app.config(function ($httpProvider) {
        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
        $httpProvider.defaults.withCredentials = true;
    });

    app.config(function (blockUIConfigProvider) {

        // Change the default overlay message
        blockUIConfigProvider.message("executing...");
        // Change the default delay to 100ms before the blocking is visible
        blockUIConfigProvider.delay(1);
        // Disable automatically blocking of the user interface
        blockUIConfigProvider.autoBlock(false);

    });

    app.config(['$routeProvider', function ($routeProvider) {
   
        $routeProvider

           .when("/", angularAMD.route({
                         
                templateUrl: function (rp) {  return '../Views/Main/default.html';  },               
                controllerUrl: "../Views/Main/DefaultController"            

            }))

            .when("/:section/:tree", angularAMD.route({

                templateUrl: function (rp) { return '../Views/' + rp.section + '/' + rp.tree + '.html'; },

                resolve: {

                    load: ['$q', '$rootScope', '$location', function ($q, $rootScope, $location) {

                        var path = $location.path();
                        var parsePath = path.split("/");
                        var parentPath = parsePath[1];
                        var controllerName = parsePath[2];

                        var loadController = "../Views/" + parentPath + "/" + controllerName + "Controller";                 

                        var deferred = $q.defer();
                        require([loadController], function () {
                            $rootScope.$apply(function () {
                                deferred.resolve();
                            });
                        });
                        return deferred.promise;
                    }]
                }

            }))

            .when("/:section/:tree/:id", angularAMD.route({

                templateUrl: function (rp) { return '../Views/' + rp.section + '/' + rp.tree + '.html'; },

                resolve: {

                    load: ['$q', '$rootScope', '$location', function ($q, $rootScope, $location) {

                        var path = $location.path();
                        var parsePath = path.split("/");
                        var parentPath = parsePath[1];
                        var controllerName = parsePath[2];

                        var loadController = "../Views/" + parentPath + "/" + controllerName + "Controller";
                                             
                        var deferred = $q.defer();
                        require([loadController], function () {
                            $rootScope.$apply(function () {
                                deferred.resolve();
                            });
                        });
                        return deferred.promise;
                    }]
                }

            }))


            .otherwise({ redirectTo: '../' }) 

    }]);

    //主页
    var indexController = function ($cookieStore,$scope, $rootScope, $http, $location, blockUI) {
             
        $scope.$on('$routeChangeStart', function (scope, next, current) {
             
            if ($rootScope.IsloggedIn==true)
            {               
                $scope.authenicateUser($location.path(),$scope.authenicateUserComplete, $scope.authenicateUserError);
            }
         
        });

        $scope.$on('$routeChangeSuccess', function (scope, next, current) {
         
            setTimeout(function () {
                if ($scope.isCollapsed == true) {                   
                    set95PercentWidth();
                }              
            }, 1000);
         

        });


        $scope.initializeController = function () {
            $rootScope.displayContent = false;
            //通过授权的token来确定cookie中的user是否已登录
            if ($location.path() != "")        
            {       
            	var authtoken = $cookieStore.get('authtoken');
            	var isAuthenicated =false;
            	if(authtoken){
            		console.log('user logged!')
            		isAuthenicated = true;
            	}else{
            		console.log('user not log!')
            	}
                $scope.initializeApplication(isAuthenicated,$scope.initializeApplicationComplete, $scope.initializeApplicationError);
            }
        }

        $scope.initializeApplicationComplete = function (response) {
            $rootScope.MenuItems = response.MenuItems;
            $rootScope.MenuItems = response.MenuItems;
            $rootScope.displayContent = true;
            $rootScope.loggedUser = response.User;
        }

        $scope.initializeApplication = function (isAuthenicated,successFunction, errorFunction) {
            blockUI.start();           
            $scope.AjaxGet("/rest/main/InitializeApplication/"+isAuthenicated+"", successFunction, errorFunction);
            blockUI.stop();
        };
        /**
         * 对route的路径和当前登录人进行鉴权
         */      
        $scope.authenicateUser = function (route, successFunction, errorFunction) {
            var authenication = new Object();
            authenication.route = route;
            $scope.AjaxGetWithData(authenication, "/rest/main/AuthenicateUser", successFunction, errorFunction);
        };
           
        $scope.authenicateUserComplete = function (response) {
           
            if (response.IsAuthenicated==false)               
                window.location = "../index.html";
        }

        $scope.authenicateUserError = function (response) {
            alert("ERROR= "+response.IsAuthenicated);
        }

        $scope.AjaxGet = function (route, successFunction, errorFunction) {         
            setTimeout(function () {
                $http({ method: 'GET', url: route }).success(function (response, status, headers, config) {                 
                    successFunction(response, status);
                }).error(function (response) {                  
                    errorFunction(response);
                });
            }, 1);

        }   

        $scope.AjaxGetWithData = function (data, route, successFunction, errorFunction) {
            setTimeout(function () {
                $http({ method: 'GET', url: route, params: data }).success(function (response, status, headers, config) {
                    successFunction(response, status);
                }).error(function (response) {
                    errorFunction(response);
                });
            }, 1);

        }

    };
    //inject
    indexController.$inject = ['$cookieStore','$scope', '$rootScope', '$http', '$location', 'blockUI'];
    app.controller("indexController", indexController);
  
    // Bootstrap Angular when DOM is ready
    angularAMD.bootstrap(app);

  
    return app;
});


