"use strict";

define(['application-configuration'], function (app) {
	 app.register.controller('ModalDemoCtrl', ['$scope', '$rootScope','$modal',
	   function ($scope, $rootScope, $modal) {
	         	         
/*define(['application-configuration'], function (app) {
	 app.register.controller('ModalDemoCtrl', ['$scope', '$modal','$log',
	                                           function ($scope, $modal, $log) {*/

  $scope.items = ['item1', 'item2', 'item3'];

  $scope.open = function (size) {

    var modalInstance = $modal.open({
      templateUrl: 'myModalContent.html',
      controller: ModalInstanceCtrl,
      size: size,
      resolve: {
        items: function () {
          return $scope.items;
        }
      }
    });

    modalInstance.result.then(function (selectedItem) {
      $scope.selected = selectedItem;
    }, function () {
      $log.info('Modal dismissed at: ' + new Date());
    });
  };
 }]);
	 
	 var ModalInstanceCtrl = function ($scope, $modalInstance) {
			
         $scope.ProductCode = "";
         $scope.ProductDescription = "";

         $scope.ok = function (productID) {
             $modalInstance.close(productID);
         };

         $scope.cancel = function () {
             $modalInstance.dismiss('cancel');
         };
         
     };
	 
	 
	 
	 //------------------------------------------------another controller--------------------
	 app.register.controller('ModalInstanceCtrl', ['$scope', '$modalInstance', 
	                                               function ($scope, $modalInstance, items) {

// Please note that $modalInstance represents a modal window (instance) dependency.
// It is not the same as the $modal service used above.
function init(){
	$scope.items = items;
}
init();
  $scope.selected = {
    item: $scope.items[0]
  };

  $scope.ok = function () {
    $modalInstance.close($scope.selected.item);
  };

  $scope.cancel = function () {
    $modalInstance.dismiss('cancel');
  };
	  }]);
});