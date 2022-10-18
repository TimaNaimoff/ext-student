package edu.selfstudy.ext.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="UniveristyListServlet",urlPatterns={"/universityList"})
public class UniveristyListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/university.jsp").
                 forward(req,resp);
    }
}
