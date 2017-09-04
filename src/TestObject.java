/**
 * Created by sky on 2017/8/21.
 */
public class TestObject {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public TestObject setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public TestObject setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getAge() {
        return age;
    }

    public TestObject setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
