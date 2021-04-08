import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello-world")
//public class HelloWorldServlet extends HttpServlet {
//
//  @Override
//  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    response.setContentType("text/html");
//    PrintWriter out = response.getWriter();
//    out.println("<h1>Hello, World!</h1>");
//  }
@WebServlet("/hello")
  public class HelloWorldServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    String thingToBeGreeted = req.getParameter("name");
    if(thingToBeGreeted == null ){
      thingToBeGreeted = "World";
    }
//    System.out.println(req.getParameter("name"));
    String output = String.format ("<h1>Hello, %s</h1>", thingToBeGreeted);
    out.println(output);
  }
}
