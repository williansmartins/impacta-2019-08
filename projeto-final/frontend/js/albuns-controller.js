app.controller('AlbunsController', function ($scope, $http) {
    $scope.albuns = new Object();
    $scope.albumNome = "Criar album";
     
 

    $scope.remover = function (id) {
        $http({
            method: 'DELETE',
            url: host + '/albuns/' + id
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
            url: host + '/albuns'
        }).then(function successCallback(response) {
            $scope.albuns = response.data;
        }, function errorCallback(response) {
            console.info("deu ruim");
        });
    }

    $scope.salvarAlbum = function (){
        $scope.albumNome = "Criar album";
        if ($scope.idAlbum == null) {
            $http({
                method: 'POST',
                url: host + '/albuns',
                data: { 'nome': $scope.nomeDoAlbum }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarAlbuns(),
                    $scope.nome = "";
                    $scope.albumNome = "Gravar Album";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

        else {
            $http({
                method: 'PUT',
                url: host + '/albuns/' + $scope.idAlbum,
                data: { 'nome': $scope.nomeDoAlbum },
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarAlbuns(),
                    $scope.nome = "";
                    $scope.albumNome = "Gravar Album";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

    }

    $scope.editar = function (album) {
        console.info(album);
        $scope.nomeDoAlbum = album.nome;
        $scope.idAlbum = album.id;
        $scope.albumNome = "Editar";
    }

    var init = function () {
        buscarAlbuns();
    }

    init();

});