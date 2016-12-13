<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Makaromi - Online Ticketing</title>
        <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
        <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/home.css" type="text/css">
        <link rel="stylesheet" href="css/menu-connectnok.css" type="text/css"/>
    </head>
    <body>

        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />

        <section>
            <p>Bienvenue dans votre magasin.</p>

            <a href="thematicBrowsing.jsp">thematic</a>
        </section>
        
        <c:url var="modal" value="WEB-INF/jsp/modal.jsp" />
        <c:import url="${modal}" />
    </body>
</html>
