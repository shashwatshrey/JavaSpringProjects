import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.*;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        Enumeration<String> headers = request.getHeaderNames();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        if (headers != null) {
            while (headers.hasMoreElements()) {
                String name = headers.nextElement();
                out.println("Header Names - " + name + ": " + request.getHeader(name));
            }
        }
        out.println("</body>");
        out.println("</html>");

    }

    public void destroy() {

    }

}
