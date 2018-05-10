/**
 * 
 */

var app = angular.module("mymodule", []);

app.controller("firstController", function($scope) {
	$scope.message = "Hello controller";
})

app.controller("dataController", function($scope) {
	
	var listEmployees = [
			{firstName: "abc",lastName: "abc", salary:"20000"},
			{firstName: "bbc",lastName: "bbc", salary:"30000"},
			{firstName: "bbc",lastName: "bbc", salary:"10000"},
			{firstName: "bbc",lastName: "bbc", salary:"40000"}
	];
	
	$scope.employess = listEmployees;
})