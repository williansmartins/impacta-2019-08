app.controller('ImagensController', function($scope, $http) {
    $scope.albuns=new Object(); 
      
    $http({
        method: 'GET',
        url: 'http://localhost:8080/imagens'
    }).then(function successCallback(response) {
        console.info("deu bom");
        $scope.imagens = response.data;
    }, function errorCallback(response) {
        console.info("deu ruim");
    });


   

});