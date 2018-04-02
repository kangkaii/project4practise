package kk.practise.String的trim测试;

/**
 * @author kangkai on 2017/10/31.
 */
public class Demo01 {//trim只能去掉2端空格

    public static void main(String[] args) {

        String str01 = "1234";
        String str02 = "1234";
        if (str01.charAt(1) == '2') {
            str01 = str01.replaceFirst(Character.toString('2'),Character.toString(' '));
            System.out.println("'2'="+str01.trim());
        }
        char c = '2';
        if (str02.charAt(1) == c) {
            str02 = str02.replaceFirst(Character.toString(str02.charAt(1)),Character.toString(' '));
            System.out.println("c="+str02.trim());
        }
        String str03 = " 1 34";
        str03 = str03.replace(" ","");
        //去掉内部空格使用：
        System.out.println(str03.trim());

    }




}
