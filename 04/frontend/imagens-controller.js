var app = angular.module('app', []);

$scope.albuns = new Object();

app.controller('ImagensController', function ($scope, $http) {
    $http({
        method: 'GET',
        url: 'http://localhost:8080/imagens'
    }).then(function successCallback(response) {
        console.info("deu bom");
        $scope.imagens = response.data;
    }, function errorCallback(response) {
        console.info("deu ruim");
    });
    $scope.remover = function(){
        alert("Faz isso não, fi");
    }
});