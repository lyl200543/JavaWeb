import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: JSONTest
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/2 10:17
 *
 * @Author lyl
 * @Version 1.0
 */
public class JSONTest {
    //对象与JSON串的转化
    @Test
    public void test () throws JsonProcessingException {
        Dog dog = new Dog("大黄");
        Person person = new Person("张三" , 20 , dog);
        System.out.println(person);

        //对象转化为JSON串
        ObjectMapper objectMapper = new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person);
        System.out.println(personStr);

        //将JSON串转化为对象
        Person person1 = objectMapper.readValue(personStr , Person.class);
        System.out.println(person1);
    }

    //Map,list,array 与JSON串的转化
    @Test
    public void test2 () throws JsonProcessingException {
//        Map map = new HashMap();
//        map.put("a" , "valuea");
//        map.put("b" , "valueb");

//        List list = new ArrayList();
//        list.add("a");
//        list.add("b");
//        list.add("c");

        Dog dog = new Dog("大黄");
        Person person = new Person("张三" , 20 , dog);
        Person[] arr=new Person[]{person};

        ObjectMapper objectMapper = new ObjectMapper();
        String Str = objectMapper.writeValueAsString(arr);
        System.out.println(Str);

    }
}
