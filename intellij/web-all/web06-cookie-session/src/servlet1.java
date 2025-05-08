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
 *Description:创建于 2025/5/8 20:24
 *@Author lyl
 *@Version 1.0
 */
//测试session
//cookie针对每次会话，session针对每个客户端
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //判断请求中有没有一个特殊的cookie  JSESSIONID
        //1.有
        // 根据JSESSIONID找对应session对象
            // 1>找到了
            //返回之前的session
            // 2>没找到(session有时效性)
            // 创建一个新的session返回,并且向response对象中存放一个JSESSIONID 的cookie
        //2.没有
        //创建一个新的session返回,并且向response对象中存放一个JSESSIONID 的cookie

        System.out.println(session.getId());
        System.out.println(session.isNew());

        String username = req.getParameter("username");
        session.setAttribute("username",username);
    }
}
