/**
 * ClassName: Dog
 * Package: PACKAGE_NAME
 * Description:创建于 2025/5/2 10:15
 *
 * @Author lyl
 * @Version 1.0
 */
public class Dog {
    private String name;

    public Dog () {
    }

    public Dog (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
