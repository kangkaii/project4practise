package kk.practise.final理解;

/**
 * @author kangkai on 2018/1/24.
 */
public class Demo {

    public void testObject() {
        final User user = new User();
        user.setName("111");
        user.setName("222");
    }
    public void testArray() {
        final int[] array = new int[]{1,2,3,4,5,6};
        //array = new int[]{1,2,3,4,5,6};
        array[1] = 2;
    }

}
class User{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//还有 static 修饰的 final 变量呢~
/*
Demo() {
    b = 1;
}
    Demo(int a) {
        //b = 1;
    }
static {
        c = 1;
        }
static {
        c = 2;
        }*/
