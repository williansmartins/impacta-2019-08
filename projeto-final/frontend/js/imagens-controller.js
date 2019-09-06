app.controller('ImagensController', function ($scope, $http) {

    $scope.imagens = new Object();
    $scope.albuns = new Object();


    var buscarImagens = function () {
        $http({
            method: 'GET',
            url: 'http://172.16.2.7:8080/imagens'
        }).then(function successCallback(response) {
            $scope.imagens = response.data;
        }, function errorCallback(response) {
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

    $scope.remover = function (id) {
        $http({
            method: 'DELETE',
            url: 'http://172.16.2.7:8080/imagens/' + id
        }).then(function successCallback(response) {
            $("#imagem_" + id).hide();
        }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
            console.info("deu ruim");
        });
    }


    $scope.salvar = function () {
        if ($scope.idImagem == null) {
            $http({
                method: 'POST',
                url: 'http://172.16.2.7:8080/imagens',
                data: { 'url': $scope.url }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarImagens(),
                    $scope.url = "";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

        else {
            $http({
                method: 'PUT',
                url: 'http://172.16.2.7:8080/imagens/' + $scope.idImagem,
                data: { 'url': $scope.url }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarImagens(),
                    $scope.url = "";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

    }

    $scope.editar = function (imagem) {
        console.info(imagem);
        $scope.url = imagem.url;
        $scope.idImagem=imagem.id;
    }

    $scope.procurarImagem = function (id) {
        console.info(id);
         
        $scope.albuns.forEach(album => {
            
            album.checkbox =false;
            album.imagens.forEach(imagem => {
                if(id == imagem.id){
                    console.info(album.nome);
                    console.info(imagem);
                    console.info("encontrei");
                    album.checkbox = true;
                }
            });
        });
    }

    $scope.adicionarImagem = function (){
        if ($scope.idAlbum == null) {
            $http({
                method: 'PUT',
                url: 'http://172.16.2.7:8080//albuns/',
                data: { 'nome': $scope.nomeDoAlbum }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarAlbuns(),
                    $scope.nome = "";
                    //$scope.album.imagem = id.imagem;
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

        else {
            $http({
                method: 'PUT',
                url: 'http://172.16.2.7:8080/albuns' + $scope.idAlbum,
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

    var init = function () {
    buscarImagens();
    buscarAlbuns();
}

init();

});