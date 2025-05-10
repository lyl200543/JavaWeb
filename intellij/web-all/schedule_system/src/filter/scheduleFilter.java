package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 *ClassName: scheduleFilter
 *Package: filter
 *Description:创建于 2025/5/10 10:01
 *@Author lyl
 *@Version 1.0
 */
@WebFilter ({"/showSchedule.html" , "/schedule/*"})
public class scheduleFilter implements Filter {
    @Override
    public void doFilter (ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Object sysUser = session.getAttribute("SysUser");
        if (null == sysUser) {
            response.sendRedirect("/login.html");
        } else {
            filterChain.doFilter(servletRequest , servletResponse);
        }
    }
}
