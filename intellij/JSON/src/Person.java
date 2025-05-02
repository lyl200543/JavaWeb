/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/2 10:15
 *
 * @Author lyl
 * @Version 1.0
 */
public class Person {
    private String name;
    private Integer age;
    private Dog dog;

    public Person () {
    }

    public Person (String name , Integer age , Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public Dog getDog () {
        return dog;
    }

    public void setDog (Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
