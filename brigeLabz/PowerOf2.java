//Power Of 2
package com.brigeLabz;
import java.util.Scanner;

class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power of 2 : ");
        int n = sc.nextInt();

        int mul = 2, i = 1;

        while (i < n) {
            mul = mul * 2;
            i++;
        }
        System.out.println("Power of 2 is :" + mul);

    }
}
