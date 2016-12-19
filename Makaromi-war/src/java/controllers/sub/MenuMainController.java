/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageSectionLocal;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi310
 */
public class MenuMainController implements Serializable,sousControleur {
    ManageSectionLocal mesSection = lookupManageSectionLocal();
    
    
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("mesRubriques",mesSection.mesRubriques());
        return "/WEB-INF/jsp/menuMain.jsp";
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
