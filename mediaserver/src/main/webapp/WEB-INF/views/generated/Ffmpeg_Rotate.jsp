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
							<h1><a href="#" id="logo">Ffmpeg_Rotate</a></h1>
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
		<div id="main">
			<div class="container">
				<div class="row main-row">
					<div class="8u">
						<form action="<c:url value="ffmpeg_rotate_run" />" method="post" enctype="multipart/form-data" name="scheduleForm">
						<section>
							<h2>Ffmpeg_Rotate</h2>
							<div>
								<div>
									  <label for="in">The input file</label>&nbsp;<input class='fileInput' type="file" name="in"  />
	   								</div>
								<div>
									  <label for="rotationType">Possible rotations:
									  		<ul>
									  			<li>0 = 90CounterCLockwise and Vertical Flip (default)</li>
									  			<li>1 = 90Clockwise</li>
									  			<li>2 = 90CounterClockwise</li>
									  			<li>3 = 90Clockwise and Vertical Flip</li>
									  		</ul></label>&nbsp;<input class='fileInput' type="text" name="rotationType"  />
	   								</div>
								<div>
									  <label for="out">wt123</label>&nbsp;<input class='fileInput' type="text" name="out"  />
	   								</div>
							</div>
							<a href="#" class="button" onClick="document.scheduleForm.submit();">Submit</a>
						</section>
					</form>
					
					</div>
					<div class="4u">
						
						<section class="right-content">
							<h2>Documentation</h2>
							<p>Rotates a video.</p>
							<p><a href="http://www.mediaserver/commands/ffmpeg_rotate.htm" target="_blank">Furhter information</a></p>
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
