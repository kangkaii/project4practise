package kk.practise.随便写写;

/**
 * @author kangkai on 2017/11/15.
 */
public class Demo04 {

    Runnable r1 = () -> { System.out.println(this); };
    Runnable r2 = () -> { System.out.println(toString()); };

    public String toString() {  return "Hello, world"; }
    public static void main(String[] args) {

        new Demo04().r1.run();
        new Demo04().r2.run();

    }

}
