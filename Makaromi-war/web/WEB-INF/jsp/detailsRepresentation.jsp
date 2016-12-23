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
                                        <a href="IndexController?section=SectionController=${myevent.representationsev.venue}"></a> 
                                        <strong><th>${myevent.name}</th></strong> 
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

                                    </td>
                                </tr>    

                                </body>
                                </html>


