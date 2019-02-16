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
class array
{
    int a[]=new int[20];
    int b[]=new int[20];
    int n,k,i,count=0,j;
    public void rotate(int k)
    {
        Scanner in=new Scanner(System.in);  
        System.out.println("enter the value of n");
        n=in.nextInt();
          System.out.println("enter the values");

        for(i=1;i<=n;i++)
        {
           a[i]=in.nextInt();           
        }
       j=1;
        for(i=k+1;i<=n;i++)
        {
        b[j]=a[i];
        j++;
        }
        for(i=1;i<=k;i++)
        {
            b[j]=a[i];
            j++;
        }
        System.out.println("Rotated Array");
            for(i=1;i<=n;i++)
            {
                System.out.println(b[i]);
            }
        }
        
    }
public class RotateArray {
  public static void main(String[] args) {
      int k;
      System.out.println("enter the position");
      Scanner o=new Scanner(System.in);
      k=o.nextInt();
      array a=new array();
      a.rotate(k);
  }
    
}
