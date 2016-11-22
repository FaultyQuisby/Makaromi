package controllers;

import beans.ConnectionBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "IndexController", urlPatterns = {""})
public class IndexController extends HttpServlet {
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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        
        String prefix = "/WEB-INF/jsp/";
        String sufix = ".jsp";
        String url = "home";
        String section = request.getParameter("section");
        String action = request.getParameter("action");
        
        // vérifié si un beanConnexion est enregistre ds la session; si non, le cree           
        ConnectionBean bc = (ConnectionBean) session.getAttribute("sessionConnexion");
        if (bc == null) {
            bc = new ConnectionBean();
            session.setAttribute("sessionConnexion", bc);
        }
        
        /* exemple d'utilisation du messageBean.
        MessageBean mb = (MessageBean) session.getAttribute("messages");
        if (mb == null) {
            mb = new MessageBean();
            session.setAttribute("messages", mb);
        }
        
        mb.info("Salut");
        mb.danger("Salut c'est une error");
        */
        
        
        url= response.encodeURL(prefix+url+sufix);
        //System.out.println("------------------>>> "+url);
        
        // on fait suivre à la jsp de l'index.
        getServletContext()
                .getRequestDispatcher(url)
                .include(request, response);
        
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

}
