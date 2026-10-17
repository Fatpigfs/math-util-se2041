package com.lonbeotutien.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {

        // thuật toán tính n! = 1.2.3...n, 0...20
        if(n<0|| n>20){
            throw new IllegalArgumentException("invalid parameter. n must be betwwen 0 and 20");
        }

        if(n==0)    return 1;// n=0 return ngay


        // sure n từ 1 ...20
        long result =1;// khởi đầu giai thừa bằng 1, nhân dồn
        for (int i =1; i<=n;i++)    result *=i;
        return result;
    }
}
