<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        <h1>Afficher les détails de l'évènement</h1>
        <nav>
            <jsp:include page ="detailsPage.jsp" flush="true" />
        </nav>
        <section>
            <table>
                <!--<thead><p><strong>${nameEvent}</strong> </thead>-->
                <thead>
                    <tr>
                        <th>${nameEvent}</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                        </td>  
                        <td>
                            <img src="${imgEvent}"/>
                        </td>
                        <td>
                            <strong>${nameEvent}</strong><br/>                     
                            ${dateStart} ${dateEnd}<br/>
                            ${synopsisEvent} <br/>
                            ${commentEvent} <br/>
                            ${dateRepresentation} <br/>
                            ${timeRepresentation} <br/>
                            ${typeVenue} <br/>
                            ${nameVenue} <br/>
                            ${number} ${street} ${postCode} ${city}<br/>
                            ${mapVenue} <br/>

                        </td>
                    <tr>
                        <td>
                            <a href="Maestro?section=panier&add=${isbnouv}"><p><img src="/Nextlib/images/boutonAjouter.png" /></p></a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a href="SectionController?thematicBrowsing=retour=ok"><p>Retour</p></a>
                        </td>
                    </tr>
            </table>
        </section>
    </body>
</html>
