app.controller('TagsController', function($scope, $http) {
   
    $scope.tags=new Object();   

  
    var buscarTags = function(){
        $http({
            method: 'GET',
            url: 'http://localhost:8080/tags'
        }).then(function successCallback(response) {
            $scope.tags = response.data;
        }, function errorCallback(response) {
            console.info("deu ruim");
        });
    }

    $scope.remover = function(id){
        $http({
            method: 'DELETE',
            url: 'http://localhost:8080/tags/' + id
        }).then(function successCallback(response) {
            $("#tags_" + id).hide();
        }, function errorCallback(data, status, headers, config, statusText , xhrStatus ) {
            console.info("deu ruim");
        });
    }

    var init = function(){
        buscarTags();
    }

    init();

});