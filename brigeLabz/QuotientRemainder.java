//to find QuotientRemainder
package com.brigeLabz;
import java.util.Scanner;

class QuotientRemainder{
    public static void main(String[] args) {
        System.out.print("Enter dividend : " );
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();

        System.out.println("Quotient is : " + dividend/divisor );
        System.out.println("Remainder is : " + dividend%divisor );
    }
}