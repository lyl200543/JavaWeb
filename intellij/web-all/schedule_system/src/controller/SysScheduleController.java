package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 *ClassName: SysScheduleController
 *Package: controller
 *Description:创建于 2025/5/7 17:10
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/schedule/*")
public class SysScheduleController extends ServiceBase {
    protected void add (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }
}
