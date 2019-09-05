app.controller('TagsController', function($scope, $http) {
   
    $scope.tags=new Object();   

  

    $http({
        method: 'GET',
        url: 'http://localhost:8080/tags/'
    }).then(function successCallback(response) {
        console.info(response);
        $scope.tags = response.data;
    }, function errorCallback(response) {
        console.info("deu ruim");
    });

});