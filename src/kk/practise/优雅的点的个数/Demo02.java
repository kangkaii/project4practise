package kk.practise.优雅的点的个数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Demo02 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rSquare = in.nextInt();
        int count =0;
        double r = Math.sqrt(rSquare);

        //存储值
        for(int i=0;i<r;i++){
            /*运行超时
            for(int j=1;j<r+1;j++){
                if(i*i+j*j==rSquare){
                    count++;
                }
            }
            */
//优化点1
            double j = Math.sqrt(rSquare-i*i);
            if((int) j==j){
                count++;
                System.out.println(i+","+j);
            }
        }

        //优化点2
        System.out.print(count<<2);

    }

}
