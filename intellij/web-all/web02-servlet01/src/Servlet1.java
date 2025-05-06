import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Servlet1
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/5 17:00
 *
 * @Author lyl
 * @Version 1.0
 */
//通过注解建立servlet类和路径的关系
//不需要再在web.xml中写对应的代码

//@WebServlet (value = {"/s1","/xxx","/servlet1"})
@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
    //自定义Servlet中,必须要对处理请求的方法进行重写
    //    + 要么重写service方法
    //    + 要么重写doGet/doPost方法
    //    （定义在HttpServlet中，由service()调用，本身内容为返回405状态（请求失败），因此必须重写）

//    @Override
//    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("访问Servlet1了");
//    }


    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET方法请求");
    }

    @Override
    protected void doPost (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST方法请求");
    }
}
