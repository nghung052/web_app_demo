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
* Servlet implementation class HelloWorld
*/
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
private static final long serialVersionUID = 1L;
private String message;
/**
* @see HttpServlet#HttpServlet()
*/
public HelloWorld() {
super();
// TODO Auto-generated constructor stub
}
/**
* @see Servlet#init(ServletConfig)
*/
public void init(ServletConfig config) throws ServletException {
// TODO Auto-generated method stub
message = "Hello word!!!";
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
out.println("<h7>" + message + "</h7>");
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