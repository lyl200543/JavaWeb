package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import common.Result;
import common.ResultCodeEnum;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.SysUser;
import service.SysUserService;
import service.impl.SysUserServiceImpl;
import util.MD5Util;
import util.WebUtil;
import util.WebUtil;

import java.io.IOException;
import java.io.PrintWriter;

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
        if (rows > 0) {
            resp.sendRedirect("/registSuccess.html");
        } else {
            resp.sendRedirect("/registFail.html");
        }
    }

    protected void login (HttpServletRequest req , HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        SysUser user = userService.findByName(username);
        if (null == user) {
            resp.sendRedirect("/loginUsernameError.html");
        } else if (! MD5Util.encrypt(password).equals(user.getUserPwd())) {
            resp.sendRedirect("/loginUserPwdError.html");
        } else {
            //添加用户信息到session域对象中，方便filter过滤
            HttpSession session = req.getSession();
            session.setAttribute("SysUser" , user);

            resp.sendRedirect("/showSchedule.html");
        }
    }

    protected void checkUsernameUsed (HttpServletRequest req , HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        SysUser user = userService.findByName(username);
        //响应信息格式不规范，处理方式不规范
        //后端响应回来的信息应当有一个统一的格式，前后端共同遵守响应一个JSON串
        //"code":"100/200/300/400/401”，业务状念码 本次请求的业务是否成功?如果失败了,是什么原因失败了?
        //"message":”业务状态码的补充说明/描述”
        //"data":{} 本次响应的数据成功/不成功 List<Schedule>

//        String info = "可用";
//        if (null != user) {
//            info = "已占用";
//        }
//        PrintWriter writer = resp.getWriter();
//        writer.write(info);

        Result result = Result.ok(null);
        if (null != user) {
            result = Result.build(null , ResultCodeEnum.USERNAME_USED);
        }
        //对象转换为json串,并响应
        WebUtil.writeJson(resp , result);
    }

}
