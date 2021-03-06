/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageUserLocal;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import outils.PatternSession;

/**
 *
 * @author cdi310
 */
public class MenuConnectGest implements Serializable,sousControleur {
    ManageUserLocal monUser = lookupManageUserLocal();
  
   
   @Override
   public String executer(HttpServletRequest request, HttpServletResponse response) {
        
        HttpSession session = request.getSession();
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");
         if (request.getParameter("action").equalsIgnoreCase("connect")){
             
             String login = request.getParameter("login");
             String password = request.getParameter("password");
             
             System.out.println("test login et pass recu par jsp-------------------------> "+login+password);
             
             if(monUser.ConnectUser(login,password)!= null){
                 patternSession.setIsconnect(true);
                 patternSession.setUser(monUser.ConnectUser(login,password));
             }else{
                 request.setAttribute("msgcnx","erreur de login et mot de passe");
             }
             
         };
        
        if (request.getParameter("action").equalsIgnoreCase("deconnect")){
             patternSession.setIsconnect(false);
             patternSession.setUser(null);
             System.out.println("deconnexion----------------------------------------->");
        }
        
       
        return "/IndexController?section=MenuConnectAff";
    } 

    
   
   private ManageUserLocal lookupManageUserLocal() {
        try {
            Context c = new InitialContext();
            return (ManageUserLocal) c.lookup("java:global/Makaromi/Makaromi-ejb/ManageUser!beans.ManageUserLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

   
}
