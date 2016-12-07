<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />

    </head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Musée</a></li>
                <li><a href="#">Sport</a></li>
                <li><a href="#">Musique</a></li>
                <li><a href="#">Théâtre</a></li>
                <li><a href="#">Parc</a></li>
                <li><a href="#">Festival</a></li>
                <li><a href="#">Promotion</a></li>        
            </ul>
            <form class="navbar-form navbar-left">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Rechercher">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </nav>
    
    <div class="container">
        <h2>Liste des évènements</h2>
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
