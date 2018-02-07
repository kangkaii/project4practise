package kk.practise.洗牌;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//数据组数
        System.out.println(t);
        StringBuilder sb = new StringBuilder("");
        while (t > 0) {
            String nAndK = sc.nextLine();
            if ("".equals(nAndK)) {
                continue;
            }
            int n = Integer.parseInt(nAndK.split(" ")[0]);
            int k = Integer.parseInt(nAndK.split(" ")[1]);
            //int n = sc.nextInt();
            //int k = sc.nextInt();
            System.out.println("n="+n);
            System.out.println("k="+k);
            String nn = sc.nextLine();
            int [] nnArray = new int[n*2];
            for (int i = 0; i < 2*n; i++) {
                nnArray[i] = Integer.parseInt(nn.split(" ")[i]);
            }
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    change(nnArray,2*j+1,n+j);
                }
            }
            for (int i = 0; i < n*2; i++) {
                sb.append(nnArray[i]+" ");
            }
            //sb.append(Arrays.asList(nnArray));
            t--;
        }
        System.out.println(sb.toString().trim());
    }

    public static void change(int[] array,int a,int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
