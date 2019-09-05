angular
.module('app')
.factory('AlbunsService', AlbunsService);

function AlbunsService ($q, $window, $http) {
    return {

        buscarAlbuns : function () {
            return $http({
                method : "GET",
                url : host + "/albuns",
            })
        },

        inserir : function (album) {
            return $http({
                method : "POST",
                url : host + "/",
                data: {
                    "nome": album.nome,
                    "imagens": album.imagens
                }
            })
        },

        atualizar : function (album) {
            return $http({
                method : "PUT",
                url : host + "/",
                data: {
                    "nome": album.nome,
                    "imagens": album.imagens
                }
            })
        },

        excluir : function (id) {
            return $http({
                method : "DELETE",
                url : host + "/api/v1/conta/"+id
            })
        },

    };
}