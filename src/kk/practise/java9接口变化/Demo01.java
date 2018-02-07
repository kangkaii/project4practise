package kk.practise.java9接口变化;

/**
 * @author kangkai on 2017/11/20.
 */
public interface Demo01 {
    void fun01();
    void fun03();
    default void fun02(){};
    default void fun04(){System.out.println();}
    private void init() {System.out.println("Initializing"); }

}
