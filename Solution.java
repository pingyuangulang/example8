/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
public class Solution {
    public static void main(String[] args){
        int count = new Solution().NumberOf1(3);
        System.out.println("count = "+count);
        System.out.println(Integer.toBinaryString(3));
    }
    /*
    问题：
    输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
    */
    
    /*
    解决思路：
    如果这个数不为0，那么其二进制中至少有一位是1，
    假设该数的二进制中最右边的1在二进制的第m位，
    那么该数减1之后第m位就变成了0，m以后的位就变成了1，m以前的位保持不变；
    例如1100减1后变成了1011，两者进行与运算得1000，这样该数中就消除了一个1，如此能消多少次就有多少个1。
    */
    public int NumberOf1(int n) {
        /*最优解法
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
         }
        return count;
        */
        //转换成字符串
        if(n==0)
            return 0;
        int count = 0;
        String str = Integer.toBinaryString(n);
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }

}
