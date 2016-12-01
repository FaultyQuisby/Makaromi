package controllers.sub;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cdi310
 */
public class MenuPanierAff implements Serializable,sousControleur {
  
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/menusub/menu-panier.jsp";
    } 
}
