import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *ClassName: viewServlet
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 19:39
 *@Author lyl
 *@Version 1.0
 */
@WebServlet ("/v")
public class viewServlet extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //路径是相对于web根目录来说
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/view.html");
        requestDispatcher.forward(req , resp);

    }
}
