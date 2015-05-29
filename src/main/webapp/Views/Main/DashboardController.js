"use strict";

define(['application-configuration', 'TasksService', 'alertsService'], function (app) {

    app.register.controller('dashboardController', ['$cookieStore','$scope', '$rootScope', 'TasksService','alertsService',
        function ($cookieStore,$scope, $rootScope, TasksService,alertsService) {
	    $scope.initializeController = function(){
	    	/*if (typeof  $rootScope.IsloggedIn == 'undefined' || $rootScope.IsloggedIn == false) {
	    		$location.path('Views/Accounts/Login');
	    		return;
	    	}*/
	    	$rootScope.loggedUser =  $cookieStore.get('authtoken');
	    	var data = {"size": 1000, "queryname":"assignee","queryvalue":  $rootScope.loggedUser.username};
	    	$scope.tasks = TasksService.getTasks(data,$scope.tasksInquiryCompleted,$scope.tasksInquiryError);
	    	console.log(" hello ,"+$rootScope.loggedUser.username);
	    	}
	    
	    $scope.tasksInquiryCompleted = function (response, status) {

            alertsService.RenderSuccessMessage("获取成功！");
            $scope.tasks = response;
        }
	    
	    $scope.tasksInquiryError = function (response, status) {
            if (response.IsAuthenicated == false) {
                window.location = "/index.html";
            }
            alertsService.RenderErrorMessage(response.ReturnMessage);
        }
    }]);
});