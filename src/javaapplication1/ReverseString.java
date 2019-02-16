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
import java.util.regex.Pattern;
public class ReverseString {
   static String reverseWord(String str)
   {
       Pattern p=Pattern.compile("\\s");
       String[] temp=p.split(str);
       String result=" ";
       for(int i=0;i<=temp.length;i++)
       {
           if(i==temp.length-1)
               result=temp[i]+result;
           else
               result=" "+temp[i]+result;
           
       }
       return result;
   }
   public static void main(String args[])
   {
       String s1="welcome to india";
       System.out.println(reverseWord(s1));
   }
}
