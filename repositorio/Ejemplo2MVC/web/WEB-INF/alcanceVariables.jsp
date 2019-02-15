<%-- 
    Document   : alcanceVariables
    Created on : jun 17, 2018, 11:41:52 p.m.
    Author     : rafae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables </title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br>
        Variable request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br><br>
        Variable session:
        Base: ${rectanguloSession.base}
        Altura: ${rectanguloSession.altura}
        Area: ${rectanguloSession.area}
        
        <br><br>
        Variable application:
            Base: ${rectanguloApplication.base}
            Altura: ${rectanguloApplication.altura}
            Area:${rectanguloApplication.area}
            <br><br>
            <a href="${pageContext.request.contexrt}/index.jps">
            </a>
    </body>
</html>
