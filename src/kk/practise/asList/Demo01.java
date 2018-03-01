package kk.practise.asList;

import java.util.*;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo01 {

    public static void main(String[] args) {


        /*String s[] = {"aa","bb","cc"};
        List<String> sList = Arrays.asList(s);
        sList.add("");
        for(String str : sList){//能遍历出各个元素
            System.out.println(str);
        }
        System.out.println(sList.size());//为3

        System.out.println("- - - - - - - - - - -");*/

        String[] array = {"a","b","c"};
        List<String> resultList = new ArrayList<>(array.length);
        Collections.addAll(resultList,array);

        //System.out.println(resultList);
        //List<String> resultList = List.of(array);

       // List<String> resultList= new ArrayList<>(Arrays.asList(array));  //intList中就有一个Integer数组类型的对象，整个数组作为一个元素存进去的
        //array[0] = "xxxx";
        //resultList.add("1");
        System.out.println(resultList);


        System.out.println("- - - - - - - - - - -");
/*
        Integer ob[]={11,22,33};
        List<Integer> objList= Arrays.asList(ob);  //数组里的每一个元素都是作为list中的一个元素
        for(int a:objList){
            System.out.println(a);
        }

        System.out.println("- - - - - - - - - - -");*/
    }
}
