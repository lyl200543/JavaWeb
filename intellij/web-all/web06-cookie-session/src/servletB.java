import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: servletB
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/8 19:01
 *@Author lyl
 *@Version 1.0
 */
//测试cookie
@WebServlet ("/servletB")
public class servletB extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //获取Cookie
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + "=" + cookie.getValue());
            }
        }
    }
}
