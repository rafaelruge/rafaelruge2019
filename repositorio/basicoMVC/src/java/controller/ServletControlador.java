/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.rectangulo;

@WebServlet(name = "ServletControlador",urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      rectangulo rec = new rectangulo (3,6);  
      
      request.setAttribute("mensaje","saludos desde el servlet");
      
      HttpSession session = request.getSession();
      session.setAttribute("rectangulo", rec);
      
      RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
    
    rd.forward(request, response);
    }
    
    
}
