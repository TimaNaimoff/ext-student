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
import java.util.List;

@WebServlet(name="UniveristyListServlet",urlPatterns={"/universityList"})

public class UniveristyListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctx=getServletContext();
        WebApplicationContext webCtx = WebApplicationContextUtils.getWebApplicationContext(ctx);
        UniversityService service = webCtx.getBean(UniversityService.class);
        List<University> universities = service.findUniversities();
        universities.forEach(u-> System.out.println(u.getUniversityName()+":"+u.getFaculties().size()));
        getServletContext().getRequestDispatcher("/university.jsp").
                 forward(req,resp);
    }
}
