import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *ClassName: servletCoding2
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 17:38
 *@Author lyl
 *@Version 1.0
 */
//响应乱码问题：
@WebServlet("/c2")
public class servletCoding2 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //1.设置响应体的字符集和浏览器解析响应体的默认字符集一致
        //resp.setCharacterEncoding("GBK");

        //2.设置content-type响应头,告诉浏览器以指定的字符集解析响应体
        //resp.setContentType("text/html;charset=UTF-8");

        //万全之策
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.write("你好，hello");
    }
}
