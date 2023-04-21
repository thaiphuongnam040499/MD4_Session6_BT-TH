package com.example.md4_session6_th4_ungdungtudiendongian;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/translate")
public class HelloServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin Chào");
        dictionary.put("how","Thế Nào");
        dictionary.put("what","Cái gì");
        dictionary.put("book","quyển sách");
        dictionary.put("Hieu","Con Lon");
        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if (result != null){
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        }else {
            writer.println("Not Found");
        }
        writer.println("</html>");
    }

    public void destroy() {
    }
}