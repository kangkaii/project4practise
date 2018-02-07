package kk.practise.lambda表达式;

import java.util.Date;

/**
 * @author kangkai on 2018/1/30.
 * desc ：再次测试 lambda表达式写法
 */
@FunctionalInterface//如果下方接口定义不满足 函数式接口定义，则报错！
interface IArrayUtil{
    void iterate(Object [] array);
}

public class Demo02 {

    public static void main(String args[]){
        fun04();
        //fun02();
    }

    static void fun01() {
        IArrayUtil arrayUtil = new IArrayUtil() {//基本写法
            @Override
            public void iterate(Object[] array) {
                for (Object obj : array) {
                    System.out.println(obj);
                }
            }
        };
        arrayUtil.iterate(new String[] {"小张","小王"});
    }
    static void fun02() {
        IArrayUtil iArrayUtil = array -> {
            for (Object obj : array) {
                System.out.println(obj);
            }
        };
        iArrayUtil.iterate(new String[] {"小张","小王"});
    }

    static void fun03() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        new Thread(runnable).start();
    }

    static void fun04() {
        Runnable runnable = () ->{
            System.out.println(new Date());
        };
        new Thread(runnable).start();
    }



}