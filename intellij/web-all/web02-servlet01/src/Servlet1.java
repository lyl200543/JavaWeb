import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Servlet1
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/5 17:00
 *
 * @Author lyl
 * @Version 1.0
 */
//通过注解建立servlet类和路径的关系
//不需要再在web.xml中写对应的代码

//@WebServlet (value = {"/s1","/xxx","/servlet1"})
@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("访问Servlet1了");
    }
}
