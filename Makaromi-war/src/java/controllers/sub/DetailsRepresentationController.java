package controllers.sub;

import beans.ManageSectionLocal;
import entites.Representation;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class DetailsRepresentationController implements sousControleur {    

    ManageSectionLocal manageSection = lookupManageSectionLocal();
    
   
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {

        String url="/WEB-INF/jsp/detailsRepresentation.jsp";    
         
        if(request.getParameter("idRep") != null){
             Representation rep = manageSection.representationById(Integer.valueOf(request.getParameter("idRep")));
             request.setAttribute("rep",rep);
             System.out.println("------------------>demande de representation "+rep);
         }
        
        
         //////////////////////////////////////////////////////////suivie page origine
        if (request.getParameter("originev") != null) {                    
            request.setAttribute("originev", request.getParameter("originev"));
           
        }
        
        
        if (request.getParameter("retour") != null) {
            url = "/IndexController?section=DetailsPageController&event="+request.getParameter("originev"); 
            System.out.println("------------------------------>je rentre dans retour de drc");
            request.setAttribute("retour", null);
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

