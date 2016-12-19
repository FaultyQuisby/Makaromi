<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
        <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/home.css" type="text/css">
        <link rel="stylesheet" href="css/menu-connectnok.css" type="text/css"/>
        <!--  <link href="css/thematicBrowsing.css" rel="stylesheet" type="text/css"/>-->
        <title>RECHERCHE PAR RUBRIQUE</title>


    </head>
    <body>
        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />

        <div class="container">
            <h2>Liste des évènements</h2>    
            <h3>${rubrique}</h3>

            <c:forEach items="${mesevent}" var="e">
                <a href="IndexController?section=SectionController=${e.imgURL}"><p>${e.imgURL}</p><br></a>
               <p>${e.name}</p><br></a>
                <p>Artiste(s) de l'évènement : </p><br>
                <c:forEach items ="${e.artists}" var ="a">
                    <p>Type d'artiste : ${a.type}</p><br>
                    <p>Nom de l'artiste : ${a.firstName} ${a.lastName}</p><br>            
                </c:forEach>
                    <p>Date de début de l'évènement : ${e.startDate}</p><br></a>
                    <p>Date de fin de l'évènement : ${e.endDate}</p><br></a>
            </c:forEach>

            <ul class="pagination">
                <li><a href="#">1</a></li>
                <li class="active"><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
            </ul>
        </div>
    </body>
</html>
