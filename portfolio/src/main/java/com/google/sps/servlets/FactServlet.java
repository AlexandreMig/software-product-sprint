package com.google.sps.servlets;

import java.util.*;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fact")
public class FactServlet extends HttpServlet {

@Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    Random rand = new Random();
    int n = rand.nextInt(4);
    String[] fun_fact = {"I am learning AI", "Computers have been my passion since I was a kid",
                         "I watch and play soccer", "I was born in Brazil"};
    String fact = fun_fact[n];
    
    //Step 3 code
    String json = convertToJson(fun_fact);
    response.setContentType("application/json;");
    response.getWriter().println(json);
    //end
    /*
    response.setContentType("text/html;");
    response.getWriter().println("Fun fact: " + fact);
    */
  }
  public String convertToJson(String [] fact) {
    Gson gson = new Gson();
    String json = gson.toJson(fact);
    return json;
  }
}