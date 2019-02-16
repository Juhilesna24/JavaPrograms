/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author my pc
 */import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {
static Scanner in = new Scanner(System.in);
static int B = in.nextInt();
static int H = in.nextInt();
static boolean flag=true;
static {
    if((B>0)&&(H>0))
    {
        flag = true;
    }else
    {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be postitve");
    }
    
}
public static void main(String[] args){
		if(flag){
                    int area=B*H;
                    System.out.print(area);
                }
                }		
	}


    

