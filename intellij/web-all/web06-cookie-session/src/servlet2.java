import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 *ClassName: servlet2
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/8 20:25
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/servlet2")
public class servlet2 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        System.out.println(session.isNew());

        String username = (String) session.getAttribute("username");
        System.out.println(username);
    }
}
