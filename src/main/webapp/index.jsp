<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>
      <h1>Welcome to my app!</h1>
      <h3>What kind of development environment do you use? Enter your answer below</h3>
        <s:form action="devenviron">
        <s:textfield name="operating_system" label="Operating System"</s:textfield>             <br>
        <s:textfield name="operating_system_version" label="Operating System Version"</s:textfield>
        <br>
        <s:textfield name="notes" label="Notes"</s:textfield>
        <br>
        <s:submit value="submit"></s:submit>
    </s:form>
  </body>
</html>
