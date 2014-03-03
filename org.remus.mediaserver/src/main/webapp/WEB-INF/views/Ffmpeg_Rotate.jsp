<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	${id}
</h1>
<pre>${doc}</pre>

<form action="<c:url value="ffmpeg_rotate/run" />" method="post" enctype="multipart/form-data">

    <label for="in">in</label><input class='fileInput' type="file" name="in"  />
    <label for="rotationType">rotationType</label> <input type="text" value="" name="rotationType"/>
    <label for="out">out</label> <input type="text" value="" name="out"/>

    <input type="submit" />

</form>
</body>
</html>
