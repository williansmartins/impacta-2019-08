var app = angular.module('app', []);
app.controller('AlbunsController', function($scope, $http) {
    $scope.albuns = [
        {
            "id": 1,
            "nome": "minha turma",
            "imagens": [
                {
                    "id": 1,
                    "url": "https://placeimg.com/650/480/nature",
                    "tags": []
                },
                {
                    "id": 2,
                    "url": "https://placeimg.com/940/480/nature",
                    "tags": []
                },
                {
                    "id": 3,
                    "url": "https://placeimg.com/1040/480/nature",
                    "tags": []
                },
                {
                    "id": 1,
                    "url": "https://placeimg.com/640/480/nature",
                    "tags": []
                },
                {
                    "id": 2,
                    "url": "https://placeimg.com/840/480/nature",
                    "tags": []
                },
                {
                    "id": 3,
                    "url": "https://placeimg.com/540/480/nature",
                    "tags": []
                },
                {
                    "id": 1,
                    "url": "https://placeimg.com/640/480/nature",
                    "tags": []
                },
                {
                    "id": 2,
                    "url": "https://placeimg.com/640/880/nature",
                    "tags": []
                },
                {
                    "id": 3,
                    "url": "https://placeimg.com/340/480/nature",
                    "tags": []
                },
                {
                    "id": 1,
                    "url": "https://placeimg.com/740/480/nature",
                    "tags": []
                },
                {
                    "id": 2,
                    "url": "https://placeimg.com/340/480/nature",
                    "tags": []
                },
                {
                    "id": 3,
                    "url": "https://placeimg.com/640/580/nature",
                    "tags": []
                }
            ]
        },
        {
            "id": 2,
            "nome": "minha familia",
            "imagens": [
                {
                    "id": 1,
                    "url": "https://http2.mlstatic.com/peixe-que-nada-de-verdade-nemo-e-dory-unidade-D_NQ_NP_803902-MLB25947605465_092017-O.jpg",
                    "tags": []
                },
                {
                    "id": 2,
                    "url": "https://placeimg.com/640/480/nature",
                    "tags": []
                }
            ]
        }
    ];

    // $('.grid').masonry({
    //     // options
    //     itemSelector: '.grid-item',
    //     columnWidth: 200
    // });

    $http({
        method: 'GET',
        url: 'http://localhost:8080/albuns'
    }).then(function successCallback(response) {
        console.info("deu bom");
        $scope.albuns = response.data;
    }, function errorCallback(response) {
        console.info("deu ruim");
    });


});