package com.example.tictactoe;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Tic Tac Toe</title></head>");
        out.println("<body><h1>Welcome to Tic Tac Toe!</h1>");
        out.println("<p>This is a placeholder. Implement the game logic here.</p>");
        out.println("</body></html>");
    }
}