import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: Servlet4
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 11:12
 *@Author lyl
 *@Version 1.0
 */
//+ 域对象: 一些用于存储数据和传递数据的对象,传递数据不同的范围,我们称之为不同的域,不同的域对象代表不同的域,共享数据的范围也不同
//+ ServletContext代表应用,所以ServletContext域也叫作应用域,是webapp中最大的域,可以在本应用内实现数据的共享和传递
//+ webapp中的三大域对象,分别是应用域,会话域,请求域

@WebServlet("/s4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //域对象的常见API：
        // void setAttribute(String key,Object value);  向域中存储/修改数据
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("ka" , "va");

        // Object getAttribute(String key);             获得域中的数据
        //String attr = (String) servletContext.getAttribute("ka");

        // void removeAttribute(String key);            移除域中的数据
        servletContext.removeAttribute("ka");
    }
}
