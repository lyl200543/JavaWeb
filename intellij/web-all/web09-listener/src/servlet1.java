import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: servlet1
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/10 9:42
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/s1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("key" , "value");
        servletContext.setAttribute("key" , "valueXXXX");
        servletContext.removeAttribute("key");
    }
}
