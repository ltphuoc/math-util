/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuoclt.mathutil.core;

/**
 *
 * @author Phuoc
 */
// Class cung cap cac tien ich/ loat cac ham toan hoc
// Giup cho cac class khac su dung... , vd app Calculator can 
// rat nhieu ham toan hoc
// Cai gi ma la tien ich dung chung, nen design la STATIC
public class MathUtil {

    // ham tinh n giai thua n! = 1.2.3....n
    // ko co giai thua so am
    // 0! = 1! = 1 quy uoc
    // giai thua tang rat nhanh, 20!
    // 21 vuot long vuot 18 so 0, tran
    // chan viec n < 0 va/hoac n > 21
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. "
                    + "n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1; // ket qua trung gian
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;

    }
}

