package kk.practise.执行顺序;

/**
 * @author kangkai on 2017/11/29.
 */
class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    public int getField() {
        return 1111;
    }
    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {

    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.filed = " + sup.field +
                ", sup.getField() = " + sup.getField());//一定会 调用 子类重写的(比如，list.add会调用 实现类的 add)
        Sub sub = new Sub();
        System.out.println("sub.filed = " + sub.field +
                ", sub.getField() = " + sub.getField() +
                ", sub.getSuperField() = " + sub.getSuperField());
    }

}
