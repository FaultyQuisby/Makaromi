<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Makaromi - Online Ticketing</title>
    <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>
    <script src="js/modal.js" type="text/javascript"></script>
    <script src="js/menuajx.js" type="text/javascript"></script>
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/home.css" type="text/css">
    <link rel="stylesheet" href="css/menu-connectnok.css" type="text/css"/>
</head>

<body>
    <nav class="navbar navbar-inverse navbar-static-top example-8">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar8">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand text-hide" href="http://localhost:8080/Makaromi-war/">Makaromi
                </a>
            </div>
            <div id="navbar8" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <c:if test="${testquantite}">
                            <a href="" class="modal-link" id="viewCartButton" >
                                <span class="glyphicon glyphicon-shopping-cart"></span>(${quantite})
                            </a>
                        </c:if>
                        <c:if test="${!testquantite}">
                            <a href="" class="modal-link" id="viewCartButton" >
                                <span class="glyphicon glyphicon-shopping-cart"></span>(0)
                            </a>
                        </c:if>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-user monPetitBonhomme"></span> My Account <span class="caret carotte"></span></a>
                        <ul id="menuConnect" class="dropdown-menu" role="menu">
                            <c:url var="url" value="IndexController?section=MenuConnectAff" />
                            <c:import url="${url}"  />
                        </ul>
                    </li>
                </ul>
            </div>
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <ul class="nav navbar-nav">
                        <c:forEach items="${mesRubriques}" var="r">
                            <li><a href="IndexController?section=SectionController&th=${r.name}">${r.name}</a></li>
                            </c:forEach>
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
        </div>
        <!--/.container-fluid -->
    </nav>

    <c:url var="modal" value="WEB-INF/jsp/modal.jsp" />
    <c:import url="${modal}" />
</body>


