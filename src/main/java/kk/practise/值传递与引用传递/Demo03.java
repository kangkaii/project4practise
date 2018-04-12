package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo03 {

    //对于自定义类型(按引用地址传递)
    public static void main(String[] args) {
        A a = new A("01");
        change(a);//相当于先 新建引用地址
        System.out.println(a.getName());

        A a02 = new A("88888");
        changeWithNew(a02);
        System.out.println(a02.getName());

        A a03 = a;
        System.out.println("新的a03是否会被一个已经有属性的a赋值成功？：");
        System.out.println(a03.getName()!=null?("success"):("没有成功"));

        A a04 = new A("88888");
        change02(a04);
        System.out.println(a04.getName()!=null?"success":"fail");

    }

    public static void change(A a) {
        a.setName("02");//通过新建的引用地址，去改变对象的值(没有新建对象，改变的仍然是原来的对象)
    }

    public static void changeWithNew(A a) {
        a = new A();
        a.setName("11");
    }

    public static void change02(A a) {
        A test = new A("test");
        test.setName("11");
        a = test;
    }

    /*
    *p1 x:2,p1 y:3
    *p1 x:2,p1 y:3
    *
    * Inside func arg1 x: 2,y:3
    * Inside func arg1 x: 100,y:100
    *
    * */


}
