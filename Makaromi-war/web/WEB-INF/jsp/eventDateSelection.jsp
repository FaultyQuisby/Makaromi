<%-- 
    Document   : eventDateSelection
    Created on : 19 déc. 2016, 10:15:20
    Author     : cdi306
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!--    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Event Date and Time Picker</title>
            <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
            <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css"/>
            <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
            <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>
            <script src="js/vendor/collapse.js" type="text/javascript"></script>
            <script src="js/vendor/transition.js" type="text/javascript"></script>
            <script src="js/vendor/moment-with-locales.js" type="text/javascript"></script>
            <script src="js/vendor/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
            <script src="js/modal.js" type="text/javascript"></script>
        </head> 
-->
<head>
    <script src="js/vendor/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
</head>
    <body>
        <div class="container">
            <div class="row">
                <div class='col-sm-6'>
                    <div class="form-group">
                        <div class='input-group date' id='datetimepicker5'>
                            <input type='text' class="form-control" />
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"></span>
                            </span>
                        </div>
                    </div>
                </div>
                <!-- ici ne montrer que les dates et heures disponibles pour l'evenement choisi -->
                <script type="text/javascript">
                    $(function () {
                        $('#datetimepicker5').datetimepicker({
                            defaultDate: "11/1/2013",
                            disabledDates: [
                                moment("12/25/2013"),
                                new Date(2013, 11 - 1, 21),
                                "11/22/2013 00:53"
                            ],
                            locale: 'fr'
                        });
                    });
                </script>
            </div>
        </div>
    <div>
        <button type="button" class="btn btn-success" id="dateOK">Date Choisie</button>
    </div>
    </body>
</html>
