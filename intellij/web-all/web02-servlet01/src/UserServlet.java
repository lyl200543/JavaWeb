import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: UserServlet
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/5 14:54
 *
 * @Author lyl
 * @Version 1.0
 */

//servlet开发流程
//1.创建javaWEB项目，同时将tomcat添加为当前项目的依赖
//2.重写service力法 service(HttpServletRequest reg, HttpservletResponse resp)
//3.在service方法中,定义业务处理代码
//4.在web.xml中,配置servlet对应的请求映射路径

//补充：
//1.servlet-api.jar导入问题
// 编码的时候需要,运行的时候,在服务器的环境中
// 由服务软件(Tomcat)提供servlet-api
// 因此,我们的JAVAWEB项目中,在打包/构建的时候,是无需携带servlet-api的iar包

//2.Content-Type响应头的问题
// MIME类型响应头 媒体类型，文件类型,响应的数据类型
// MIME类型用于告诉客户端响应的数据是什么类型的数据,客户端以此类型决定用什么方式解析响应体
// tomcat根据拓展名在conf/web.xml下匹配对应的MIME类型（静态资源）
// 没有显示声明时，默认是text/html（动态资源）

public class UserServlet extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String info="<h1>YES</h1>";
        if("atguigu".equals(username))
            info="<h1>NO</h1>";
        //设置Content-Type
        resp.setHeader("Content-Type","text/html");
        //resp.setContentType("text/css");

        PrintWriter writer = resp.getWriter();
        writer.write(info);
    }
}
