/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuoclt.mathutil.main;

import com.phuoclt.mathutil.core.MathUtil;

/**
 *
 * @author Phuoc
 */
public class Main {

    public static void main(String[] args) {
// ta kiem thu bang cach goi ham
// nhin ket qua cua ham tra ve (Actual) so sanh voi cai ta hi vong no tra ve
// vd 5! hy vong expected = 120

// test case 1: check getFactorial() with valid argument 
// n = 0, expected = 1; actual: ???
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
//compare
        System.out.println("0! -> expected: " + expected
                + "; actutal: " + actual);

// test case 2: check getFactorial() with valid argument 
// n = 6, expected = 720; actual: ???
        expected = 720;
        actual = MathUtil.getFactorial(6);
//compare
        System.out.println("6! -> expected: " + expected
                + "; actutal: " + actual);

// test case 3: check getFactorial() with valid argument 
// n = -5, expected = ?? nem ra ngoai le
//        expected = Exception;
        MathUtil.getFactorial(-5);
// nhin bang mat

    }
}
