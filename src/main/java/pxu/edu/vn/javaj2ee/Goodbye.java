package pxu.edu.vn.javaj2ee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class Goodbye
*/
@WebServlet("/Goodbye")
public class Goodbye extends HttpServlet {
private static final long serialVersionUID = 1L;
private String message;
/**
* @see HttpServlet#HttpServlet()
*/
public Goodbye() {
super();
// TODO Auto-generated constructor stub
}
/**
* @see Servlet#init(ServletConfig)
*/
public void init(ServletConfig config) throws ServletException {
// TODO Auto-generated method stub
message = "SEE YOU SOON";
}
/**


* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<h1>" + message + "</h1>");
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}
}