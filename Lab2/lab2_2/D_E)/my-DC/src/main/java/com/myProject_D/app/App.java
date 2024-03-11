package com.myProject_D.app;


import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class App extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Get parameters from the URL
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");

        // Customize the message based on parameters
        String message = "Hello, ";
        if (firstName != null) {
            message += firstName;
        }
        if (lastName != null) {
            message += " " + lastName;
        }
        message += "!";

        // Output the customized message
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}
