/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.sub;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi306
 */
@WebServlet(name = "DetailsPageController", urlPatterns = {"/DetailsPageController"})
public class DetailsPageController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String url = "/WEB-INF/jsp/detailsPage.jsp";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DetailsPageController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DetailsPageController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 if ("event".equals(request.getParameter("section")) || nav.equals("event")) {

                if (request.getParameter("nameEvent") != null) {
                    Event event1 = mySection.getEvent(request.getParameter("nameEvent"));
                    request.setAttribute("nameEvent", request.getParameter("nameEvent"));
                    request.setAttribute("imgEvent", event1.getImage());
                    request.setAttribute("nameArtist", request.getParameter("nameEvent"));
                    request.setAttribute("firstNameArtist", request.getParameter("firstNameArtist"));
                    request.setAttribute("typeArtist", request.getParameter("typeArtist"));
                    request.setAttribute("commentArtist", request.getParameter("commentArtist"));
                    request.setAttribute("priceEvent", event1.getpriceEvent() + " euros");
                    request.setAttribute("synopsisEvent", event1.getsynopsisEvent());
                    request.setAttribute("commentEvent", event1.getcommentEvent());
                    request.setAttribute("dateStart", event1.getdateStart());
                    request.setAttribute("dateEnd", event1.getdateEnd());
                    request.setAttribute("nameVenue", event1.getnameVenue());
                    request.setAttribute("typeVenue", event1.gettypeVenue());
                    request.setAttribute("mapVenue", event1.getmapVenue());
                    mySection.setLastevent(event1);
                }

                if (nav.equals("event")) {
                    Event event1 = mySection.getLastevent();
                    request.setAttribute("nameEvent", event1.getnameEvent());
                    request.setAttribute("imgEvent", event1.getimgEvent());
                    request.setAttribute("nameArtist", event1.getnameArtist());
                    request.setAttribute("firstNameArtist", event1.getfirstNameArtist());
                    request.setAttribute("typeArtist", event1.gettypeArtist());
                    request.setAttribute("commentArtist", event1.getcommentArtist());
                    request.setAttribute("priceEvent", event1.getpriceEvent() + " euros");
                    request.setAttribute("synopsisEvent", event1.getsynopsisEvent());
                    request.setAttribute("commentEvent", event1.getcommentEvent());                    
                    request.setAttribute("dateEnd", event1.getdateEnd());
                    request.setAttribute("dateStart", event1.getdateStart());
                    request.setAttribute("nameVenue", event1.getnameVenue());
                    request.setAttribute("typeVenue", event1.gettypeVenue());
                    request.setAttribute("mapVenue", event1.getmapVenue());
                    mySection.setLastevent(event1);
                }

                mySection.setLastnav("event");
                url = "/WEB-INF/detailsPage.jsp";

            }
}
