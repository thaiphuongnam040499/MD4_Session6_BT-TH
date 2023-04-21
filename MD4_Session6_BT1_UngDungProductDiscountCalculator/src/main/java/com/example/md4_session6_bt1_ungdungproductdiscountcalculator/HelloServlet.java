package com.example.md4_session6_bt1_ungdungproductdiscountcalculator;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/discount")
public class HelloServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        float ListPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));
        float DiscountAmount = (float) (ListPrice * DiscountPercent * 0.01);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>ListPrice: "+ ListPrice+"</h1>");
        writer.println("<h1>DiscountPercent: "+ DiscountPercent+"</h1>");
        writer.println("<h1>DiscountAmount: "+ DiscountAmount+"</h1>");
    }
    public void destroy() {
    }
}