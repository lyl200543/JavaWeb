import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: servletA
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/8 19:01
 *@Author lyl
 *@Version 1.0
 */
@WebServlet("/servletA")
public class servletA extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //添加Cookie
        Cookie cookie1 = new Cookie("keya" , "valuea");
        //设置Cookie的时效性，默认为一次会话（打开浏览器）
        //cookie1.setMaxAge(60); //秒

        //设置Cookie的提交路径(必须是绝对路径)
        cookie1.setPath("/web06/servletB");

        Cookie cookie2 = new Cookie("keyb" , "valueb");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
