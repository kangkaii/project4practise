package kk.practise.String类理解;

/**
 * @author kangkai on 2017/11/14.
 */
public  class Demo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" ");
        String str = new String(sb);
        System.out.println(str.getClass());
        final  Integer x = 1;
        final String s = " ";
        final int[] array = new int[]{1,2,3,4,5,6};
        array[1] = 22;
        System.out.println(array[1]);
        final int i;
        //s = "";//被final修饰，不能更改；
        //x = 2;//被final修饰，不能更改；
    }


}
