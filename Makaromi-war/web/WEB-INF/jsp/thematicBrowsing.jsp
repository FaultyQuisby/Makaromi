<%-- 
    Document   : thematicBrowsing
    Created on : 29 nov. 2016, 11:45:50
    Author     : cdi306
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>THEMATIC BROWSING</title>
    </head>
    <body>
        <h1>Recherche par rubrique</h1>
        <nav>
            <jsp:include page ="thematicBrowsing.jsp" flush="true" />
        </nav>
        <section>
            <table>
                <thead>
                    <tr >
                        <th>${nameSection}</th>
                    </tr>
                </thead>
         
                <tbody>
                 
                  <c:forEach var="i" items="${listSection}">
                        <tr>
                           
                            <td>
                                <a href="SectionController?detailsPage=nameEvent"><p> ${nameEvent}</p></a>        
                            </td>
                            <td>
                                <img src="${imgEvent}"/>    
                            </td>
                           
                        </tr>
                    <br>        
                </c:forEach>
                </tbody>
            </table>

            <section>

                </body>
                </html>

    </body>
</html>
