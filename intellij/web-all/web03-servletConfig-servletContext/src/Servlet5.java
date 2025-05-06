import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: Servlet5
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 11:16
 *@Author lyl
 *@Version 1.0
 */
//通过域对象servletContext与servlet4通信
@WebServlet("/s5")
public class Servlet5 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String attr = (String) servletContext.getAttribute("ka");
        System.out.println(attr);
    }
}
