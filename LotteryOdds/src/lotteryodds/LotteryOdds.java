/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryodds;

import java.util.Scanner;

/**
 *
 * @author Vladimir Dubenco <vladimirdubenco@gmail.com>
 */
public class LotteryOdds {

  
    public static void main(String[] args) {
     
        
        Scanner in = new Scanner (System.in);
        System.out.print ("How many numbers do you need to draw? "); int k = in.nextInt (); 
        System.out.print ("What is the highest number you can draw? "); int n = in.nextInt (); 
        /*18 * вычислить биномиальный коэффициент по формуле: * п*(п-1)*(п-2)*...*(n-k+1) / (1*2*3*...*k)19 20 */
        int lotteryOdds = 1; for (int i= 1; i<= k; i++) lotteryOdds = lotteryOdds * (n-i+1) / i; 
        System.out.println( "Your odds are 1 in " + lotteryOdds + ". Good luck!"); 
        
    }
        
        
    }
    
