import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *ClassName: servlet1
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/9 19:57
 *@Author lyl
 *@Version 1.0
 */
@WebServlet("/s1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1 was invoked");
        PrintWriter writer = resp.getWriter();
        writer.write("This is servlet1!");
    }
}
