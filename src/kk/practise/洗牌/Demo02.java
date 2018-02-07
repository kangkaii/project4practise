package kk.practise.洗牌;

/**
 * @author kangkai on 2017/11/7.
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//数据组数
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] nnArray = new int[n*2];
            for (int i = 0; i < 2*n; i++) {
                nnArray[i] = sc.nextInt();
            }
            int[] newArray = new int[2*n];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    newArray[2*j] = nnArray[j];
                    newArray[2*j+1] = nnArray[j+n];
                }
                nnArray = newArray.clone();
            }
            for (int i = 0; i < n*2; i++) {
                sb.append(nnArray[i]+" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

}

