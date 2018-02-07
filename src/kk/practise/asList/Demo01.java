package kk.practise.asList;

import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo01 {

    public static void main(String[] args) {


        String s[] = {"aa","bb","cc"};
        List<String> sList = Arrays.asList(s);
        sList.add("");
        for(String str : sList){//能遍历出各个元素
            System.out.println(str);
        }
        System.out.println(sList.size());//为3

        System.out.println("- - - - - - - - - - -");

        int i[]={11,22,33};

        List intList= Arrays.asList(i);  //intList中就有一个Integer数组类型的对象，整个数组作为一个元素存进去的
        intList.add("1");

        for(Object o:intList){//就一个元素
            System.out.println(o.toString());
        }

        System.out.println("- - - - - - - - - - -");

        Integer ob[]={11,22,33};
        List<Integer> objList= Arrays.asList(ob);  //数组里的每一个元素都是作为list中的一个元素
        for(int a:objList){
            System.out.println(a);
        }

        System.out.println("- - - - - - - - - - -");
    }
}
