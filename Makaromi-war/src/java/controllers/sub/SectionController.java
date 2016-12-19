/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageUserLocal;
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
 * @author cdi306
 */

public class SectionController implements Serializable,sousControleur {
    private ManageUserLocal lookupManageUserLocal() {
        try {
            Context c = new InitialContext();
            return (ManageUserLocal) c.lookup("java:global/Makaromi/Makaromi-ejb/ManageUser!beans.ManageUserLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/menu.jsp";
    } 
}
