import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ChooseColorServlet", urlPatterns = "/choose-color")
public class ChooseColorServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter out = resp.getWriter();
    resp.setContentType("text/html");
    String inputColor = req.getParameter("color");
    String output = req.getParameter(" ");
    output += "<h1> Enter Color </h1>";
    output += "<form action = '/Color method='Post'>";
    output += "<input name='color' placeholder ='Enter Color'/>";
    output += "<button>Submit</button>";
    output += "</form>";
    out.println(output);

    if (inputColor== null) {
      inputColor = "blue";
    }
    String color = String.format("<h1>Color:, %s</h1>", inputColor);
    out.println("<h1 style = 'color: %s'> %s</h1>");
    out.println(inputColor);
    out.println("</style>");
  }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("You have selected");
  }
}
