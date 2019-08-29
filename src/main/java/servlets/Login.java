package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String nombre = request.getParameter("uname");
			String clave = request.getParameter("pass");
			
			if(nombre.equals("usuario124") && clave.equals("fjkdf32K")) {
				
				// Permitir que el usuario acceda a pagina de bienvenida (Success.jsp) sólo si está logueado:
				HttpSession session = request.getSession();
				session.setAttribute("usuario", nombre);
				response.sendRedirect("Success.jsp");
				
			} else {
				response.sendRedirect("login.html");
			}
	}


}