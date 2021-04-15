<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %><html>
   <head>
      <title>Login</title>
   </head>
   <body>
      <div align="center">
        <h1>User Login Page</h1>
         <s:form action="login">
            <s:textfield label="Username" name="person.username" type="text" value=""></s:textfield>
            <s:password label="Password" name="person.password" type="password" value=""></s:password>
            <s:submit value="Login" align="left"></s:submit>
         </s:form>
      </div>
   </body>
</html>