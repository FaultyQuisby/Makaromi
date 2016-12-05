/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import beans.ManageUser;
import beans.ManageUserLocal;
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
public class CreateAccountController implements Serializable, sousControleur {

    ManageUserLocal monUser = lookupManageUserLocal();

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");

        if (request.getParameter("DCreate") != null) {
            monUser.createUser(request.getParameter("login"), request.getParameter("pwd"),
                    request.getParameter("civilite"), request.getParameter("nom"), request.getParameter("prenom"));
            patternSession.setIsconnect(true);
            if (patternSession.isIsconnect()) {

                request.setAttribute("message", "creation ok");
            } else {
                request.setAttribute("message", "creation nok");
            }
        }

        return "/WEB-INF/jsp/createAccount.jsp";
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
