<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<!--
	Minimaxing 3.1 by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		
		<title>Commandline-Hero</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href="http://fonts.googleapis.com/css?family=Ubuntu+Condensed" rel="stylesheet">
		<script src="<c:url value="resources/js/jquery.min.js" />"></script>
		<script src="<c:url value="resources/js/config.js" />"></script>
		<script src="<c:url value="resources/js/skel.min.js" />"></script>
		<script src="<c:url value="resources/js/skel-panels.min.js" />"></script>
		<noscript>
			<link rel="stylesheet" href="<c:url value="resources/css/skel-noscript.css" />" />
			<link rel="stylesheet" href="<c:url value="resources/css/style.css" />" />
			<link rel="stylesheet" href="<c:url value="resources/css/style-desktop.css" />" />
		</noscript>
		
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
	</head>
	<body>
	<!-- ********************************************************* -->
		<div id="header-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u">
						
						<header id="header">
							<h1><a href="#" id="logo">Commandline-Hero</a></h1>
							<nav id="nav">
								<a href="<c:url value="/" />" class="current-page-item">Homepage</a>
								<a href="<c:url value="programs.htm" />">Programs</a>
							</nav>
						</header>
					
					</div>
				</div>
			</div>
		</div>
		<div id="banner-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u" style="height:20px;">
					
						
					</div>
				</div>
			</div>
		</div>
		<div id="main">
			<div class="container">
				<div class="row main-row">
					<div class="4u">

						<section>
							<h2>Finished Jobs</h2>
							<!-- <a class="comments" href="#">See all</a> -->
							<c:if test="${empty finishedJobs}">
								<h4>No Jobs</h4>
							</c:if>
							<ul class="small-image-list">
								<c:forEach items="${finishedJobs}" var="job">
								<li>
									<h4>${job.metaId} - ${job.finishedDate}</h4>
									<ul class="input-list">
										<c:forEach items="${job.inputs}" var="element">
										<li>${element.key}: ${element.value}</li>
										</c:forEach>
										<c:forEach items="${job.outputs}" var="element">
										<li>Results: <a href="${element.value }">${element.key}</a></li>
										</c:forEach>
										<c:if test="${job.executionResult.returnCode > 0}">
										<li style="color:red;">${job.executionResult.description}</li>
										</c:if>
									</ul>
								</li>
								</c:forEach>
							</ul>
						</section>
					
					
					</div>
					<div class="4u">

						<section>
							<h2>Running Jobs</h2>
							<!-- <a class="comments" href="#">See all</a> -->
							<c:if test="${empty runningJobs}">
								<h4>No Jobs</h4>
							</c:if>
							<ul class="small-image-list">
								<c:forEach items="${runningJobs}" var="job">
								<li>
									<h4>${job.metaId} - ${job.scheduledDate}</h4>
									<ul class="input-list">
										<c:forEach items="${job.inputs.entrySet}" var="element">
										<li>${element.key}: ${element.value}</li>
										</c:forEach>
										<c:forEach items="${job.outputs.entrySet}" var="element">
										<li>Results: <a href="${element.value }">${element.key}</a></li>
										</c:forEach>
									</ul>
								</li>
								</c:forEach>
							</ul>
						</section>
					
					
					</div>
					<div class="4u">
						
						<section class="right-content">
							<h2>About this website</h2>
							<p>This website is the server-runtime</p>
						</section>
					
					</div>
					
				</div>
			</div>
		</div>
		<div id="footer-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u">

						<div id="copyright">
							&copy; Tom Seidel - Remus Software. All rights reserved. | Design: <a href="http://html5up.net">HTML5 UP</a>
						</div>

					</div>
				</div>
			</div>
		</div>
	<!-- ********************************************************* -->
	</body>
</html>