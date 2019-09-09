angular.module('app') 
.config(function($routeProvider) {
	
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
	.when('/tags', {
		templateUrl : "views/tags.html",
		controller: 'TagsController'
	})
	.when('/404', {
		templateUrl : "views/404.html"
	})
	.otherwise( {
		redirectTo: '404'
	});

});