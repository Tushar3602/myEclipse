import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.util.Date;
import java.time.*;
import java.text.*;

public class cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Date d = new Date();
//String date1=d.toString();
		String n = request.getParameter("uname");
		pw.print("Welcome " + n);
		String name3 = "abc";
		Cookie c = new Cookie("name", n);
		response.addCookie(c);
		String f1;
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		f1 = f.toString();
		LocalDateTime dt = LocalDateTime.now();
		String datetime;
		Cookie c2 = new Cookie("datetime", "date1");
		response.addCookie(c2);
		pw.print("<form action='cookie2'>");
		pw.print("<input type='submit'>");
		pw.print("</form>");
		pw.close();
	}
}