import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: Servlet3
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 10:39
 *@Author lyl
 *@Version 1.0
 */
@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //寻求：向upload中写入一个文件，涉及路径问题--》通过servletContext解决
        //获取资源的真实路径(部署目录下)(不同服务器的路径不同)
        ServletContext servletContext = getServletContext();
        String path = servletContext.getRealPath("upload/a.txt");
        System.out.println(path);

        //获取项目的上下文路径(可变化)
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
    }
}
