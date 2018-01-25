var catApp = angular.module('myCatalogue',[]);
catApp.controller('CatController',function($scope,$http){
	$scope.produits = [];
	$scope.motCle = null;
	$scope.pageCourante = 0;
	$scope.charger = function(){
		if ($scope.motCle == null) {
			$http.get("/all")
			.then(function(response){
				$scope.produits = response.data;
			});
		}
		else{
			$http.get("/ProduitParMC?mc="+$scope.motCle+"&page="+$scope.pageCourante)
		.then(function(response) {
			$scope.produits = response.data;
			$scope.pages = new Array(response.data.totalPages);
		});
	}
};

	$scope.goToPage = function(p){
		$scope.pageCourante = p;
		$scope.charger();
};
});