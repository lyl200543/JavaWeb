import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *ClassName: HttpServletResponseTest
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 14:06
 *@Author lyl
 *@Version 1.0
 */

@WebServlet("/h3")
public class HttpServletResponseTest extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //响应行 http/1.1 状态码
        resp.setStatus(200);

        //响应头
        resp.setHeader("keya","valuea");
        resp.setHeader("Content-Type","text/html");
        resp.setHeader("Content-Length","1234");

        //响应体
        //获得向响应体放入信息的字符输出流
        PrintWriter writer = resp.getWriter();
        writer.write("i love you");
        //获得向响应体放入信息的字节输出流
        //ServletOutputStream outputStream = resp.getOutputStream();

    }
}
