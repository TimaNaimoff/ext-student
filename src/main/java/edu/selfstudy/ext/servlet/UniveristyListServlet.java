package edu.selfstudy.ext.servlet;

import edu.selfstudy.ext.domain.University;
import edu.selfstudy.ext.service.UniversityService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@WebServlet(name="UniveristyListServlet",urlPatterns={"/universityList"})

public class UniveristyListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctx=getServletContext();
        WebApplicationContext webCtx = WebApplicationContextUtils.getWebApplicationContext(ctx);
        UniversityService service = webCtx.getBean(UniversityService.class);
        List<University> universities = service.findFullUniversities();
        universities.forEach(u-> System.out.println(u.getUniversityName()+":"+u.getFaculties().size()));
        req.setAttribute("today", LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        req.setAttribute("universities",universities);
//        getServletContext().getRequestDispatcher("/university.jsp").
//                 forward(req,resp);
        getServletContext().getRequestDispatcher("/universityList_jstl.jsp").
                forward(req,resp);
    }
}
