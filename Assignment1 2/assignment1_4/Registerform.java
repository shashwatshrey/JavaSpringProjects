import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import javax.servlet.*;
import java.util.*;
import java.io.PrintWriter;
import java.util.Arrays;

public class Registerform extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        // show the output received from form
        pw.println("Semester : " + req.getParameter("term") + "<br>");
        pw.println("Year : " + req.getParameter("year") + "<br>");
        pw.println("Employee status : " + req.getParameter("empstatus") + "<br>");
        pw.println("Student's name : " + req.getParameter("studentname") + "<br>");
        pw.println("Relationship to Employee : " + req.getParameter("relationtoemp") + "<br>");
        pw.println("Student's NUID : " + req.getParameter("studentnuid") + "<br>");
        pw.println("Employee's Name : " + req.getParameter("empname") + "<br>");
        pw.println("Department : " + req.getParameter("department") + "<br>");
        pw.println("Location : " + req.getParameter("campuslocation") + "<br>");
        pw.println("Ph. Number : " + req.getParameter("phonenumber") + "<br>");
        pw.println("Supervisor Name : " + req.getParameter("supervisor") + "<br>");
        pw.println("School or Program : " + req.getParameter("school") + "<br>");
        pw.println("Emp Signature : " + req.getParameter("empsign") + "<br>");
        pw.println("Date : " + req.getParameter("dateempsign") + "<br>");
        pw.println("HRM Approval : " + req.getParameter("hrmapproval") + "<br>");
        pw.println("Date : " + req.getParameter("dateapproval") + "<br>");

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