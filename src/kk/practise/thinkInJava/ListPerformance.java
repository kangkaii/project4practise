package kk.practise.thinkInJava;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kangkai on 2017/12/5.
 */
public class ListPerformance {//测试LinkedList 与 ArrayList 各种性能
    //定义常量--->
    private static final int REPS = 100;
    //定义内部抽象类
    private abstract static class Tester{
        String name;
        int size;
        Tester(String name,int size){
            this.name = name;
            this.size = size;
        }
        abstract void test(List a);
    }

    //定义数组，调用上方内部类
    private static Tester[] tests = {
        /*new Tester("get",300){
            void test(List a){
                for(int i = 0; i < REPS; i++) {
                    for(int j = 0; j < a.size(); j++)
                        a.get(j);
                }
            }
        },*/
        new Tester("insert",30000){
            void test(List a){
                String str = "test";
                for(int i = 0; i < REPS/10; i++) {
                    for(int j = 0; j < size; j++)
                        a.add(str);
                }
            }
        }/*,
        new Tester("removeEnd",1500){
            void test(List a){
                for(int j = a.size(); j >= 0; j--)
                    a.remove(j);
            }
        },
        new Tester("removeStart",1500){
            void test(List a){
                for(int j = 0; j < a.size(); j++)
                    a.remove(j);
            }
        }*/
    };

    public static void test(List a) {
        //输出当前 list类型
        System.out.println("Testing " +
                a.getClass().getName());
        for(int i = 0; i < tests.length; i++) {
            //List.(a, tests[i].size);
            System.out.print(tests[i].name);
            //long t1 = System.currentTimeMillis();
            //int t1 = LocalTime.now().getNano();
            System.out.println("start time =  " + (LocalTime.now()));
            tests[i].test(a);
            //int t2 = LocalTime.now().getNano();
            System.out.println("end time =  " + (LocalTime.now()));

            //long t2 = System.currentTimeMillis();
            //System.out.println(": " + (t2 -t1));
            //System.out.println(": " + (t2 -t1));
        }
    }
    public static void main(String[] args) {
        test(new ArrayList());
        test(new LinkedList());
    }


}
