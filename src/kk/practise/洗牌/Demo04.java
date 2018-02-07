package kk.practise.洗牌;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo04 {

        public static void run(int[] arr, int n, int k){ //2n张牌 处理k次
            for(int i=0; i<k; i++){
                int[] tmpArr = new int[arr.length];
                for(int j=0; j<n; j++){
                    tmpArr[2*j] = arr[j];
                    tmpArr[2*j+1] = arr[j+n];
                }
                //print(tmpArr);
                arr = tmpArr;
            }
            print(arr);
        }

        private static void print(int[] arr){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<arr.length; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for(int i=0; i<t; i++){
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] arr = new int[2*n];
                for(int j=0; j<2*n; j++){
                    arr[j] = scanner.nextInt();
                }
                run(arr, n, k);
            }
        }
}

