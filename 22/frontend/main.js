var app = angular.module('app', []);
app.controller('AlbunsController', function($scope) {
    $scope.albuns = [
        {
            "id": 2,
            "nome": "familia",
            "imagem": [
                {
                    "id": 36,
                    "url": "https://vignette.wikia.nocookie.net/pixar/images/1/1f/Dory-white.jpg/revision/latest?cb=20110924203518"
                },
                {
                    "id": 37,
                    "url": "https://vignette.wikia.nocookie.net/pixar/images/1/1f/Dory-white.jpg/revision/latest?cb=20110924203518"
                },
                {
                    "id": 38,
                    "url": "https://vignette.wikia.nocookie.net/pixar/images/1/1f/Dory-white.jpg/revision/latest?cb=20110924203518"
                }
            ]
        },
        {
            "id": 3,
            "nome": "familia",
            "imagem": [
                {
                    "id": 39,
                    "url": "https://vignette.wikia.nocookie.net/pixar/images/1/1f/Dory-white.jpg/revision/latest?cb=20110924203518"
                },
                {
                    "id": 40,
                    "url": "https://vignette.wikia.nocookie.net/pixar/images/1/1f/Dory-white.jpg/revision/latest?cb=20110924203518"
                },
                {
                    "id": 41,
                    "url": "https://vignette.wikia.nocookie.net/pixar/images/1/1f/Dory-white.jpg/revision/latest?cb=20110924203518"
                }
            ]
        }
    ]
    
});