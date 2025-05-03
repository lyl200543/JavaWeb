import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: DOM4J
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/3 17:13
 *
 * @Author lyl
 * @Version 1.0
 */

//DOM4J进行XML解析
//DOM4J的使用步骤
//1.  导入jar包 dom4j.jar
//2.  创建解析器对象(SAXReader)
//3.  解析xml 获得Document对象
//4.  获取根节点RootElement
//5.  获取根节点下的子节点

//Node
//  Element
//  attribute
//  text
public class DOM4J {
    @Test
    public void test () throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("C:\\Users\\lyl\\Desktop\\JavaWeb\\intellij\\XML\\resources\\jdbc.xml");
        Element jdbc = document.getRootElement();
        System.out.println(jdbc.getName());
        System.out.println();
        List<Element> elements = jdbc.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
            System.out.println(element.attribute("id").getName());
            List<Element> ele = element.elements();
            for (Element element1 : ele) {
                System.out.println(element1.getName());
            }
            System.out.println();
        }
    }
}
