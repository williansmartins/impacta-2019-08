var app = angular.module('app', []);
app.controller('AlbunsController', function($scope) {
    $scope.albuns = [
        {
            "nome" : "valor1"
        },
        {
            "nome" : "valor2"
        },
        {
            "nome" : "valor3"
        },
        {
            "nome" : "valor4"
        },
        {
            "nome" : "valor5"
        },
        {
            "nome" : "valor6"
        }
    ];

});