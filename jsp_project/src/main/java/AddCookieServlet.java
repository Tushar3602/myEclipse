

import java.io.IOException;
import java.sql.Date;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username = "Tushar_Narekar"; // Replace with the user's actual username
	    Date currentDate = new Date(0);

	    // Create a new cookie with the user's username and current date/time
	    Cookie c = new Cookie("UserInfo", username + "|" + currentDate.toString());
	    c.setMaxAge(3600); // Set the cookie to expire in 1 hour

	    // Add the cookie to the response
	    response.addCookie(c);

	    // Display the cookie on the page
	    PrintWriter out = response.getWriter();
	    out.println("<html><body>");
	    out.println("<h2>Cookie added:</h2>");
	    out.println("<p>Name: " + c.getName() + "</p>");
	    out.println("<p>Value: " + c.getValue() + "</p>");
	    out.println("</body></html>");
		
		
		
	}

}
