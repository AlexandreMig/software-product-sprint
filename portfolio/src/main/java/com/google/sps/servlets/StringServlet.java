package com.google.sps.servlets;

import java.util.*;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Handles requests sent to the /String URL.
@WebServlet("/String")
public class StringServlet extends HttpServlet {

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
      response.setContentType("text/html;");
      response.getWriter().println("<h1>Thank you for connecting with me!</h1>" + " I will get back to you shortly.");
    }
}