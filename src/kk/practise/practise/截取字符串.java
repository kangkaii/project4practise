package kk.practise.practise;

import java.io.UnsupportedEncodingException;

public class 截取字符串 {
    public static void main(String[] args)throws UnsupportedEncodingException {
        String str = "送111极大酒店家";
        //System.out.println(str.substring(2,3));
       // str = new String(str.getBytes("utf-8"));
        //计算长度
       // int lenStart = 0;
       // char c;
       // int count;
        //拆分
        char c ;
        for (int i=0;i<str.length();i++){
            c = str.charAt(i);
            System.out.println(String.valueOf(c).getBytes("UTF-8").length);
        }
        //String.valueOf(c).getBytes("UTF-8").length;
        //System.out.println(str.length());
        /*for (int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(true){
                lenStart+= 3;

                System.out.println(lenStart);
            }else{
                lenStart+= 1;

                System.out.println(lenStart);
            }
        }*/
        //System.out.println(lenStart);
    }

    // 如果字节数大于1，是汉字
    public static boolean isChineseChar(char c)
            throws UnsupportedEncodingException {
        return String.valueOf(c).getBytes("GBK").length > 1;
    }


}
