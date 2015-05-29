<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Angular Shell</title>   
	<meta charset="UTF-8">
    <script data-main="../main.js" src="../scripts/require.js"></script>      
    <link href="../Content/angular-block-ui.css" rel="stylesheet" />
    <link href="../Content/bootstrap.css" rel="stylesheet" />
    <link href="../Content/Application.css" rel="stylesheet" />
    <link href="../Content/SortableGrid.css" rel="stylesheet" />
   
</head>
                                               
<body onload="init()" ng-controller="indexController" ng-init="initializeController()"  ng-cloak>

    <div class="navbar navbar-inverse navbar-fixed-top" >
        <div class="container">
            <div class="navbar-collapse collapse" id="MainMenu" ng-show="displayContent" style="visibility:hidden">
                <ul class="nav navbar-nav" ng-repeat="menuItem in MenuItems | filter:{module: 'Main'}">
                    <li><a href="{{menuItem.route}}">{{menuItem.description}}</a></li>
                </ul>
                <ul>
                <li> <a href="user/logout">
                                    <i class="fa fa-key"></i> LogOut
                                </a></li>
                </ul>
            </div>
        </div>
    </div>

    <div style="margin: 75px 50px 50px 50px" ng-view></div>

    <script language="JavaScript">

        function init() {

            setTimeout(function () {
                var mainMenu = document.getElementById("MainMenu");          
                mainMenu.style.visibility = 'visible';
                },1000);                    

        }
    </script>
</body>

</html>