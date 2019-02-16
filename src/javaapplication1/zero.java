/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.io.*;

class Solution1{
    public static void main(String []argh){
        int s,j,p;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             j=1;
            s = a + (j*b);
            System.out.print(s);
            for(i=1;i<n;i++)
            {
               j=j*2;
               p = j * b;
               s =s + p;
               System.out.printf(" "+s);
               
            }
        }
        in.close();
    }
}