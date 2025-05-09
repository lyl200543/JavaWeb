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
@WebFilter ("/*")
public class filter3 implements Filter {
    @Override
    public void doFilter (ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter3 before doFilter invoked");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter3 after doFilter invoked");
    }
}
