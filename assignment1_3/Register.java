import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

import java.io.File;
import java.io.IOException;
//import javax.servlet.*;
import javax.servlet.ServletException;
import java.util.*;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.util.Arrays;

public class Register extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        // Part part = req.getPart("filename");
        // String filename = part.getSubmittedFileName();
        // String path = getServletContext().getRealPath("/" + "files" + File.separator
        // + filename);

        Path path = FileSystems.getDefault().getPath(req.getParameter("filename"));
        String filename = path.getFileName().toString();
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmpassword = req.getParameter("confirmpassword");
        String upload = req.getParameter("upload");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String[] hobbies = req.getParameterValues("hobbies");
        List al = Arrays.asList(hobbies);
        String address = req.getParameter("address");
        // show the output received from form
        pw.println("Email : " + email + "<br>");
        pw.println("Password : " + password + "<br>");
        pw.println("confirmedPassword : " + confirmpassword + "<br>");
        pw.println("Upload : " + "filename" + "<br>");
        pw.println("Upload : " + filename + "<br>");
        // pw.println("Upload : " + path + "<br>");
        pw.println("Gender : " + gender + "<br>");
        pw.println("Country : " + country + "<br>");
        pw.println("Hobbies : " + al + "<br>");
        pw.println("Address : " + address + "<br>");

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