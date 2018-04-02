package kk.practise.List练习;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  kk on 2017/9/13.
 */
public class 练习1 {
    //两个List去掉重复元素放在一个List中去
    //已知
    //listOne：{1,2,3,4}
    //listTwo：{2,3,4,5}
    //结果： resultList：{1,2,3,4,5}
    //思路：
    //1,找到2个list中的重复数据
    //2,listOne除去重复或者listTwo除去重复
    //3,合并2个去重复后的list
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();

        for(int i=1;i<5;i++){
            listOne.add(i);
        }
        for(int i=2;i<6;i++){
            listTwo.add(i);
        }
        //1,找到2个list中的重复数据
        List<Integer> commonList = new ArrayList<>();
        listOne.forEach(o ->{
            listTwo.forEach(t ->{
                if (o.equals(t)) {
                    commonList.add(t);
                }
            });
        });
        System.out.println(commonList);
        //2,listOne除去重复或者listTwo除去重复
        listOne.removeAll(commonList);
        /*listOne.forEach(o ->{
            if (commonList.contains(o)) {
                listOne.remove(o);
            }
        });*/
       /* listTwo.forEach(t ->{
            if (commonList.contains(t)) {
                listTwo.remove(t);
            }
        });*/
        //3,合并2个去重复后的list
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(listOne);
        resultList.addAll(listTwo);
        //
        System.out.println(resultList);//12345
    }
}
