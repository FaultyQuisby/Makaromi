package controllers.sub;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import beans.jeudetestLocal;
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
public class jeutestcontroller implements sousControleur {
    jeudetestLocal testbd = lookupjeudetestLocal();

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) { 
        HttpSession session = request.getSession();
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");
        
        testbd.createbd();
        return "/WEB-INF/jsp/home.jsp";
    
    
    }

    private jeudetestLocal lookupjeudetestLocal() {
        try {
            Context c = new InitialContext();
            return (jeudetestLocal) c.lookup("java:global/Makaromi/Makaromi-ejb/jeudetest!beans.jeudetestLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
