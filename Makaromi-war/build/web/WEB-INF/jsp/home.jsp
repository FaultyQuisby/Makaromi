<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>

        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />
        <c:url var="url" value="IndexController?section=jeutestcontroller" />
       

        <section>
            <p>Bienvenue dans votre magasin.</p>

            <a href="thematicBrowsing.jsp">thematic</a>
            <a href="menusub/bootstrapThematicBrowsing.jsp">thematic2</a>
            <a href="IndexController?section=jeutestcontroller">jeu de test</a>
            <br> <a href="" class="modal-link" id="pickDateTimeButton" >selection d'un event (faux bouton provisoire)</a>
            
        </section>
        
        
    </body>
</html>
