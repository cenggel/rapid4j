/**
* require加载入口-SPA入口
* RequireJS的目标是鼓励代码的模块化,它使用了不同于传统<script>标签的脚本加载步骤。可以用它来加速、优化代码
* RequireJS的本质是按需加载js文件
*/
require.config({

    baseUrl: "../",

    // alias libraries paths 给路径加别名
    paths: {
        'application-configuration': 'application-configuration',       
        'angular': 'scripts/angular',
        'angular-route': 'scripts/angular-route',
        'angular-cookies': 'scripts/angular-cookies',//add cookie for logged in user
        'angularAMD': 'scripts/angularAMD',
         'ui-bootstrap' : 'scripts/ui-bootstrap-tpls-0.11.0',
        'blockUI': 'scripts/angular-block-ui',
        'ngload': 'scripts/ngload',       
        'jquery': 'scripts/jquery-1.9.1.min',       
        'mainService': 'Services/MainServices',
        'ajaxService': 'Services/AjaxServices',
        'alertsService': 'Services/AlertsServices',
        'accountsService': 'Services/AccountsServices',
        'TasksService': 'Services/TasksService',//流程任务服务
        'FormDataService': 'Services/FormDataService',//表单数据服务
        'ProcessDefinitionService': 'Services/ProcessDefinitionService',//流程定义服务
        'TasksModalService': 'Services/TasksModalService',//任务模态窗口
        'TaskFormController': 'Views/modals/TaskFormController',//任务模态窗口
        'GroupService': 'Services/GroupService',//组织服务
        'UserService': 'Services/UserService',
        'ProcessInstancesService': 'Services/ProcessInstancesService',
        'customersService': 'Services/CustomersServices',
        'ordersService': 'Services/OrdersServices',
        'productsService': 'Services/ProductsServices',
        'dataGridService': 'Services/DataGridService',         
        'angular-sanitize': 'scripts/angular-sanitize',
        'customersController': 'Views/Shared/CustomersController',
        'productLookupModalController': 'Views/Shared/ProductLookupModalController'
    },

    // Add angular modules that does not support AMD out of the box, put it in a shim
    //shim参数解决了使用非AMD方式定义的模块及其载入顺序
    shim: {
        'angularAMD': ['angular'],
        'angular-route': ['angular'],
        'angular-cookies': ['angular'],
        'blockUI': ['angular'],
        'angular-sanitize': ['angular'],
        'ui-bootstrap': ['angular']
         
    },

    // kick start application 启动依赖
    deps: ['application-configuration']
});
