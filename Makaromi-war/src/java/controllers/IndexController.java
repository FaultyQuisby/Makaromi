package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controllers.sub.sousControleur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import outils.PatternSession;

/**
 *
 * @author cdi310
 */
public class IndexController extends HttpServlet {

    private HashMap<String, sousControleur> mp;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        mp = new HashMap<>();

        sousControleur sci = null;
        Enumeration<String> lesNoms = config.getInitParameterNames();
        while (lesNoms.hasMoreElements()) {
            String nomSection = lesNoms.nextElement();
            String valeur = config.getInitParameter(nomSection);
            try {
                sci = (sousControleur) Class.forName(valeur).newInstance();
                mp.put(nomSection, sci);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                System.out.println("classe not found------->>> " + nomSection);
            }
            System.out.println(nomSection);
        }

    }

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

        if (session.getAttribute("patternSession") == null) {
            session.setAttribute("patternSession", new PatternSession());
        }
        PatternSession patternSession = (PatternSession) session.getAttribute("patternSession");

        String url = "/WEB-INF/jsp/home.jsp";
        String section = request.getParameter("section");

        //sections 
        if (mp.containsKey(section)) {
            sousControleur monCtrl = mp.get(section);
            url = monCtrl.executer(request, response);
            System.out.println("url demander------------------------>" + url);
        }

        url = response.encodeURL(url);
        if (url != null) {
            getServletContext().getRequestDispatcher(url).include(request, response);
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

}
