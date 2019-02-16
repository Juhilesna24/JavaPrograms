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
class tables
{
    int i,j,n;
    public void t()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=10;j++)
            {
               int d=i*j;
                System.out.println(i+"*"+j+"="+d); 
            }
        }
    }
}
public class multi {
    public static void main(String args[])
    {
        tables o=new tables();
        o.t();
    }
    
}
