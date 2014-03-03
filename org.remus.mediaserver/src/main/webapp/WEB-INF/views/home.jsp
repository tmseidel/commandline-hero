<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<form action="<c:url value="controller/upload" />" method="post" enctype="multipart/form-data">

	   
	<input class='fileInput' type="file" name="file1"  />
	<input class='fileInput' type="file" name="files2"  />
    <input type="text" value="13asdf12eadsf" name="locId"/>

    <input type="submit" />

</form>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
