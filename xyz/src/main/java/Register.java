import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		if (username.equals("Scott") && password.equals("tiger")) {
			pw.write("Welcome " + username);
			return;
		}
		resp.sendRedirect("http://localhost:8080/Scott.html");
	}
}