import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 *ClassName: HttpServletRequestTest2
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/6 13:47
 *@Author lyl
 *@Version 1.0
 */
@WebServlet("/h2")
public class HttpServletRequestTest2 extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //获取key=value形式的参数
        //获得单个键值对
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("pwd"));
        //获得多个键值对
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        //获取所有键值对
        //1.
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            String[] parameterValues = req.getParameterValues(name);
            if(parameterValues.length>1)
                System.out.println(Arrays.toString(parameterValues));
            else
                System.out.println(parameterValues[0]);
        }

        //2.
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for(Map.Entry<String, String[]> entry:entries){
            String key = entry.getKey();
            String[] parameterValues = req.getParameterValues(key);
            if(parameterValues.length>1)
                System.out.println(Arrays.toString(parameterValues));
            else
                System.out.println(parameterValues[0]);
        }
    }


    //以上API专门用于获取key=value形式的参数，无论这些参数是在url后还是在请求体中
    //如何获得请求体中的非键值对数据?
        //1.获取一个从请求体中读取字符的字符输入流
        //BufferedReader reader=reg.getReader():JSON串
        //2.获得一个从请求中读取二进制数据字节的输入流
        //ServletInputStream inputstream=reg.getInputStream();文件
}
