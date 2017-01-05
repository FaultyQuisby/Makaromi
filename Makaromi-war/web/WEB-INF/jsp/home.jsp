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
        <c:url var="url" value="IndexController?section=jeutestcontroller" />


        <section>
            <p color="white"><a href="IndexController?section=jeutestcontroller">jeu de test</a>
            <br> <a href="" class="modal-link" id="pickDateTimeButton" >selection d'un event (faux bouton provisoire)</a>
            </p>
        </section>
        
        
        <section class="bandeauBienvenue">           
            <h1>Bienvenue sur Makaromi</h1><br>
            <p>Votre billeterie en ligne</p><br>          
        </section>

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
                                <div class="item active">
                                    <img class="slide-image" src="images/makaromi.jpg" alt="" >
                                </div>
                                <div class="item">
                                    <img class="slide-image" src="images/event4Beyonce.jpg" alt="" >
                                </div>
                             <div class="item">
                                    <img class="slide-image" src="images/event2RedHot.jpg" alt="" >
                                </div>
                            <div class="item">
                                    <img class="slide-image" src="images/event13Magritte.jpg" alt="" >
                                </div>
                            <div class="item">
                                    <img class="slide-image" src="images/event14Norman.jpg" alt="" >
                                </div>
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

                </body>
                </html>
