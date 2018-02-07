package kk.practise.ifElseIf;

/**
 * @author kangkai on 2017/11/3.
 */
public class Demo01 {

    public static void main(String[] args) {

        int a = 1;
        if (a>0) {
            System.out.println("a>0");
        }
        else if (a>-1) {//有 else 不走，没有 else 进入
            System.out.println("a>-1");
        }
    }

}
