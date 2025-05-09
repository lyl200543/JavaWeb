import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *ClassName: loggingFilter
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/9 19:59
 *@Author lyl
 *@Version 1.0
 */
//日志过滤器 记录请求的历史 将日志打印到控制台
//1实现Filter接口
//2重写过滤方法
//3配置过滤器
    //web.xml
    //注解

public class loggingFilter implements Filter {
    //过滤请求和响应的方法
    //1请求到达目标资源之前，先经过该方法
    //2该方法有能力控制请求是否继续向后到达目标资源,可以在该方法内直接向客户端做响应处理
    //3请求到达目标资源后，响应之前，还会经过该方法
    @Override
    public void doFilter (ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        //1请求到达目标资源之前的功能代码
            //判断是否登录
            //校验权限是否满足
        //2放行代码
        //3响应之前 HttpServletResponse转换为响应报文之前的功能代码

        //System.out.println("loggingFilter invoked before doFilter");

        //放行代码
        //如果有下一个过滤器，就进入到下一个过滤器，如果没有就到目标资源
        //filterChain.doFilter(servletRequest,servletResponse);

        //System.out.println("loggingFilter invoked after doFilter");



        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        //1请求到达目标资源之前打印日志 yyyy-MM-dd HH:mm:ss *** 被访问了
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(new Date());
        String uri = request.getRequestURI();
        System.out.println(date+" "+uri+"被访问了");
        long start = System.currentTimeMillis();

        //2放行
        filterChain.doFilter(servletRequest,servletResponse);

        //响应之前的功能代码 ***资源在yyyy-MM-ddHH:mm:ss的请求耗时毫秒
        long end = System.currentTimeMillis();
        System.out.println(uri+"资源在"+date+"的请求耗时"+(end-start)+"毫秒");
    }
}
