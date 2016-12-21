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
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/home.css" type="text/css">
        <link rel="stylesheet" href="css/menu-connectnok.css" type="text/css"/>
        <link rel="stylesheet" href="css/shop-homepage.css"type="text/css" />
    </head>

    <body>
        <header>
            <c:url var="url" value="IndexController?section=MenuMainController" />
            <c:import url="${url}"  />
        </header>

        <div class="col-sm-4 col-lg-4 col-md-4">
            <div class="thumbnail"> 
                <div class="row">
                    <section>
                        <table>
                            <tbody>
                                <tr>
                                    <td>
                                        <a href="IndexController?section=SectionController=${e.imgURL}"></a> 
                                        <strong><th>${nameEvent}</th></strong> 
                                    </td>
                                </tr>                              
                                <tr>
                                    <td id="imageDetailsPage">
                                        <img src="${imgEvent}"/>
                                    </td>
                                    <td>
                                        <strong>${nameEvent}</strong>                   
                                        <fmt:formatDate value="${e.startDate}" var="debutDate" type="date" dateStyle="full"/>${dateStart} 
                                        <fmt:formatDate value="${e.startDate}" var="finDate" type="date" dateStyle="full"/>${dateEnd}
                                        ${synopsisEvent}
                                        ${commentEvent}
                                        <c:forEach items="${e.representationsev}">
                                            <fmt:formatDate value="${e.representationDate}" var="debutDate" pattern="dd/MM/YYYY HH" dateStyle="full"/>${dateRepresentation} ${timeRepresentation}
                                        </c:forEach>
                                        <c:forEach items="¤${r.myvenue}"><!--Attention ici on va recuperer la venue depuis la representation-->
                                            ${typeVenue} <br/>
                                            ${nameVenue} <br/>
                                        </c:forEach>
                                        <c:forEach items="${myadd}"><!--Attention ici on va recuperer l'adresse depuis la venue et la venue depuis la representation-->
                                            ${street} ${postCode} ${city}<br/>
                                            ${mapVenue} <br/>
                                        </c:forEach>
                                    </td>                        
                                <tr>
                                    <td>
                                        <a href="SectionController?thematicBrowsing=retour=ok"><p>Retour</p></a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </section>
                </div>
            </div>
        </div>

        <!-- Footer -->
        <div class="container">        
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <ul class="pagination">
                            <li><a href="#">1</a></li>
                            <li class="active"><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                        </ul>
                    </div>
                </div>
            </footer>
        </div>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>


