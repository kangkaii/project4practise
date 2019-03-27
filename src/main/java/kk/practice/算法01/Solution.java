package kk.practice.算法01;import java.util.ArrayList;import java.util.Arrays;/** * 求素数个数 * https://blog.csdn.net/ghsau/article/details/78768157 * @author kangkai on 2018/11/29. */class Solution {    /**     * 只能用于计算数量（找到非素数）     */    public static int countPrimes(int n) {        if (n < 3) {            return 0;        }        int count = n / 2;// 筛掉一半偶数        boolean[] notPrime = new boolean[n];        for (int i = 3; i * i < n; i += 2) {// 只筛3≤i<√n奇数            if (!notPrime[i]) {                // 筛掉素数的奇数倍数                for (int j = i * i; j < n; j += 2 * i) {// 从i*i开始筛                    if (!notPrime[j]) {                        notPrime[j] = true;                        count--;                    }                }            }        }        return count;    }    public static void main(String[] args) {       System.out.println( countPrimes(100));       System.out.println( getCount(100));    }    private static int getCount(int n) {        if (n < 3) {            return 0;        }        int count = n/2;        int[] prime = new int[n];        for(int i : prime) {            prime[i] = i+1;        }        boolean[] notPrime = new boolean[n]; //默认全都是false        for (int i = 3; i*i < n; i += 2) {//i到根号n 之间的 奇数            if (!notPrime[i]) {                //除去 素数的 奇数倍数（比如 3 就除去 9, 15,21，27。。）                for (int j = i*i; j < n; j += 2*i) {                    if (!notPrime[j]) {//默认一定进入 这个if。只有像 45 等数，被3发现后，索引更新为true，避免多减。被5发现的时候 不进入此if                        //这些数一定都是非 素数                        notPrime[j] = true;                        count--;                    }                }            }        }        return count;    }}