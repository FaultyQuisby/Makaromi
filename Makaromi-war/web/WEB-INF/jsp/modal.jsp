<%-- 
    Document   : modal
    Created on : 5 déc. 2016, 22:46:53
    Author     : micha
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script src="js/modal.js" type="text/javascript"></script>
<div id="modal-container" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-content">

        
        
        <c:url var="url" value="IndexController?section=ShoppingCartController" />
        <c:import url="${url}"  />
        
        
    </div>
</div>

<style>
    .modal-content {
        width: 600px !important;
        margin: 30px auto !important;
    }
</style>