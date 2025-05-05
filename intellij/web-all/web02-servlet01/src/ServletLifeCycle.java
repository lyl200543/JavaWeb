import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletLifeCycle
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/5 19:07
 *
 * @Author lyl
 * @Version 1.0
 */

//实例化                  构造器          第一次请求/服务启动     1
//初始化                  init           构造完毕              1
//接收请求,处理请求 服务     service        每次请求             多次
//销毁                    destory        关闭服务              1

//Servlet在Tomcat中是单例的
//Servlet的成员变量在多个线程栈之中是共享的
//不建议在service方法中修改成员变量
//在并发请求时，会引发线程安全问题

//load-on-startup可以设置servlet的实例化时机
//默认为-1，表示在第一次请求时实例化
//正数为：在启动服务器时实例化
//load-on-startup中定义的正整数表示实例化顺序
//如果数字重复了,容器会自行解决实例化顺序问题,但是应该避免重复
//Tomcat容器中,已经定义了一些随系统启动实例化的servlet,我们自定义的servlet的load-on-startup尽量不要占用数字1-5

//default-servlet：当客户端请求的是静态资源时(.html .img),会实例化defaultservlet
//通过default-servlet得到资源的输入流以及写在responseServlet中的信息
//default-servlet 用于加载静态资源的servlet,默认随服务启动,默认启动序号为1

@WebServlet(value = "/s2",loadOnStartup = 100)
public class ServletLifeCycle extends HttpServlet {
    public ServletLifeCycle () {
        System.out.println("构造器");
    }

    @Override
    public void init (ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service...");
    }

    @Override
    public void destroy () {
        System.out.println("destroy..");
    }
}
