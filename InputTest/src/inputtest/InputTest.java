/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtest;

import java.util.*;

/**
 *
 * @author Vladimir Dubenco <vladimirdubenco@gmail.com>
 */
public class InputTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age =  in.nextInt();
        String name = in.nextLine();
        System.out.println("Domnule " + name + ", anul viitor veti avea " + ++age + " ani");
        // TODO code application logic here
    }
    
}
