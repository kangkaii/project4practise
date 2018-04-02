package kk.practise.泛型;

/**
 * Created by  kk on 2017/9/6.
 */
class Test<A> {

    private A ob; // 定义泛型成员变量

    public Test(A ob) {
        this.ob = ob;
    }

    public A getOb() {
        return ob;
    }

    public void setOb(A ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("A的实际类型是: " + ob.getClass().getName());
    }

}
public class Test01 {
    public static void main(String[] args) {
        // 定义泛型类Gen的一个Integer版本
        Test<Integer> intOb = new Test<Integer>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("----------------------------------");

        // 定义泛型类Gen的一个String版本
        Test<String> strOb = new Test<String>("Hello Gen!");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value= " + s);

    }











}
