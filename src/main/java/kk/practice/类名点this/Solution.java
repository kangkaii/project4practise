package kk.practice.类名点this;import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;/** * @author kangkai on 2018/7/26. */public class Solution {    static Map<Integer,String> voiceMap = new HashMap<Integer,String>(){{        this.put(1,"");        this.put(10,"十");        this.put(100,"百");        this.put(1000,"千");    }};    static Map<Integer,String> numMap = new HashMap<Integer,String>(){{        this.put(1,"一");        this.put(2,"二");        this.put(3,"三");        this.put(4,"四");        this.put(5,"五");        this.put(6,"六");        this.put(7,"七");        this.put(8,"八");        this.put(9,"九");        this.put(0,"零");    }};    public static String numToVoice(int nums) {        Map<Integer,String> rMap = new HashMap<Integer,String>(){{            this.put(0,"");            this.put(1,"万");            this.put(2,"亿");        }};        if (nums <= 0) {            return "零";        }        String numsString = String.valueOf(nums);        List<String> list = new ArrayList<>(10);        while (numsString.length() >= 0) {            String s = "";            if (numsString.length() > 4) {                s = numsString.substring(numsString.length()-4,numsString.length());                list.add(s);                numsString = numsString.substring(0,numsString.length()-4);            }else {                list.add(numsString);                break;            }        }        //list desc        StringBuilder result = new StringBuilder("");        for (int i = list.size()-1; i >= 0; i--) {            int s = Integer.valueOf(list.get(i));            result.append(getString(s)).append(rMap.get(i));        }        return result.toString();    }    private static String getString (int num) {        StringBuilder sb = new StringBuilder("");        for (int i = 1000;i>=1;i = i/10) {            if (num/i != 0) {                Integer r = num/i;                sb.append(numMap.get(r)).append(voiceMap.get(i));                num = num%i;            }        }        return sb.toString();    }    public static void main(String[] args) {        System.out.println(numToVoice(111551));    }}