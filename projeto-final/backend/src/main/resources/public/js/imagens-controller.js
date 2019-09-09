app.controller('ImagensController', function($scope, $http, ImagensService, $rootScope) {
    $scope.imagens = new Object();
    $scope.albuns = new Object();
    $scope.idImagem;
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
    $scope.buscarUm = function (id) {
        $http({
            method: 'GET',
            url: 'http://172.16.2.7:8080/albuns/' + id,
            data: { 'id': id }
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
    }

    $scope.procurarImagem = function (id) {
        console.info(id);
        $scope.albuns.forEach(album => {

            album.checkbox = false;
            album.imagens.forEach(imagem => {
                if (id == imagem.id) {
                    console.info(album.nome);
                    console.info(imagem);
                    console.info("encontrei");
                    album.checkbox = true;
                }
            });
        });
    }

    $scope.pegarId = function (id) {
        $scope.idImagem = id;
        console.info($scope.idImagem);
        return id;
    }

    $scope.adicionarImagem = function (albumId) {
        $http({
            method: 'PUT',
            url: 'http://172.16.2.7:8080/albuns/' + albumId + '/adicionar',
            data: { 'id': $scope.idImagem }
        }).then(function successCallback(response) {
            
            console.info("Sucesso");
        }, function errorCallback(data, status, headers, config, statusText, xhrStatus) {
            console.info("deu ruim");
        });
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
        $scope.nomeDoBotao = "Editar Imagem";
    }

    init();

});