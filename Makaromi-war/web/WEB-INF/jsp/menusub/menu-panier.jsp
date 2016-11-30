<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${testquantite}">
    <a href="Maestro?section=panier">
        <span class="glyphicon glyphicon-shopping-cart"></span>(${quantite})
    </a>
</c:if>
<c:if test="${!testquantite}">
    <a href="#">
        <span class="glyphicon glyphicon-shopping-cart"></span>(0)
    </a>
</c:if>

