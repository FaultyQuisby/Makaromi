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

        <div class="col-md-9">
            <div class="row carousel-holder">
                <div class="col-md-12">
                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <c:forEach end="0" items="${mesevent}" var="e">
                                <div class="item active">
                                    <img class="slide-image" src="${e.imgURL}" alt="" >
                                </div>
                            </c:forEach>
                            <c:forEach begin="1" items="${mesevent}" var="e">
                                <div class="item">
                                    <img class="slide-image" src="${e.imgURL}" alt="" >
                                </div>
                            </c:forEach>
                        </div>
                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                        </a>
                    </div>
                </div>

            </div>

            <div class="row">

                <c:forEach items="${mesevent}" var="e">
                    <div class="col-sm-4 col-lg-4 col-md-4">
                        <div class="thumbnail">
                            <a href="IndexController?section=SectionController=${e.imgURL}"></a> 
                            <img src="${e.imgURL}" height="150px" width="320px">
                            <div class="caption">                                
                                <h3>${e.name}</h3><br>                                  
                                <div id="texteEvent">                                   
                                    <c:forEach items ="${e.artists}" var ="a">
                                        <p>${a.type} ${a.firstName} ${a.lastName}</p>           
                                    </c:forEach> 
                                    <fmt:formatDate value="${e.startDate}" var="debutDate" type="date" dateStyle="full"/>
                                    <p><strong>Début : ${debutDate}</strong></p>
                                     <fmt:formatDate value="${e.endDate}" var="finDate" type="date" dateStyle="full"/>
                                     <p><strong>Fin : ${finDate}</strong></p>
                                </div>
                            </div>
                            <a href="IndexController?section=DetailsPageController&event=${e.name}" id="details">Voir le détail</a><br>
                            <br>  
                            <br>
                        </div>
                    </div>
                </c:forEach>



                <!-- Footer -->
                <div class="container">        
                    <footer>
                        <div class="row">
                            <div class="col-lg-12">
                                <ul class="pagination">
                                      <c:forEach begin="1" end="${nombredePages}" var="i">
                                                <li><a href="IndexController?section=SectionController&pageDemandee=${i}&th=${th}">${i}</a></li>
                                      </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </footer>
                </div>
                <script src="js/jquery.js"></script>
                <script src="js/bootstrap.min.js"></script>

                </body>
                </html>

      