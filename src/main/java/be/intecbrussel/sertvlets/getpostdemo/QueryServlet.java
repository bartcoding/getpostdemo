package be.intecbrussel.sertvlets.getpostdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;

@WebServlet("/query")
public class QueryServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameters = req.getParameterMap();
        Collection<String[]> values = parameters.values();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("queryservlet");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        //print out hello pluto if parametermap is empty
        if (parameters.isEmpty()){
            writer.println("hello pluto");
        }
        else{
        //print out all values of the parameters
        for (String [] value:values) {
            for (String valuePart:value) {
                writer.println(valuePart);
            }
        }
        }
        writer.println("</body>");
        writer.println("</html>");


    }



}
