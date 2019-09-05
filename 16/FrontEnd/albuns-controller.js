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

    $scope.remover = function(id){
        $http({
            method: 'DELETE',
            url: 'http://localhost:8080/albuns/' + id
        }).then(function successCallback(response) {
            console.info("deu bom");
            $("#album_" + id).hide();
        }, function errorCallback(data, status, headers, config, statusText , xhrStatus ) {
            console.info("deu ruim");
        });
    }
   

});