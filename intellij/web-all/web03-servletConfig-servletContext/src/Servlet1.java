import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Enumeration;

/**
 * ClassName: Servlet1
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/6 9:23
 *
 * @Author lyl
 * @Version 1.0
 */
//servletConfig:
//+ 为Servlet提供初始配置参数的一种对象,每个Servlet都有自己独立唯一的ServletConfig对象
//+ 容器会为每个Servlet实例化一个ServletConfig对象,并通过Servlet生命周期的init方法传入给Servlet作为属性
//相关声明和定义在GenericServlet

@WebServlet (
        urlPatterns = "/s1",
        initParams = {@WebInitParam (name = "keya", value = "valuea") , @WebInitParam (name = "keyb", value = "valueb")}
)
public class Servlet1 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //获取参数
        ServletConfig servletConfig = getServletConfig();
        String keya = servletConfig.getInitParameter("keya");
        System.out.println("keya:" + keya);

        //Enumeration：早期的迭代器
        //hasMoreElements():判断有没有下一个元素
        //nextElement():获取当前元素，并将游标向下移一位
        Enumeration<String> keys = servletConfig.getInitParameterNames();
        while (keys.hasMoreElements()) {
            String s = keys.nextElement();
            System.out.println(s + "=" + servletConfig.getInitParameter(s));
        }
    }
}
