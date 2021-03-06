/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageSectionLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi306
 */
public class DetailsPageController implements Serializable, sousControleur {

    ManageSectionLocal manageSection = lookupManageSectionLocal();

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {

        String url="/WEB-INF/jsp/detailsPage.jsp";

        if (request.getParameter("event") != null) {
            request.setAttribute("myevent", manageSection.eventByName(request.getParameter("event")));
            request.setAttribute("mesRepresentations", manageSection.mesRepresentationByEvent(request.getParameter("event")));
            System.out.println("----------------------------------------------> je rentre dans dpc");
                    
        }
           //////////////////////////////////////////////////////////suivie page origine
        if (request.getParameter("origineth") != null) {                    
            request.setAttribute("origineth", request.getParameter("origineth"));
           
        }
           /////////////////////////////////////////////////////////retour 
        if (request.getParameter("retour") != null) {
            String origineth = request.getParameter("origineth");
            request.setAttribute("th",request.getParameter("origineth"));
            url = "/WEB-INF/jsp/bootstrapThematicBrowsing.jsp";            
        }
        return url;
    }

    private ManageSectionLocal lookupManageSectionLocal() {
        try {
            Context c = new InitialContext();
            return (ManageSectionLocal) c.lookup("java:global/Makaromi/Makaromi-ejb/ManageSection!beans.ManageSectionLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
