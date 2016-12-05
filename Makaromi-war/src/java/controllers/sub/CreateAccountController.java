/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageUser;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import outils.PatternSession;

/**
 *
 * @author cdi310
 */
public class CreateAccountController implements Serializable,sousControleur {
  
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");
        
        
        
        
        
        if(request.getParameter("DCreate")!= null){
            ManageUser monUser = new ManageUser();
            
           monUser.createUser(request.getParameter("login"),request.getParameter("pwd"),
                  request.getParameter("civilite"),request.getParameter("nom"),request.getParameter("prenom"));
           patternSession.setIsconnect(true);
            
        }
        if(patternSession.isIsconnect()){
            
            request.setAttribute("message","creation ok");
        }else{
            request.setAttribute("message","creation nok");
        }
        
        
        
        
        
        
        return "/WEB-INF/jsp/createAccount.jsp";
    } 
}
