var app = angular.module('app', ['ngRoute']);

        app.controller('AlertaSearch', ["$scope", function ($scope) {
            $scope.clickMe = function (clicked) {
                    alert($scope.pesquisar);
            };
        }]);