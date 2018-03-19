package kk.practise.类初始化顺序.测试0312;

/**
 * @author kangkai on 2018/3/12.
 */
public class Z extends X {
    Y y  = new Y();
    public Z(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
class  X{
    Y y = new Y();
    public X(){
        System.out.println("X");
    }
}
class  Y{
    public Y(){
        System.out.println("Y");
    }
}
