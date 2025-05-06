import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: Servlet1
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 15:31
 *@Author lyl
 *@Version 1.0
 */

@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet2 has executed");
        System.out.println("Servlet2:"+req.getParameter("money"));

    }
}
