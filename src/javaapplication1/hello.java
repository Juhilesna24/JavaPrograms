/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author my pc
 */


public class hello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
    


