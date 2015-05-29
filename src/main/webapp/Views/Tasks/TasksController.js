"use strict";

define(['application-configuration','TasksModalService', 'TasksService','FormDataService','ProcessDefinitionService','GroupService', 'alertsService'], function (app) {
	 app.register.controller('TasksController', ['$location','$cookieStore','$scope','$rootScope','$modal','TasksService','TasksModalService','FormDataService','ProcessDefinitionService','GroupService','alertsService',
	   function ($location,$cookieStore,$scope, $rootScope, $modal, TasksService,TasksModalService, FormDataService, ProcessDefinitionService, GroupService,alertsService) {
	          $scope.initializeController = function(){
		          /* if (typeof  $rootScope.IsloggedIn == 'undefined' || $rootScope.IsloggedIn == false) {
			           	$location.path('Views/Accounts/Login');
			           	return;
		           }*/
	        	  if($cookieStore.get('authtoken')&&!$rootScope.loggedUser){
	        		  $rootScope.loggedUser =  $cookieStore.get('authtoken');
	        	  }
	        	  
		           $scope.loadUserGroups();
			       $scope.loadTasks();
			       $scope.loadDefinitions();
	           }
	          
	          /**
	           * involved owned  assigned
	           *
	           * @type {string}
	           */
	          $scope.tasksType = "assignee";

	          function getTasksQuery() {
	              if ($scope.tasksType == "involved") {
	                  return {"size": 1000, "queryname":"involvedUser","queryvalue": $cookieStore.get('authtoken').username};
	              } else if ($scope.tasksType == "owned") {
	                  return {"size": 1000, "queryname":"owner","queryvalue": $cookieStore.get('authtoken').username};
	              } else if ($scope.tasksType == "unassigned") {
	                  return {"size": 1000, "queryname":"unassigned","queryvalue": true};
	              } else if ($scope.tasksType == "assignee") {
	                  return {"size": 1000, "queryname":"assignee","queryvalue":  $cookieStore.get('authtoken').username};
	              } else {//candidate
	                  return {"size": 1000, "queryname":"candidateUser","queryvalue":  $cookieStore.get('authtoken').username};
	              }
	          }
	          /**
	           * Performs the load of the tasks and sets the tasksType
	           * @param tasksType
	           */
	          $scope.loadTasksType = function (tasksType) {
	              $scope.tasksType = tasksType;
	              $scope.loadTasks();
	          }

	          /**
	           * Loads the tasks
	           */
	          $scope.loadTasks = function () {
	              //$scope.tasks = TasksService.get(getTasksQuery());
	              loadTasks(getTasksQuery());
	          }

	          var loadTasks = function (params) {
	               TasksService.getTasks(params,$scope.tasksInquiryCompleted,$scope.tasksInquiryError);
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
	  	    
	          /**
	           * 加载单个任务-打开模态窗口
	           */
	          $scope.loadTask = function (task) {
	              TasksModalService.loadTaskForm(task);
	        	  /*var modalInstance = $modal.open({
	                  templateUrl: 'taskModalContent.html',
	                  controller: ModalInstanceCtrl,
//	                  controller: 'TaskFormController',

	                  resolve: {
	                      taskDetailed: function () {
	                          return task;
	                      }
	                  }
	              });

	              modalInstance.result.then(function (taskDetailed) {
	              	console.log('Modal then at: ' + new Date());
	              }, function () {
	              	console.log('Modal dismissed at: ' + new Date());
	              });
	              
	              loadTaskForm(task);*/
	          };


	         /* $rootScope.$on('refreshData', function (event, data) {
	              //$scope.deta
	              $scope.loadTasks();

	          });*/

	          /**
	           * Load definitions
	           */
	          $scope.loadDefinitions = function () {
	               ProcessDefinitionService.getLatest(
	            		   function (response,status){
				            	 alertsService.RenderSuccessMessage("获取processes成功！");
				            	 $scope.processes = response;
	               } ,
	               $scope.tasksInquiryError );
	          }

	          /**
	           * starts the process
	           * @param processDefinition
	           */
	          $scope.startTheProcess = function (processDefinition) {

	              TasksModalService.loadProcessForm(processDefinition);

	              FormDataService.getFormdata({"queryname":"processDefinitionId","queryvalue": processDefinition.id}, 
	            		  function (data) {
	            	  console.log(data);
	              }, function (data) {
	                  if (data.data.statusCode == 404) {
	                      alert("there was an error");
	                  }
	              });
	             /* var formService = new FormDataService({processDefinitionId: processDefinition.id});
	              formService.$startTask(function (data) {
	                  console.log(data);
	              });*/
	          };

	          $scope.loadUserGroups = function () {
	             GroupService.get({"member": $cookieStore.get('authtoken').username},
	            		 function (response,status){
			            	 alertsService.RenderSuccessMessage("获取成功！");
				              $scope.userGroups = response;
	             		},$scope.tasksInquiryError
	            		 );
	          }

	          $scope.loadTasksGroups = function (group) {
	              console.log(group);
	              loadTasks({"size": 1000, "candidateGroup": group.id});
	          }
	          
	         
	          
	  }]);
	
});