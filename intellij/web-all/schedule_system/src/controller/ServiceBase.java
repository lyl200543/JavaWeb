package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 *ClassName: ServiceBase
 *Package: controller
 *Description:创建于 2025/5/7 17:30
 *@Author lyl
 *@Version 1.0
 */
public class ServiceBase extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String[] split = uri.split("/");
        String str = split[split.length - 1];
        Class clazz = this.getClass();
        try {
            Method method = clazz.getDeclaredMethod(str , HttpServletRequest.class , HttpServletResponse.class);
            method.setAccessible(true);
            method.invoke(this , req , resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
