package muntrain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// **** ESTE ES EL Servlet para recoger datos de contacto de usuario *****//
public class ContactServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		PrintWriter out = res.getWriter();
		
		out.println("Email recogido: "+ email + " Móvil recogido: " + phone );
	}
	
}
