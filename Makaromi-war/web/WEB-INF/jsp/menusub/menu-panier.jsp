<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${testquantite}">
    <p><a href="Maestro?section=panier"><img src="images/iconPanier.jpg"  width="70"/></a></p>
        </c:if>
        <c:if test="${!testquantite}">
    <img src="images/iconPanier.jpg"  width="70"/>
</c:if></br>
<br/>Nombre d'articles: ${quantite}

