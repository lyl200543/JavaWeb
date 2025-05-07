package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.SysUser;
import service.SysUserService;
import service.impl.SysUserServiceImpl;

import java.io.IOException;

/**
 *ClassName: SysScheduleController
 *Package: controller
 *Description:创建于 2025/5/7 17:10
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/user/*")
public class SysUserController extends ServiceBase {
    private SysUserServiceImpl userService = new SysUserServiceImpl();

    protected void regist (HttpServletRequest req , HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        SysUser user = new SysUser(null , username , password);
        int rows = userService.regist(user);
        if(rows>0){
            resp.sendRedirect("/registSuccess.html");
        }
        else {
            resp.sendRedirect("/registFail.html");
        }
    }
}
