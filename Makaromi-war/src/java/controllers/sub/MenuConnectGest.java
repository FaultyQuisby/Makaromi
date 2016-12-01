/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import outils.PatternSession;

/**
 *
 * @author cdi310
 */
public class MenuConnectGest implements Serializable,sousControleur {
  
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
          
        HttpSession session = request.getSession();
//        if(session.getAttribute("patternSession") == null){
//            session.setAttribute("patternSession", new PatternSession());
//        }
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");
        
        patternSession.setIsconnect(true);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>patternSession.setIsconnect(true);"+ patternSession.isIsconnect());
        // return "/WEB-INF/vide.jsp";
        return "/IndexController?section=MenuConnectAff";
    } 
}
