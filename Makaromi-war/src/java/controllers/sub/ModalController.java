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
 * @author micha
 */
public class ModalController implements Serializable, sousControleur{

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("est rentré dans le modal controller !");
        System.out.println("------------------------" + request.getParameter("modalAction").toString());    
        
        if(request.getParameter("modalAction").equalsIgnoreCase("viewcart")){
            return "/WEB-INF/jsp/shoppingCart.jsp";
        }
        else if(request.getParameter("modalAction").equalsIgnoreCase("editdate")){
            return "/WEB-INF/jsp/eventDateSelection.jsp";
        }
        else if(request.getParameter("modalAction").equalsIgnoreCase("pickseat")){
            return "/WEB-INF/jsp/seatSelection.jsp";
        }
        else{
            System.out.println("hey there, you made it !");
            return "/WEB-INF/jsp/shoppingCart.jsp";
        }
    }
    
}