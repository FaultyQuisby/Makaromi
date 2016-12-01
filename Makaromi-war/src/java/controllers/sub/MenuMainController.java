/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi310
 */
public class MenuMainController implements Serializable,sousControleur {
  
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/menuMain.jsp";
    } 
}
