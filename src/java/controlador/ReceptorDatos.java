/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author casa
 */
@WebServlet(name = "ReceptorDatos", urlPatterns = {"/ReceptorDatos"})
public class ReceptorDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //Esto es un Servlet
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ReceptorDatos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReceptorDatos at " + msg + "</h1>");
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

        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String cedula = request.getParameter("cedula");
        /**
            "response": Este es un objeto de tipo HttpServletResponse que representa la respuesta que se 
            enviará al cliente."setContentType("text/html")": Este método establece el tipo de contenido de 
            la respuesta. En este caso, "text/html" indica que la respuesta es un documento HTML.
         */

         /**
            En Java, la línea PrintWriter out = response.getWriter(); se utiliza en servlets para obtener 
            un objeto PrintWriter que permite enviar texto de respuesta al cliente (normalmente un navegador 
            web).
         */
 
         /**
            "response": Este es un objeto de tipo HttpServletResponse, que representa la respuesta que el servidor enviará de vuelta al cliente.
            "getWriter()": Este método del objeto response devuelve un objeto PrintWriter que puede utilizarse para enviar texto de salida al cliente.
            PrintWriter out: Aquí se está declarando una variable out de tipo PrintWriter que se usará para escribir la respuesta.
         */
        if ("Luis Niebles".equals(nombre) && "3002875078".equals(telefono) && "32300300".equals(cedula)) {
            // Responder al usuario
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Reserva Confirmada</h1>");
            out.println("<p>Gracias, " + nombre + ". Tu reserva ha sido realizada con éxito.</p>");//Se encarga de recibir las respuestas
            out.println("<p>Teléfono: " + telefono + "</p>");
            out.println("<p>Cédula: " + cedula + "</p>");
            out.println("</body></html>");
        } else {
            processRequest(request, response, "registro inválido"); //Se encarga de recibir las respuestas
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
        //processRequest(request, response);
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
