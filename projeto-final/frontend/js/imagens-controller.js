app.controller('ImagensController', function($scope, $http, ImagensService, $rootScope) {

    //Carlos e Vitor dinamizando variaveis  
    $scope.imagens = new Object();
    $scope.albuns = new Object();
    $scope.nomeDoBotao = "Salvar Imagem";
    $scope.url = "";
    $scope.urlModal = "";

    $scope.buscarUmImagens = function () {
        $http({
            method: 'GET',
            url: host + '/imagens/url/' + $scope.pesquisar

        }).then(function successCallback(response) {
            if (response.data != null) {
                ImagensService.imagens = response.data;
                $rootScope.$broadcast('topic', null);

                $scope.imagens.push(response.data);
            } else {
                console.info("deu ruim");
            }
        }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
            console.info("deu ruim");
        });
    }

    var buscarImagens = function() {
        $http({
            method: 'GET',
            url: host + '/imagens'
        }).then(function successCallback(response) {
            $scope.imagens = response.data;
        }, function errorCallback(response) {
            console.info("deu ruim");
        });
    }

    var buscarAlbuns = function() {
        $http({
            method: 'GET',
            url: host + '/albuns'
        }).then(function successCallback(response) {
            $scope.albuns = response.data;
        }, function errorCallback(response) {
            console.info("deu ruim");
        });
    }

    $scope.remover = function(id) {
        $http({
            method: 'DELETE',
            url: host + '/imagens/' + id
        }).then(function successCallback(response) {
            $("#imagem_" + id).hide();
        }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
            console.info("deu ruim");
        });
    }


    $scope.salvar = function() {
        $scope.nomeDoBotao = "Salvar Imagem";
        if ($scope.idImagem == null) {
            $http({
                method: 'POST',
                url: host + '/imagens',
                data: { 'url': $scope.url }
            }).then(function successCallback(response) {
                console.info("sucesso!!"),
                    buscarImagens(),
                    $scope.url = "";
                //$scope.nomeImagem = "Salvar Imagem";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        } else {
            $http({
                method: 'PUT',
                url: host + '/imagens/' + $scope.idImagem,
                data: { 'url': $scope.url }
            }).then(function successCallback(response) {
                console.info("sucesso!!"),
                    buscarImagens(),
                    $scope.url = "";
                // $scope.nomeImagem = "Salvar Imagem";
            }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
                console.info("deu ruim");
            });
        }

    }

    $scope.editar = function(imagem) {
        console.info(imagem);
        $scope.url = imagem.url;
        $scope.idImagem = imagem.id;
        $scope.nomeDoBotao = "Editar Imagem";
    }
    $scope.ampliar = function(imagem) {
        console.info(imagem);
        $scope.urlModal = imagem.url;
    }

    $scope.$on('topic', function (event, objetoGlogal) { 
        $scope.imagens = ImagensService.imagens;
    });

    var init = function() {
        buscarImagens();
        buscarAlbuns();
    }

    init();

});