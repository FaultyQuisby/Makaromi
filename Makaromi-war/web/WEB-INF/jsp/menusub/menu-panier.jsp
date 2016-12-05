<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="js/modal.js" type="text/javascript"></script>
<c:if test="${testquantite}">
    <a href="IndexController?section=ShoppingCartController" class="modal-link">
        <span class="glyphicon glyphicon-shopping-cart"></span>(${quantite})
    </a>
</c:if>
<c:if test="${!testquantite}">
    <a href="IndexController?section=ShoppingCartController" class="modal-link">
        <span class="glyphicon glyphicon-shopping-cart"></span>(0)
    </a>
</c:if>

