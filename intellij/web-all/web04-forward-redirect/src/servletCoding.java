import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpClient;

/**
 *ClassName: servletCoding
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 17:23
 *@Author lyl
 *@Version 1.0
 */

//请求乱码问题（GET,POST）
@WebServlet("/c1")
public class servletCoding extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //POST请求解决方法：
        req.setCharacterEncoding("GBK");

        String username = req.getParameter("username");
        System.out.println(username);
    }
}
