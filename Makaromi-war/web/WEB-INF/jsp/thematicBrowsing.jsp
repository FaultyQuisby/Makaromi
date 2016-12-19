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
        <title>THEMATIC BROWSING</title>
       

    </head>
<body>
   <c:url var="url" value="IndexController?section=MenuMainController" />
   <c:import url="${url}"  />
    
    <div class="container">
        <h2>Liste des évènements</h2>    
        <h3>${rubrique}</h3>
        
          <c:forEach items="${mesevent}" var="e">
                <li><a href="IndexController?section=SectionController=${e.name}">${e.name}</a></li>
                <c:forEach items ="${e.artists}" var ="a">
                ${a.lastName}
                </c:forEach>
          </c:forEach>
        
        
        
        <p>Musée</p>
        <p>Nom de l'évènement : </p>
        <p>Nom de l'artiste de l'évènement : </p>
        <p>Prenom de l'artiste de l'évènement : </p>
        <p>Image de l'évènement : </p>
        <p>Prix de l'évènement : </p>
        <p>Date de début de l'évènement : </p>
        <p>Date de fin de l'évènement : </p>
        <p>Lieu de l'évènement : </p>
        <p>Synopsis de l'évènement : </p>
        <p>Commentaire de l'évènement : </p>
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
