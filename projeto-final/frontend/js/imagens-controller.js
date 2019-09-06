app.controller('ImagensController', function ($scope, $http) {

    //Carlos e Vitor dinamizando variaveis  
    $scope.imagens = new Object();
    $scope.albuns = new Object();
    $scope.nomeDoBotao = "Salvar Imagem";

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
        $scope.nomeDoBotao = "Salvar Imagem";
        if ($scope.idImagem == null) {
            $http({
                method: 'POST',
                url: 'http://172.16.2.7:8080/imagens',
                data: { 'url': $scope.url }
            }).then(function successCallback(response) {
                alert("sucesso!!"),
                    buscarImagens(),
                    $scope.url = "";
                   //$scope.nomeImagem = "Salvar Imagem";
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
                   // $scope.nomeImagem = "Salvar Imagem";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

    }

    $scope.editar = function (imagem) {
        console.info(imagem);
        $scope.url = imagem.url;
        $scope.idImagem=imagem.id;
        $scope.nomeDoBotao = "Editar Imagem";
    }
    /* $scope.ampliar = function (imagem) {
        console.info(imagem);
        $scope.url = imagem.url;
    } */

    var init = function () {
    buscarImagens();
    buscarAlbuns();
}

init();

});