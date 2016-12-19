<%-- 
    Document   : seatSelection
    Created on : 19 déc. 2016, 10:47:15
    Author     : cdi306
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seat Selection</title>
        <link href="css/seatSelection.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery.seat-charts.css" rel="stylesheet" type="text/css"/>
        <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
        <script src="js/vendor/jquery.seat-charts.min.js" type="text/javascript"></script>
        <script src="js/seatSelection.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="demo">
            <div class="container">
                <div id="seat-map">
                    <div class="front">Carriage 1</div>
                    <div id="seat-info"></div>
                </div>
                <div class="booking-details">
                    <h3> Seat selection information:</h3>
                    <ul id="selected-seats"></ul>
                    <p>Tickets Num: <span id="counter"></span></p>
                    <p>Total: $<span id="total">0</span></p>

                    <button class="checkout-button">BUY</button>

                    <div id="legend"></div>
                </div>
            </div>
        </div>
    </body>
</html>
