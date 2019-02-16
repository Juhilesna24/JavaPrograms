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
public class End {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int counter=1;
        String line = "";
        while(in.hasNext())
        {
            line = String.format(counter+" "+in.nextLine());
            counter++;
            System.out.println(line);
        }
        in.close();
    }
    
}
