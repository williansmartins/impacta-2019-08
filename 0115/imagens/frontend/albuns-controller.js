app.controller('AlbunsController', function($scope, $http) {
    $scope.albuns=new Object(); 
      
    $http({
        method: 'GET',
        url: 'http://localhost:8080/albuns'
    }).then(function successCallback(response) {
        console.info("deu bom");
        $scope.albuns = response.data;
    }, function errorCallback(response) {
        console.info("deu ruim");
    });


   

});