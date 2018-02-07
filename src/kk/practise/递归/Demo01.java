package kk.practise.递归;

/**
 * @author kangkai on 2017/12/8.
 */
public class Demo01 {
    public static long fact(int n){
        if(n==1)   {
            return 1;
        }
        return fact(n-1)*n;//出现函数自调用
    }
    public static void main(String[] args) {
        System.out.println("10的阶乘 = "+fact(10));
    }
}
