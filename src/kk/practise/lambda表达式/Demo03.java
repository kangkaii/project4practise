package kk.practise.lambda表达式;

/**
 * @author kangkai on 2018/1/30.
 */
@FunctionalInterface
interface IMammal {
    void move(String name);
}

public class Demo03 {

    public static void main(String[] args) {
        IMammal whale = (name) -> {//此 { 可以省略
            System.out.println(name+"正在移动......");
        };
        whale.move("鲸鱼");
    }


}
