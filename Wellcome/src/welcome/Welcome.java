/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.math.BigDecimal;

/**
 *
 * @author Vladimir Dubenco
 */
public class Welcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] greeting = new String[3];
        greeting[0] = "Welcome to core Java";
        greeting[1] = "By Cay Horstmann"; 
        greeting[2] = "And Gary Cornell";
BigDecimal x;

        for (String g : greeting) {
            System.out.println(g);
        } //for

    }//main

}//Wellcome
