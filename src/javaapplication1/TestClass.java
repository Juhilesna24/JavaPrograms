/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author my pc
 */
import java.util.*;
class subs{ 
    int z,s,count=0,i,j,p,t;  
    void sub()
    {
     Scanner in=new Scanner(System.in);
        System.out.println("enter t");
        t=in.nextInt();
    for(i=1;i<=t;i++)
    {
     System.out.println("enter z");
     z=in.nextInt();
     System.out.println("enter s");
     s=in.nextInt();
     for(i=1;i<=z/2;i++)
     {
         for(j=1;j<=z/2;j++)
         {
             p=i*j;
             if(p==z)
             {
                 count=count+1;
             }
         }
     }
     if(count==s)
     {
         System.out.println("yes");
     }
     else
     {
         System.out.println("no");
     }
    }
    }
}
public class TestClass{
    public static void main(String[] args) {
        subs n=new subs();
        n.sub();
    }
}