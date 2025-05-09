import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 *ClassName: servlet1
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/9 11:16
 *@Author lyl
 *@Version 1.0
 */
//+ web项目中,我们一定要熟练使用的域对象分别是 请求域,会话域,应用域
//+ 请求域对象是HttpServletRequest ,传递数据的范围是一次请求之内及请求转发
//+ 会话域对象是HttpSession,传递数据的范围是一次会话之内,可以跨多个请求(同一个客户端)
//+ 应用域对象是ServletContext,传递数据的范围是本应用之内,可以跨多个会话(一次应用的开启和关闭)
//> 域对象的API
//| API                                         | 功能
//| ------------------------------------------- | ------------------
//| void setAttribute(String name,String value) | 向域对象中添加/修改数据
//| Object getAttribute(String name);           | 从域对象中获取数据
//| removeAttribute(String name);               | 移除域对象中的数据
@WebServlet ("/s1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //请求域对象
        req.setAttribute("request" , "requestMessage");

        //会话域对象
        HttpSession session = req.getSession();
        session.setAttribute("session" , "sessionMessage");

        //应用域对象
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("context" , "contextMessage");

        //一次请求
        String request = (String) req.getAttribute("request");
        System.out.println("请求域：" + request);

        //请求转发
        req.getRequestDispatcher("s2").forward(req , resp);
    }
}
