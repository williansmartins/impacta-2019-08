app.controller('AlbunsController', function ($scope, $http) {
    $scope.albuns = new Object();



    $scope.remover = function (id) {
        $http({
            method: 'DELETE',
            url: 'http://172.16.2.7:8080/albuns/' + id
        }).then(function successCallback(response) {
            console.info("deu bom");
            $("#album_" + id).hide();
        }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
            console.info("deu ruim");
        });
    }

    var buscarAlbuns = function () {
        $http({
            method: 'GET',
            url: 'http://172.16.2.7:8080/albuns'
        }).then(function successCallback(response) {
            $scope.albuns = response.data;
        }, function errorCallback(response) {
            console.info("deu ruim");
        });
    }

    $scope.salvarAlbum = function (){
        if ($scope.idAlbum == null) {
            $http({
                method: 'POST',
                url: 'http://172.16.2.7:8080/albuns',
                data: { 'nome': $scope.nomeDoAlbum }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarAlbuns(),
                    $scope.nome = "";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

        else {
            $http({
                method: 'PUT',
                url: 'http://172.16.2.7:8080/albuns/' + $scope.idAlbum,
                data: { 'nome': $scope.nomeDoAlbum }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarAlbuns(),
                    $scope.nome = "";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

    }

    $scope.editar = function (album) {
        console.info(album);
        $scope.nomeDoAlbum = album.nome;
        $scope.idAlbum = album.id;
    }

    var init = function () {
        buscarAlbuns();
    }

    init();

});