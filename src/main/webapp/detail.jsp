 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<!DOCTYPE html>
	<html lang="en">
	<head>
		<style type="text/css">
			.space{
				padding-left: 20px;ground: pink;
				border-style: black;

			}



		</style>

		<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">

		<script
		src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>

		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	</head>
	<body>
		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>


					<a class="navbar-brand" href="/">KP</a>
				</div>

				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

					<ul class="nav navbar-nav">
						<li><a href="/#about" >about</a></li>
						<li><a href="/#getintouch" >contact</a></li>
					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li><a href="/mylogin.jsp"> Sing out</a></li>
					</ul>

				</div>
			</div>
		</nav>
		<div class="container">
			<div class="container col-md-6">
				<div class="row">
					<div class="jumbotron">
						<h1>Patient Detail</h1>
						<p>
							Medical ID: ${patient.mediacalNumber}<br> First Name:
							${patient.firstName}<br> Last Name: ${patient.lastName}<br>
							Date: ${patient.appointment}><br> Doctor: ${patient.doctor}<br>
							Email: ${patient.email}<br> Message: ${patient.message}<br>
							<br> <br> <a class="btn btn-success btn-lg"
							href="/#service">Back</a> <br>
						</p>
					</div>
				</div>
			</div>

				<div class="space col-md-6 space">
					<div class="row">
						
						<div class="col-md-6 col-sm-6">
							<div class="thumbnail">
							<img src="https://images.unsplash.com/photo-1505751172876-fa1923c5c528?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60">
							</div>
						</div>
						<div class="col-md-6 col-sm-6">
							<div class="thumbnail">
							<img src="https://images.unsplash.com/photo-1470116945706-e6bf5d5a53ca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60">
							</div>
						</div>
						<div class="col-md-6 col-sm-6">
							<div class="thumbnail">
							<img src="https://images.unsplash.com/photo-1478476868527-002ae3f3e159?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60">
							</div>
						</div>
						<div class="col-md-6 col-sm-6">
							<div class="thumbnail">
							<img src="https://images.unsplash.com/flagged/photo-1551049215-23fd6d2ac3f1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60">
							</div>
						</div>
					</div>
				</div>
			</div>
		</body>
		</html>