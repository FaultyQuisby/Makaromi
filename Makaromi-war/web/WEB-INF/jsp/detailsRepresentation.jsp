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
                             <a href="IndexController?section=SectionController=${rep.id}"></a> 
                            <a href="IndexController?section=SectionController=${myevent.name}"></a>                
                            <h1>${myevent.name}</h1> 
                                    <div>
                                        <img width="100px" src="${myevent.imgURL}" alt=""/>
                                    </div>
                                </td>
                                <td>
                                    <div id="texteDetailsPage">                                   
                                        <c:forEach items ="${myevent.artists}" var ="a">
                                            <h5>${a.type} ${a.firstName} ${a.lastName}</h5>           
                                        </c:forEach> <br>
                                    </td>
                               </tr>
                                        <tr>
                                            <td>
                                                <img src="${rep.myvenue.seatMapUrl}" id="imgVenue"/>
                                            </td>
                                            <td>
                                                <div id="venue">
                                                    <fmt:formatDate value="${rep.rDate}" var="dateRepresentation" type="date" dateStyle="full"/>
                                                    <h3>${dateRepresentation}</h3><br>
                                                    Lieu : <strong>${rep.myvenue.name}</strong><br>
                                                    Adresse: <br>
                                                    ${rep.myvenue.myadd.street}<br>
                                                    ${rep.myvenue.myadd.postalCode}<br>
                                                    ${rep.myvenue.myadd.city}<br>                                                   
                                                    <p id="boutonCommander"><a href="IndexController?section=DetailsRepresentationController&idRep=${r.id}"><h4>Choisir</a></h4></p>
                                            

                                                </div>
                                            </td>
                                        </tr>
                                        <tr><td><br></td></tr>
                                        <tr>                                        
                                            <td id="googleMap">
                                                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2621.524071031683!2d2.3579758156815505!3d48.924459179294075!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66ebadd2263bf%3A0x70c04f7109156311!2sStade+de+France!5e0!3m2!1sfr!2sfr!4v1483966706429" width="500" height="350" frameborder="0" style="border:0" allowfullscreen>                                                        
                                                </iframe>
                                            </td>
                                            <td></td>
                                        </tr>
                                        


                                        </tbody>
                        </table>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>


