package com.example.md4_session6_th3_ungdungchuyendoitiente;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/convert")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: "+rate+"</h1>");
        writer.println("<h1>usd: "+usd+"</h1>");
        writer.println("<h1>vnd: "+vnd+"</h1>");
        writer.println("</html>");
    }
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        float rate = Float.parseFloat(request.getParameter("rate"));
//        float usd = Float.parseFloat(request.getParameter("usd"));
//        float vnd = rate * usd;
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Rate: "+rate+"</h1>");
//        writer.println("<h1>usd: "+usd+"</h1>");
//        writer.println("<h1>vnd: "+vnd+"</h1>");
//        writer.println("</html>");
//    }

    public void destroy() {
    }
}