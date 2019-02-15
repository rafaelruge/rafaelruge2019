/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Soft2-01
 */
@WebServlet(name = "cookiesServlets", urlPatterns = {"/cookiesServlets"})
public class cookiesServlets extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cookiesServlets</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cookiesServlets at " + request.getContextPath() + "</h1>");
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
        //se supone que el usuario ingresa por primera vez
        boolean nuevoUsuario = true;
        // obtenemos todas las cookies
        Cookie [] cookies = request.getCookies();
        
        //buscamos si ya existe una cokkie 
        //llamada visitante recurrente
        if(cookies != null){
            for (Cookie c : cookies){
                if(c.getName().equals("VisitanteRecurrente")&& c.getValue().equals("si")){
                    //En caso de que ya exista una cookie indicado que ya existe un usuario
                    //con anteoridad ponemos la bandera en falso y salimos del ciclo
                    nuevoUsuario = false;
                    break;
                }//fin del if
            }//fin del for
            //se revisa si es nuevo el usuario
            String mensaje = null;
            if(nuevoUsuario){
                //en caso de ser un usuario nuevo creamos el ejemplo cookie
                Cookie visitanteCookie = new Cookie ("visitanteRecurrente","si");
                //agregamos la cookie
                response.addCookie(visitanteCookie);
                mensaje = "Gracias por visitar  nuestro sitio";
            } else{
                mensaje = "Gracias por visitar  Nuevamente nuestro sitio";
            }
            //escribimos la salida
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
        //omitimos codigo html para simplificar el codigo
        System.out.println("Mensaje: " + mensaje );
        }
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
