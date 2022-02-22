/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuoclt.mathutil.test;

import static com.phuoclt.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;
// java.util.ArrayList
// neu muon xai cac ham static, co 2 cach
// 1.goi ten class.ten ham static() import package...ten class chua ham static
// 2. goi ten ham, giong C (nho import static package...ten class.ten ham static

/**
 *
 * @author Phuoc
 */
public class MathUtilTest {

    @Test
    // Test case 1: getF() with valid argument
    // n = 0, expected = 1; actual ???
    public void testFactorialGivenValidArgumentReturnsWell() {
        long expected = 1;
        long actual = getFactorial(0);

        assertEquals(expected, actual);
    }

    @Test
    // Test case 2: getF() with valid argument
    // n = 6, expected = 720; actual ???
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720;
        long actual = getFactorial(6);

        assertEquals(expected, actual);
    }

    // ngoai le (ko phai la la value, la 1 tinh huong bat thuong co kha nang xay ra)
    // kh la value de so sanh kieu assertEquals()
    // chi do luong bang cach coi co xuat hien hay kh 
    @Test(expected = IllegalArgumentException.class) // xanh
    // Test case 3: getF() with valid argument
    // n = -5, expected = ngoai le xuat hien
    public void testFactorialGivenInvalidArgumentThrowException() {
        getFactorial(-5);
    }

}
