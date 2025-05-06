import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: ServletA
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 14:41
 *@Author lyl
 *@Version 1.0
 */
@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletB has executed");
        System.out.println(req.getParameter("money"));
    }
}
