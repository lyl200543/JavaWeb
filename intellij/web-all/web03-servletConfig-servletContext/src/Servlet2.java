import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 *ClassName: Servlet2
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 10:14
 *@Author lyl
 *@Version 1.0
 */
//servletContext:
//+ 容器会为每个app创建一个独立的唯一的ServletContext对象
//+ ServletContext对象为所有的Servlet所共享
//+ ServletContext可以为所有的Servlet提供初始配置参数
//
//

@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //获取servletContext
        ServletContext servletContext1 = getServletContext();
        ServletContext servletContext2 = getServletConfig().getServletContext();
        ServletContext servletContext3 = req.getServletContext();

        System.out.println(servletContext1==servletContext2);
        System.out.println(servletContext1==servletContext3);

        //获取参数
        String encoding = servletContext1.getInitParameter("encoding");
        System.out.println("encoding:"+encoding);

        Enumeration<String> ipn = servletContext1.getInitParameterNames();
        while(ipn.hasMoreElements()){
            String s = ipn.nextElement();
            System.out.println(s+"="+servletContext1.getInitParameter(s));
        }

    }
}
