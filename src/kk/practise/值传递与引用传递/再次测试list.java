package kk.practise.值传递与引用传递;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkai on 2018/3/1.
 */
public class 再次测试list {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(10);
        //测试 fun_noreturn

        //结论：不管方法有没有返回值，只要是把 list 入参 进入方法后 对list 操作@！
        //一定改变了 入参的 list ！！！
        //就算 入参的方法 重新new 了一个list (= 入参的list),还是改变了入参的list！！
        fun_return(list);
        System.out.println(list.size());

    }

    static void fun_noreturn(List<String> list) {
        List<String> list_fork = list;
        list_fork.add("sss");
    }

    static List<String> fun_return(List<String> list) {
        list.add("sss");
        return list;
    }




}
