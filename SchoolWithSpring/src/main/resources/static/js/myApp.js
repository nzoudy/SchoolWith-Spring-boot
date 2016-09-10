var app=angular.module("mySchoolApp", []);

app.controller("mySchoolController", function($scope,$http) {
	$scope.student=null;
	$scope.idStudent=null;
	$scope.loadStudent=function(){
		$http.get("/students/"+$scope.idStudent)
		.success(function(data){
			$scope.student=data;
		});
	};
});