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
public class MenuConnectAff implements Serializable,sousControleur {
  
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");
        boolean test = patternSession.isIsconnect();
        System.out.println(">>>>>>>>>>>>>>>patternSession.isIsconnect();"+ test);
        String url="";
        if (test){
        url="/WEB-INF/jsp/menusub/menu-connectok.jsp";
        }else{
        url="/WEB-INF/jsp/menusub/menu-connectnok.jsp";
        }
    return url;
    } 
}
