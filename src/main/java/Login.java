/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hallur
 */
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    Gson gson = new Gson();
    String trueResponse;
    String falseResponse;
    JsonParser jsonParser = new JsonParser();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        
        trueResponse = gson.toJson(new Response("That was true"));
        falseResponse = gson.toJson(new Response("That was false"));
        
        JsonObject trueResponseObject = (JsonObject) jsonParser.parse(trueResponse);
        JsonObject falseResponseObject = (JsonObject) jsonParser.parse(falseResponse);
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        try (PrintWriter out = response.getWriter()) {
            if ((user.equals("hallur") && password.equals("123"))
                    || (user.equals("mo") && password.equals("321"))
                    || (user.equals("karl") && password.equals("456"))
                    || (user.equals("peter") && password.equals("654"))) {
                out.print(trueResponseObject);
            } else {
                out.println(falseResponseObject);
            }
            out.flush();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
