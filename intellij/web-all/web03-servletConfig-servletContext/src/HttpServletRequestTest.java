import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 *ClassName: HttpServletRequestTest
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 13:18
 *@Author lyl
 *@Version 1.0
 */

@WebServlet ("/h1")
public class HttpServletRequestTest extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //获取请求行信息相关(方式,请求的url,协议及版本)
        System.out.println(req.getMethod());  //方式
        System.out.println(req.getScheme());  //协议
        System.out.println(req.getProtocol());  //协议及版本
        System.out.println(req.getRequestURI());  //资源路径
        System.out.println(req.getRequestURL());  //完整路径

        System.out.println(req.getLocalPort()); //本应用容器的端口号 8080
        System.out.println(req.getRemotePort());  //客户端的端口号
        System.out.println(req.getServerPort());  //客户端发送请求时的端口号（代理服务器）

        //获得请求头信息相关
        System.out.println(req.getHeader("host"));

        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            System.out.println(s + "=" + req.getHeader(s));
        }

    }
}
