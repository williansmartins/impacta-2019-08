angular
.module('app')
.factory('ImagensService', ImagensService);

function ImagensService ($q, $window, $http) {
    var imagens = "";

    return {

        metodo1 : function () {
            return $http({
                method : "GET",
                url : host + "/imagens"
            })
        },

        metodo2 : function (objeto) {
            return $http({
                method : "POST",
                url : host + "/imagens",
                data: objeto
            })
        },

    };
}