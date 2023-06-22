package pxu.edu.vn.javaj2ee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class HelloForm
*/
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	* @see HttpServlet#HttpServlet()
	*/
	public Login() {
	super();
	// TODO Auto-generated constructor stub
	}
	/**
	* @see HttpServlet#doGet(HttpServletRequest request,

	HttpServletResponse response)

	*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String title = "Login Successs";
	String docType = "<!doctype html public \"-//w3c//dtd html4.0 " + "transitional//en\">\n";
	out.println(docType +

	"<html>\n" +
	"<head><title>" + title + "</title></head>\n" +
	"<body bgcolor=\"#f0f0f0\">\n" +
	"<h1 align=\"center\">" + title + "</h1>\n" +
	"<ul>\n" +
	" <li><b>Username</b>: "
	+ request.getParameter("username") + "\n" +
	" <li><b>Password</b>: "
	+ request.getParameter("password") + "\n" +
	
	"</ul>\n" +
	"</body></html>");
	}
}