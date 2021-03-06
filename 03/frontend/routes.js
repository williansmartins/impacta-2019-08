angular.module('app') 
.config(function($routeProvider, $locationProvider) {
	
	$routeProvider.when('/', {
		redirectTo: '/imagens'
	})
	.when('/imagens', {
		templateUrl : "views/imagens.html",
		controller: 'ImagensController'
	})
	.when('/albuns', {
		templateUrl : "views/albuns.html",
		controller: 'AlbunsController'
	})
	.when('/404', {
		templateUrl : "views/404.html"
	})
	.otherwise( {
		redirectTo: '404'
	});

	$locationProvider.html5Mode(true);

});