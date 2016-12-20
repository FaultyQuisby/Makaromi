<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />

        <div class="container">
            <h2>Liste des évènements</h2>    
            <h3>${rubrique}</h3>

            <c:forEach items="${mesevent}" var="e">
               <p>${e.imgURL}</p><br>
               <p>${e.name}</p><br>
                <p>Artiste(s) de l'évènement : </p><br>
                <c:forEach items ="${e.artists}" var ="a">
                    <p>Type d'artiste : ${a.type}</p><br>
                    <p>Nom de l'artiste : ${a.firstName} ${a.lastName}</p><br>            
                </c:forEach>
                    <p>Date de début de l'évènement : ${e.startDate}</p><br>
                    <p>Date de fin de l'évènement : ${e.endDate}</p><br>
                    <a href="IndexController?section=SectionController&event=${e.name}">Détail</a>
            </c:forEach>
        </div>
    </body>
</html>
