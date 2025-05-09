import jakarta.servlet.*;

import java.io.IOException;

/**
 *ClassName: lifeCycleFilter
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/9 21:04
 *@Author lyl
 *@Version 1.0
 */
//Filter的生命周期
//构造器           项目启动
//初始化 init      构造完毕
//过滤  doFilter   每次请求
//销毁  destroy
public class lifeCycleFilter implements Filter {
    public lifeCycleFilter(){
        System.out.println("构造器");
    }
    @Override
    public void init (FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
        System.out.println(filterConfig.getInitParameter("keya"));
    }

    @Override
    public void destroy () {
        System.out.println("销毁");
    }

    @Override
    public void doFilter (ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
