package com.lonbeotutien.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {


    // test case #1:  n=5!, expected =120
    @Test
    void gtestFactorialGivenValidN5ReturnsWells120() {
        int n=5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);


        // so sánh bằng cơm hay bằng framwork
        // bằng cơm, in log file, đã chơi và nay kochoiw. xem bên main()
        // so sánh bằng tool xanh đó
        assertEquals(expected, actual);
    }
    //test case #2: n = 0!, expected = 1
    @Test
    void gtestFactorialGivenValidN0ReturnsWells1() {
        int n=0;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);


        // so sánh bằng cơm hay bằng framwork
        // bằng cơm, in log file, đã chơi và nay kochoiw. xem bên main()
        // so sánh bằng tool xanh đó
        assertEquals(expected, actual);
    }


    //test case #3: n = -1!, expected = hàm phai ném ra ngoại lệ thì mới là hàm đúng ,vì dự iến -1 phải ném ra ngoại lệ !!!
    //thấy ngoại lệ là thấy màu xanh
    //ngoại l là thứ ko thể asserEquals() ta phải dùng 1 assert khác
    @Test
    void gtestFactorialGivenInvalidNMinus1ThrowsException(){
        int invalidN = -1;
//        assertThrows(ngoại lệ cần bắt xem có xh ko, hamlamda có lệnh goi hàm code chính mà gay ra lỗi);
        //assertThrows(IllegalAgrumentException.class(), () -> {});
        assertThrows(IllegalArgumentException.class,
                () -> {
            MathUtil.getFactorial(invalidN);
            }
        );
    }

}