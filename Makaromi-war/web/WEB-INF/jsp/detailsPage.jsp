<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
        <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>        
        <link rel="stylesheet" href="css/menu-connectnok.css" type="text/css"/> 
        <link rel="stylesheet" href="css/detailsPage.css" type="text/css"/>
        <link href="../../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../../css/shop-homepage.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <header>
            <c:url var="url" value="IndexController?section=MenuMainController" />
            <c:import url="${url}"  />
        </header>
        <div class="col-sm-4 col-lg-4 col-md-4">
            <div class="thumbnail">

                <a href="IndexController?section=SectionController=${myevent.name}"></a> 
                <div class="detailspage">
                    <h1><th>${myevent.name}</th></h1> 
                    <section>
                        <table>
                            <tbody>
                                <tr>
                                    <td>
                                        <div>
                                            <img width="300px" src="${myevent.imgURL}"/>
                                        </div>
                                    </td>
                                    <td>
                                        <div id="texteDetailsPage">                                   
                                            <c:forEach items ="${myevent.artists}" var ="a">
                                                <h5>${a.type} ${a.firstName} ${a.lastName}</h5>           
                                            </c:forEach> <br>
                                            <fmt:formatDate value="${myevent.startDate}" var="debutDate" type="date" dateStyle="full"/>
                                            <p><strong>Début : ${debutDate}</strong></p>
                                            <fmt:formatDate value="${myevent.endDate}" var="finDate" type="date" dateStyle="full"/>
                                            <p><strong>Fin : ${finDate}</strong></p><br>
                                            <p>----------------------------------------------------------------------------------------------------</p><br/>         

                                            <c:forEach items= "${myevent.representationsev}" var = "r">                                                                                    
                                                <p id="representation"><fmt:formatDate value="${r.rDate}" var="dateRepresentation" type="both" dateStyle="full"/>Représentation du ${dateRepresentation} heures</p> 
                                                <p id="boutonCommander"><a href="IndexController?section=DetailsRepresentationController&idRep=${r.id}"><strong>Détail de la représentation</a></strong></p>
                                                <p>----------------------------------------------------------------------------------------------------</p><br/>                                                
                                            </c:forEach>
                                            <c:choose>
                                                <c:when test="${empty myevent.representationsev}">
                                                    <p id="boutonCommander"><a href="IndexController?section=SelectEventDateController"><strong>Commander</a></strong></p>   
                                                </c:when>
                                            </c:choose>
                                        </div>                                             
                                    </td>
                                </tr>
                                <tr><td><br></td></tr>
                                <tr>
                                    <td></td>
                                    <td>                                          
                                        <a href="IndexController?section=SectionController" id="boutonRetour"><strong>Retour</strong></a>
                                    </td>                                            
                                </tr>
                                <tr><td><br></td></tr>

                                </div>
                                </div>
                                </div>
                                </body>
                                </html>


