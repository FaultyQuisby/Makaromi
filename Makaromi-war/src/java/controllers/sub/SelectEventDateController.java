package controllers.sub;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectEventDateController implements Serializable, sousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/eventDateSelection.jsp";
    }

}