package kk.practise.随便写写;

/**
 * @author kangkai on 2018/2/27.
 */
public class Inherance {
    public static void main(String[] args){
        ChildClass clazz = new ChildClass();
        ChildClass.staticMethod();
        clazz.method();
    }
}
/*第5题运行结果：

        B Y A X Z*/

class ParentClass{
    public ParentClass(){
        System.out.println("A");
    }
    public static void staticMethod(){
        System.out.println("B");
    }
    public void method(){
        System.out.println("C");
    }
}

class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("X");
    }
    public static void staticMethod(){
        System.out.println("Y");
    }
    public void method(){
        System.out.println("Z");
    }
}

