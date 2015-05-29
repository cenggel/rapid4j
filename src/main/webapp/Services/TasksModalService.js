/*define(['application-configuration', 'ajaxService'], function (app) {

    app.register.service('TasksModalService', ['ajaxService','FormDataService','TasksService', function (ajaxService) {

        this.getTasks = function (data, successFunction, errorFunction) {          
            ajaxService.AjaxGetWithData(data, "/rest/activiti/tasks", successFunction, errorFunction);
        };

    }]);
});*/
define(['application-configuration','FormDataService', 'TasksService', 'UserService','ProcessInstancesService'], function (app) {
app.register.service('TasksModalService',  ['$rootScope','$modal', 'FormDataService', 'TasksService', 'UserService','ProcessInstancesService', 
    function ($rootScope,$modal, FormDataService, TasksService, UserService,ProcessInstancesService) {

	 //-------------------------------------modal controller--------------------------------
    var ModalInstanceController = function ($scope, $modalInstance, /*moment,*/ taskDetailed) {
        $scope.taskDetailed = taskDetailed;

        function init(){
        	console.log("taskDetails="+taskDetailed);
        	var queryname = "taskId";
        	if(taskDetailed.version){
        		queryname = "processDefinitionId";
        	}
        	if(taskDetailed.processInstanceId){
        		/* <div class="row">
        	        <img ng-src="{{diagram}}" style="    width: 100%;    height: auto;"/>
        	    </div>*/
        		//$scope.diagram = "/service/runtime/process-instances/"+taskDetailed.processInstanceId+"/diagram";
        	}
        	FormDataService.getFormdata({"queryname":queryname,"queryvalue": taskDetailed.id}, function (data) {
        		$scope.task =  extractForm(taskDetailed, data);
        	}, function (data) {
        		if (data.data.statusCode == 404) {
        			alert("there was an error");
        		}
        	});
        }
        init();

        function extractDataFromForm(objectOfReference) {
            var objectToSave = {
                "taskId": objectOfReference.id,
                properties: []
            }
            for (var key in objectOfReference.propertyForSaving) {
                var forObject = objectOfReference.propertyForSaving[key];

                if (!forObject.writable) {//if this is not writeable property do not use it
                    continue;
                }

                if (forObject.value != null) {
                    var elem = {
                        "id": forObject.id,
                        "value": forObject.value
                    };
                    if (typeof forObject.datePattern != 'undefined') {//format
                        var date = new Date(forObject.value);
                        elem.value = date/*moment(date).format(forObject.datePattern.toUpperCase());*/
                    }
                    objectToSave.properties.push(elem);
                }
            }

            return objectToSave;
        }


        function extractDataFromFormForProcess(objectOfReference) {
            var objectToSave = {
                "processDefinitionId": objectOfReference.id,
                variables: []
            }
            for (var key in objectOfReference.propertyForSaving) {
                var forObject = objectOfReference.propertyForSaving[key];

                if (!forObject.writable) {//if this is not writeable property do not use it
                    continue;
                }

                if (forObject.value != null) {

                    console.log(forObject);
                    var elem = {
                        "name": forObject.id,
                        "value": forObject.value
                    };
                    if (typeof forObject.datePattern != 'undefined' && forObject.datePattern!=null) {//format
                        var date = new Date(forObject.value);

                        elem.value = date/*moment(date).utc()*/;
                    }
                    objectToSave.variables.push(elem);
                }
            }

            return objectToSave;
        }

        $scope.finish = function (detailedTask) {

            if (typeof detailedTask.propertyForSaving != "undefined") {
                var objectToSave = extractDataFromForm(detailedTask);
                //TODO:post
                FormDataService.post(objectToSave,function () {
                    emitRefresh();
                    $modalInstance.dismiss('cancel');
                },function(){
                	emitRefresh();
                    $modalInstance.dismiss('cancel');
                });
            } else {
                var action = new TasksService();
                action.action = "complete";
                action.$save({"taskId": detailedTask.id}, function () {
                    emitRefresh();
                    $modalInstance.dismiss('cancel');
                });
            }

        };

        $scope.startProcess = function (detailedTask) {

            if (typeof detailedTask.propertyForSaving != "undefined") {
                var objectToSave = extractDataFromFormForProcess(detailedTask);
                //启动流程，提交起始点表单
                ProcessInstancesService.submitForm(objectToSave,function () {
                    emitRefresh();
                    $modalInstance.dismiss('cancel');
                },null);
            } else {
            	/*
            	 * POST runtime/tasks/{taskId}
            	 * {
            	  "action" : "complete",
            	  "variables" : []
            	}*/
                var action = new TasksService();
                action.action = "complete";
                action.$save({"taskId": detailedTask.id}, function () {
                    emitRefresh();
                    $modalInstance.dismiss('cancel');
                });
            }

        };


        $scope.assignMe = function (detailedTask) {
        	
            TasksService.updateTask({"assignee": $rootScope.username},detailedTask.id, function () {
                emitRefresh();
            },function(){
            	console.log('assign failed!')
            	emitRefresh();
            });

        };

        $scope.takeOwnerShip = function (detailedTask) {
        	TasksService.updateTask({"owner": $rootScope.username},detailedTask.id, function () {
                emitRefresh();
            },function(){
            	console.log('owner failed!')
            	emitRefresh();
            });
        };

        $scope.openDatePicker = function (obj, $event) {
            $event.preventDefault();
            $event.stopPropagation();

            obj.opened = true;
        };

        $scope.setFormEnum = function (enumm, item,showText ) {
            item.value = enumm.id;
            if(typeof showText== 'undefined') {
                item.name = enumm.name;
            }else{
                item.name = showText;
            }
        };

        var emitRefresh = function () {
            $rootScope.$emit("refreshData", {});
        }

        $scope.cancel = function (taskDetailed) {
            $modalInstance.dismiss('cancel');
        };

        //--------------------------------解析function------------------------------------------
        function extractForm(task, data) {
        	var propertyForSaving = {};
        	
        	for (var i = 0; i < data.formProperties.length; i++) {
        		var elem = data.formProperties[i];
        		propertyForSaving[elem.id] = {
        				"value": elem.value,
        				"id": elem.id,
        				"writable": elem.writable
        		};
        		
        		if (elem.datePattern != null) {//if date
        			propertyForSaving[elem.id].opened = false; //for date picker
        			propertyForSaving[elem.id].datePattern = elem.datePattern;
        		}
        		
        		if (elem.required == true && elem.type == "boolean") {
        			if (elem.value == null) {
        				propertyForSaving[elem.id].value = false;
        			}
        		}
        		
        		if(elem.type=="user")
        		{
        			elem.enumValues  =  UserService.getUser();
        		}
        	}
        	
        	task.form = data;
        	task.propertyForSaving = propertyForSaving;
        	
        	return task;
        	
        }
        //-----------------------------------------------
        var loadTaskForm = function (task) {
        	console.log(task);
        	FormDataService.getFormdata({"queryname":"taskId","queryvalue": task.id}, function (data) {
        		$scope.task =  extractForm(task, data);
        	}, function (data) {
        		if (data.data.statusCode == 404) {
        			alert("there was an error");
        		}
        	});
        };
        
        var loadProcessForm = function (processDefinition) {
        	FormDataService.getFormdata({"queryname":"processDefinitionId","queryvalue": processDefinition.id}, function (data) {
        		$scope.task = extractForm(processDefinition, data)
        	}, function (data) {
        		if (data.data.statusCode == 404) {
        			alert("there was an error");
        		}
        	});
        };
        //-----------------------------------------Controller结束-------------------------------------
    };


    //----------------------------------------------打开模态窗口服务---------------------------------
    /**
     * 加载Task
     */    
    this.loadTaskForm = function (task) {
            var modalInstance = $modal.open({
                templateUrl: '/Views/modals/taskForm.html',
                controller: ModalInstanceController,

                resolve: {
                    taskDetailed: function () {
                        return task;
                    }
                }
            });

            modalInstance.result.then(function (taskDetailed) {

            }, function () {

            });
//            loadTaskForm(task);
        };
        /**
         * 加载流程起始表单
         */
        this.loadProcessForm  =  function (processDefinition) {
            var modalInstance = $modal.open({
                templateUrl: 'Views/modals/processDefinitionForm.html',
                controller: ModalInstanceController,

                resolve: {
                    taskDetailed: function () {
                        return processDefinition;
                    }
                }
            });

            modalInstance.result.then(function (taskDetailed) {

            }, function () {

            });
            //loadProcessForm(processDefinition);
        }
        
}]);
});