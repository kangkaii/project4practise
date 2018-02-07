package kk.practise.泛型理解;

import org.junit.Test;

/**
 * @author kangkai on 2017/10/19.
 */
public class Demo01 {
    @Test
    public void test() {
        Box<String> b = new Box<>();
       // b.get(b);

    }
}
class Box<T>{
    public T get(T t) {return t;}
}