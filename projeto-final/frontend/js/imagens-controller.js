app.controller('ImagensController', function($scope, $http) {
   
    $scope.imagens=new Object();   

  
    var buscarImagens = function(){
        $http({
            method: 'GET',
            url: 'http://localhost:8080/imagens'
        }).then(function successCallback(response) {
            $scope.imagens = response.data;
        }, function errorCallback(response) {
            console.info("deu ruim");
        });
    }

    $scope.remover = function(id){
        $http({
            method: 'DELETE',
            url: 'http://localhost:8080/imagens/' + id
        }).then(function successCallback(response) {
            $("#imagem_" + id).hide();
        }, function errorCallback(data, status, headers, config, statusText , xhrStatus ) {
            console.info("deu ruim");
        });
    }




    $scope.alerta = function(){
       $http({
            method: 'POST',
            url: 'http://localhost:8080/imagens',
            data: {'url':$scope.url}
        }).then(function successCallback(response) {
            alert("sucesso!!"),
            buscarImagens(),
            $scope.url="";
        }, function errorCallback(data, status, headers, config, statusText , xhrStatus ) {
            console.info("deu ruim");
        });
    }

    var init = function(){
        buscarImagens();
    }

    init();

});