package javaapplication1;
import java.util.Scanner;
class word
{
    String s;
    int count=0;
    
    void cou()
    {
    Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        s=in.nextLine();
        int d;
        d=s.length();
        System.out.println("length:"+d);
        char a[]=new char[50];
        a=s.toCharArray();
        for(int i=0;i<d;i++)
        {
            if(a[i]==' ')
            {
                count=count+1;
            } 
        }
        System.out.println("count:"+(count+1));
    }
         
}
public class wordcount {
    public static void main(String args[])
    {
        word obj=new word();
        obj.cou();
    }
}
