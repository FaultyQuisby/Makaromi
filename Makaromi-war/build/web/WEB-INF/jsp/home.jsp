<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Makaromi - Online Ticketing</title>
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
    </head>
    <body>
        <nav>
            <ul>
                <c:url var="url" value="IndexController?section=MenuConnect" />
                <c:import url="${url}" />
            </ul>
                <c:url var="url03" value="IndexController?section=MenuPanier" />
                <c:import url="${url03}"  />
        </nav>
        <section>
            <p>Bienvenue dans votre magasin.</p>
        </section>
    </body>
</html>
