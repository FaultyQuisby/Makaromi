package controllers.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectEventDateController implements sousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/eventDateSelection.jsp";
    }

}