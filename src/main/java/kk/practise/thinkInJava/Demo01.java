package kk.practise.thinkInJava;

/**
 * @author kangkai on 2017/12/4.
 */
class Meal {
    Meal() { System.out.println("Meal()"); }
}
class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()");}
}
class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
class Sandwich extends PortableLunch {
    Bread  b = new Bread();

    Cheese c = new Cheese();

    Sandwich() {
        System.out.println("Sandwich()");
    }
    Lettuce l = new Lettuce();
    public static void main(String[] args) {
        new Sandwich();
    }
}
//1,调用子类的构造方法前，调用父类的------> Meal(),Lunch(),PortableLunch(),Sandwich()