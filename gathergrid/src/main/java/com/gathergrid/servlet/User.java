package com.gathergrid.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "user", urlPatterns = "/User")
public class User extends HttpServlet {

    String message;
    public void init()
    {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jspPath = "/WEB-INF/event/User.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jspPath);

        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {

            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
