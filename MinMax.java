/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MinandMax {

    static int mimMaxArra(int a, int b, int c) {
        int big = a;
        if (b > big && b > c) {
            big = b;
        }
        if (c > big) {
            big = c;
        }
        int small = a;
        if (b < small && b < c) {
            small = b;
        }
        if (c < small) {
            small = c;
        }
        System.out.println("big:" + big);
        System.out.println("small:" + small);
        int result = big - small;
        return result;
    }

    static boolean validsation(int[] arra, int element) {
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int a[] = new int[]{10, 20, 30, 40, 50, 60};
        int b[] = new int[]{20, 30, 40, 50, 60};
        int c[] = new int[]{40, 50, 60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Value of Array A");
        int a1 = sc.nextInt();
        System.out.println("Enter the Value of Array B");
        int b1 = sc.nextInt();
        System.out.println("Enter the Value of Array C");
        int c1 = sc.nextInt();
        int res = 0;
        if (validsation(a, a1) && validsation(b, b1) && validsation(c, c1)) {
            res = mimMaxArra(a1, b1, c1);
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("Result is:" + res);

    }
}
