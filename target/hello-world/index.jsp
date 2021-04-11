<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
    <p><a href="<s:url action='hello'/>">Hello World</a></p>
  </body>
  <body>
    <h2>Login</h2>
    <s:form action="login">
		<s:textfield label="Username" name="person.username" type="text" value=""></s:textfield>
		<s:password label="Password" name="person.password" type="password" value=""></s:password>
		<s:submit value="Login" align="left"></s:submit>
	</s:form>
  </body>
</html>
