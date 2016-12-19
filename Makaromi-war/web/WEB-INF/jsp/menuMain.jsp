<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <nav class="navbar navbar-inverse navbar-static-top example-8">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar8">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand text-hide" href="localhost:8080/Makaromi-war/">Makaromi
                    </a>
                </div>
                <div id="navbar8" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <c:url var="url03" value="IndexController?section=MenuPanierAff" />
                            <c:import url="${url03}"  />
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
                <li><a href="IndexController?section=SectionController&th= ${r.name}">${r.name}</a></li>
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
  
<script src="js/menuajx.js" type="text/javascript"></script>
