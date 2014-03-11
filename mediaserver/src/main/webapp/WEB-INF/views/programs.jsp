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
		
		<title>Remus Exec</title>
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
							<h1><a href="#" id="logo">Programs</a></h1>
							<nav id="nav">
								<a href="<c:url value="/" />">Homepage</a>
								<a href="<c:url value="programs.htm" />" class="current-page-item">Programs</a>
								<a href="<c:url value="resources/static/rest.html" />">REST Services</a>
								<a href="<c:url value="resources/static/about.html" />">About</a>
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
		<div id="main" id="top">
			<div class="container">
				<div class="row main-row">
					<div class="4u">

						<section>
							<h2>Programs</h2>
							<ul class="small-image-list">
								<c:forEach items="${programmap}" var="program">
								<li id="top_${program.key}">
									<h4 >${program.key}</h4>
									<ul class="link-list">
										<c:forEach items="${program.value}" var="element">
										<li><a href="#${element.id}">${element.function}</a></li>
										</c:forEach>
									</ul>
								</li>
								</c:forEach>
							</ul>
						</section>
					
					
					</div>
					<div class="8u">
						<c:forEach items="${programmap}" var="program">
						<section class="right-content">
							<a class="comments" href="#top_${program.key}">Top</a>
							<h2>${program.key}</h2>
							<ul class="link-list">
								<c:forEach items="${program.value}" var="element">
								<li >
									<h4 id="${element.id}">${element.function}</h4>
									<p>
									${element.doc}
									</p>
									<p>
									<a href=${element.id}>Open</a>
									</p>
									<!-- 
									<ul class="input-list">
										<c:forEach items="${element.inputParameter}" var="inputs">
										<li>${inputs.key}: ${inputs.value}</li>
										</c:forEach>
										<c:forEach items="${element.outputParameter}" var="outputs">
										<li>${outputs.key}: ${outputs.value}</li>
										</c:forEach>
									</ul>
									 -->
								</li>
								</c:forEach>
							</ul>
						</section>
						</c:forEach>
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