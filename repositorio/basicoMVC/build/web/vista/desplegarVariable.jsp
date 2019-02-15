<%-- 
    Document   : desplegarVariable
    Created on : jun 17, 2018, 9:22:36 p.m.
    Author     : rafae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1>
        variable del alcance request:
        ${mensaje}
        <br>
        <br>
        Variable del alcance session:
        <br>
        Rectangulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br>
        <br>
        <a href="${pageContext.request.contextpath}/index.jsp"></a>
    </body>
</html>
