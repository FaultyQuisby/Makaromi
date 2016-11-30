/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import outils.PatternSession;

/**
 *
 * @author cdi310
 */
public class MenuConnect implements Serializable,sousControleur {
  
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");
        boolean test = patternSession.isIsconnect();
        
        if(request.getParameter("DConnect")!=null){
            patternSession.setIsconnect(true);
            test = true;
            System.out.println("test dconnect "+request.getParameter("DConnect"));
        }
        
        String url="";
        if (test){
        url="/WEB-INF/jsp/menusub/menu-connectok.jsp";
        }else{
        url="/WEB-INF/jsp/menusub/menu-connectnok.jsp";
        }
    return url;
    } 
}
