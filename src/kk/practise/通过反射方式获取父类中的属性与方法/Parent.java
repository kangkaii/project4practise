package kk.practise.通过反射方式获取父类中的属性与方法;

/**
 * @author kangkai on 2017/12/29.
 */
public class Parent {

    public String publicField  = "1";

    String defaultField = "2";

    protected String protectedField = "3";

    private String privateField = "4" ;

    public void publicMethod() {
        System.out.println("publicMethod...");
    }

    void defaultMethod() {
        System.out.println("defaultMethod...");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod...");
    }

    private void privateMethod() {
        System.out.println("privateMethod...");
    }

}
