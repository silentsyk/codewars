/**
 * Created by sky on 2017/8/21.
 */
public class Processor {
    public void process(String str, TestObject testObject) {
        str = str + "123";
        testObject.setAddress("hz")
                .setAge(18)
                .setName("sky");
    }
}
