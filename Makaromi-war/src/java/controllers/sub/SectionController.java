/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageSectionLocal;
import beans.ManageUserLocal;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 *
 * @author cdi306
 */

public class SectionController implements Serializable,sousControleur {
    ManageSectionLocal mesSection = lookupManageSectionLocal();
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
       
        if(request.getParameter("th")!= null){
           String rubrique = request.getParameter("th");
           List le = mesSection.mesEventparRubrique(rubrique.trim());
           request.setAttribute("mesevent",le);
           System.out.println("liste dans sous controller est egale a------->"+le);
            
        }
            
           
        
        
        
        
        
        return "/WEB-INF/jsp/thematicBrowsing.jsp";
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
