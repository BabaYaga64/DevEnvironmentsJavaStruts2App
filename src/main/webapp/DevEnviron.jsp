<!-- This page shows the final output from the database-->

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Development Environments</title>
</head>
<body>
<h1>Struts2 Development Environments</h1>

   DevEnviron, <s:property value="name"/>
   DevEnviron, <s:property value="version"/>
   DevEnviron, <s:property value="os_notes"/>

<p><a href="index.jsp">Return to home page</a>.</p>
</body>

</html>