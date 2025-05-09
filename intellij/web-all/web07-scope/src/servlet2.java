import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 *ClassName: servlet1
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/9 11:16
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/s2")
public class servlet2 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //请求域
        String request = (String) req.getAttribute("request");
        System.out.println("请求域：" + request);

        //会话域
        HttpSession session = req.getSession();
        String sessionAttribute = (String) session.getAttribute("session");
        System.out.println("会话域：" + sessionAttribute);

        //应用域
        ServletContext servletContext = getServletContext();
        String context = (String) servletContext.getAttribute("context");
        System.out.println("应用域:" + context);
    }
}
