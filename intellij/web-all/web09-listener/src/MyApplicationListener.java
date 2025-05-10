import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

/**
 *ClassName: MyApplicationListener
 *Package: PACKAGE_NAME
 *Description:创建于 2025/5/10 9:28
 *@Author lyl
 *@Version 1.0
 */
//监听器：专门用于对域对象对象身上发生的事件或状态改变进行监听和相应处理的对象
//以应用域对象为例
//ServletContextListener:监听应用域对象的创建和销毁
//ServletContextAttributeListener:监听应用域对象数据的增删改
@WebListener
public class MyApplicationListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized (ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext.hashCode() + "应用域对象创建了");
    }

    @Override
    public void contextDestroyed (ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext.hashCode() + "应用域对象销毁了");
    }

    @Override
    public void attributeAdded (ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext servletContext = scae.getServletContext();
        System.out.println(servletContext.hashCode() + "应用域对象新增了" + name + ":" + value);
    }

    @Override
    public void attributeRemoved (ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext servletContext = scae.getServletContext();
        System.out.println(servletContext.hashCode() + "应用域对象移除了" + name + ":" + value);

    }

    @Override
    public void attributeReplaced (ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext servletContext = scae.getServletContext();
        Object newvalue = servletContext.getAttribute(name);
        System.out.println(servletContext.hashCode() + "应用域对象修改" + name + ":" + value + "为：" + newvalue);

    }
}
