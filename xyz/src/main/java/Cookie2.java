import javax.servlet.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.Cookie;
import java.util.*;
import java.time.*;
import java.text.*;

public class cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cookie2() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name1, dateandtime, Value;
		Cookie c1[] = request.getCookies();
		for (int i = 0; i < c1.length; i++) {
// name1=c1[i].getName();
			Value = c1[i].getValue();
			pw.println(Value);
		}
		java.util.Date date = new java.util.Date();
		pw.println("Current date and time : " + date.toString());
		pw.close();
	}
}