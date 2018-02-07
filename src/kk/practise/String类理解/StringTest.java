package kk.practise.String类理解;

/**
 * @author kangkai on 2017/10/20.
 */
public class StringTest {

    public static void main(String[] args) {
        char[] array01 = {'1','2','3'};
        byte[] array02 = {1,2,3};
        String str01 = new String(array01);
        String str02 = new String(array02);
        String str03 = new String("123");
        System.out.println("str="+str03.substring(1,0));//2
        System.out.println("str="+str02.substring(1));
        changeString(str01);
        System.out.println("调用了change方法后：str="+str01);
        str01 = "wet";
        System.out.println("str="+str01);


        char data[] = {'a', 'b', 'c'};
        String s = new String(data);
        System.out.println("s="+s);
    }

    static void changeString (String str) {
        str = "change";
    }

}
