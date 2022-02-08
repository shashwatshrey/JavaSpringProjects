import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import javax.servlet.*;
import java.util.*;
import java.io.PrintWriter;
import java.util.Arrays;

public class ServletMethods extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        // show the output received from form
        // pw.println("Semester : " + req.getAsyncContext() + "<br>");

        pw.println("Attribute Names : " + req.getAttributeNames() + "<br>");
        pw.println("Character Encoding : " + req.getCharacterEncoding() + "<br>");
        pw.println("Content Length : " + req.getContentLength() + "<br>");
        pw.println("Content Type : " + req.getContentType() + "<br>");
        pw.println("Dispatcher type : " + req.getDispatcherType() + "<br>");
        pw.println("Input Stream : " + req.getInputStream() + "<br>");
        pw.println("Local Address : " + req.getLocalAddr() + "<br>");
        pw.println("Local Port : " + req.getLocalPort() + "<br>");
        pw.println("Locale : " + req.getLocale() + "<br>");
        pw.println("Locales : " + req.getLocales() + "<br>");
        pw.println("Parameter Map : " + req.getParameterMap() + "<br>");
        pw.println("Protocol : " + req.getProtocol() + "<br>");

        pw.println("Reader : " + req.getReader() + "<br>");
        pw.println("Remote Address : " + req.getRemoteAddr() + "<br>");
        pw.println("Remote Host : " + req.getRemoteHost() + "<br>");
        pw.println("Remote Port : " + req.getRemotePort() + "<br>");
        pw.println("Scheme : " + req.getScheme() + "<br>");
        pw.println("Server Name : " + req.getServerName() + "<br>");
        pw.println("Server Port : " + req.getServerPort() + "<br>");
        pw.println("Servlet Context : " + req.getServletContext() + "<br>");
        ServletMethods servlet = new ServletMethods();
        pw.println("Init Parameter : " + servlet.getInitParameterNames() + "<br>");
        pw.println("Servlet Config : " + servlet.getServletConfig() + "<br>");
        pw.println("Servlet Context : " + servlet.getServletContext() + "<br>");
        pw.println("Servlet Info :" + servlet.getServletInfo() + "<br>");
        pw.println("Servlet Name : " + servlet.getServletName() + "<br>");

        pw.close();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        // doGet(req, res);
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) {

    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) {

    }

    public void destroy() {

    }
}