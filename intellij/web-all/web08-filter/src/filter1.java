import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 *ClassName: filter1
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/9 21:28
 *@Author lyl
 *@Version 1.0
 */
//过滤器链：
//使用web.xml时：顺序与filter-mapping的顺序有关 1->2->3 3->2->1
//使用注解时，顺序与类名的字符顺序有关
@WebFilter("/*")
public class filter1 implements Filter {
    @Override
    public void doFilter (ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter1 before doFilter invoked");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter1 after doFilter invoked");
    }
}
