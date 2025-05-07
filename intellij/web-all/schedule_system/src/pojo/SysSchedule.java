package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *ClassName: SysSchedule
 *Package: pojo
 *Description:创建于 2025/5/7 10:08
 *@Author lyl
 *@Version 1.0
 */
//实体类的类名和表格名称应该对应(对应不是一致)
//实体类的属性名和表格的列名应该对应
//1.每个属性都必须是私有的
//2.每个属性都应该具备 getter setter
//3.必须具备无参构造器
//4.应该实现序列化接口(缓存，分布式项目数据传递可能会将对象序列化)
//5.应该重写类的hashcode相equals方法
//6.tostring是否重写都可以

//使用lombok帮助我们生成这些内容 getter setter 全参构造 无参构造 equals hashcode
//lombok使用步骤
//1 检查idea是否已经交装了lombok插件
//2 检查是否勾选厂enable annotation processer
//3 导入lombok的依赖
//4 在实体类上添加注解

@NoArgsConstructor    //无参构造器
@AllArgsConstructor   //全参构造器
@Data   //getter setter equals hashcode
public class SysSchedule implements Serializable {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;


}
