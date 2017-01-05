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
        <link href="css/detailsRepresentation.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <!-- Elément Google Maps indiquant que la carte doit être affiché en plein écran et
        qu'elle ne peut pas être redimensionnée par l'utilisateur -->
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <!-- Inclusion de l'API Google MAPS -->
        <!-- Le paramètre "sensor" indique si cette application utilise détecteur pour déterminer la position de l'utilisateur -->
        <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
        <script type="text/javascript">
            function initialiser() {
                var latlng = new google.maps.LatLng(46.779231, 6.659431);
                //objet contenant des propriétés avec des identificateurs prédéfinis dans Google Maps permettant
                //de définir des options d'affichage de notre carte
                var options = {
                    center: latlng,
                    zoom: 19,
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                };

                //constructeur de la carte qui prend en paramêtre le conteneur HTML
                //dans lequel la carte doit s'afficher et les options
                var carte = new google.maps.Map(document.getElementById("carte"), options);
            }

            //création du marqueur
            var marqueur = new google.maps.Marker({
                position: new google.maps.LatLng(46.779231, 6.659431),
                map: carte
            });
        </script>

    </head>

    <body onload="initialiser()">
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
                                        <a href="IndexController?section=SectionController=${myevent.representationsev.venue}"></a> 
                                        <strong>${myevent.name}</strong> 
                                    </td>

                                </tr>                              
                                <tr>

                                    <td id="imageDetailsPage">
                                        <img src="${myevent.imgURL}"/>
                                    </td>

                                    <td>
                                        <div id="texteEvent">    

                                            <c:forEach items ="${myevent.artists}" var ="a">
                                                <p>${a.type} ${a.firstName} ${a.lastName}</p>           
                                            </c:forEach> 

                                            <fmt:formatNumber value="${myevent.representationsev.maxCapacity}" var="maxCapacityVenue" type="number"/>${myevent.representationsev.maxCapacity}
                                            <fmt:formatDate value="${myevent.representationsev.rDate}" var="dateRepresentation" type="date" dateStyle="full"/>${myevent.representationsev.rDate}
                                            ${myevent.representationsev.myvenue.seatMapUrl}
                                            ${myevent.representationsev.myvenue.name}
                                            ${myevent.representationsev.myvenue.type}
                                            ${myevent.representationsev.myvenue.myadd.street}
                                            ${myevent.representationsev.myvenue.myadd.postalCode}
                                            ${myevent.representationsev.myvenue.myadd.city}

                                            <div id="carte" style="width:100%; height:100%"></div>

                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>


