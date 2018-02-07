package kk.practise.String类理解;

/**
 * @author kangkai on 2017/10/23.
 */
public class Test02 {

    public static void main(String[] args) {
        String str = "0_1";
        String result = str.replace("_","/_");
        System.out.println(result);
    }

    public static void changeString(String str) {
        str = new String("02");
        //str = "02";
    }

}
