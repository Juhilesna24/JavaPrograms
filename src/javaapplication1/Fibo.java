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
class fibonacci
{
    int i,a=0,b=1,c,d,n;
    public void obj()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\n enter the value of n");
        n=in.nextInt();
        for(i=0;i<=n;i++)
        {
         c=a+b;
         b=a;
         a=c;
         System.out.println(c);
        }
        
        
    }
}
public class Fibo {
    public static void main(String args[])
    {
        fibonacci f=new fibonacci();
        f.obj();
    }
    
}
