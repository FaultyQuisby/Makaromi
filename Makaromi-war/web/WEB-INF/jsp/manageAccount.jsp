<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>

        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />

        <section>
            <p>Manage Account</p>
        </section>
    </body>
</html>


