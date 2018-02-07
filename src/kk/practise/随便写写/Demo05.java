package kk.practise.随便写写;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author kangkai on 2017/11/20.
 */
public class Demo05 {

   // @Stable
    private final int[] value;
    Demo05() {
        this.value = null;
    }

    String s;
    private byte coder;

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        //names.sort((o1, o2) -> {return o1.compareTo(o2); });
        names.sort(String::compareTo);
        System.out.println(names);


    }




}
