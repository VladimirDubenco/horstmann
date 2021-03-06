/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigintegertest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Vladimir Dubenco <vladimirdubenco@gmail.com>
 */
public class BigIntegerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();
        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();
        /** вычислить биномиальный коэффициент по формуле: * п* (п-1) *(п-2)*...*(n-k+1) / (1*2*3*...*k)25 25 26 */
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
