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
							<h1><a href="#" id="logo">Graphicksmagick_DrawText</a></h1>
							<nav id="nav">
								<a href="<c:url value="/" />">Homepage</a>
								<a href="<c:url value="programs.htm" />" class="current-page-item">Programs</a>
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
					<div class="8u">
						<form action="<c:url value="graphicksmagick_drawtext_run" />" method="post" enctype="multipart/form-data" name="scheduleForm">
						<section>
							<h2>Graphicksmagick_DrawText</h2>
							<div>
								<div>
									  <label for="x">The x position (positive Integer)</label>&nbsp;<input class='fileInput' type="text" name="x"  />
	   								</div>
								<div>
									  <label for="y">The y position (positive Integer)</label>&nbsp;<input class='fileInput' type="text" name="y"  />
	   								</div>
								<div>
									  <label for="text">The text</label>&nbsp;<input class='fileInput' type="text" name="text"  />
	   								</div>
								<div>
									  <label for="color">The color of the text</label>&nbsp;<input class='fileInput' type="text" name="color"  />
	   								</div>
								<div>
									  <label for="fontsize">The size of the text</label>&nbsp;<input class='fileInput' type="text" name="fontsize"  />
	   								</div>
								<div>
									  <label for="file">The input file</label>&nbsp;<input class='fileInput' type="file" name="file"  />
	   								</div>
								<div>
									  <label for="out">The resulting output</label>&nbsp;<input class='fileInput' type="text" name="out"  />
	   								</div>
							</div>
							<a href="#" class="button" onClick="document.scheduleForm.submit();">Submit</a>
							<a href="programs.htm#graphicksmagick_drawtext" class="button">Back</a>
						</section>
					</form>
					
					</div>
					<div class="4u">
						
						<section class="right-content">
							<h2>Documentation</h2>
							<p>Draws text to a certain position</p>
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
