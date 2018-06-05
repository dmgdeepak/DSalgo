import java.io.*;
import java.util.*;

public class Solution {
    public static void printmat(String[] arr,int r,int c,int flag)
    {
        if(flag==0)
            for(int i=0;i<r;++i)
                {
                for(int j=0;j<c;++j)
                System.out.print("O");
                System.out.println();
            }
        if(flag==1)
            for(int i=0;i<r;++i)
                System.out.println(arr[i]);
        if(flag==2)
             for(int i=0;i<r;++i)
                {
                for(int j=0;j<c;++j)
               {
                    if(arr[i].charAt(j)=='.')
                    System.out.print("O");
                     if(arr[i].charAt(j)=='O')
                    System.out.print(".");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int r=ab.nextInt();
        int c=ab.nextInt();
        int t=ab.nextInt();
         //System.out.println(r+" "+c+" "+t);
        ab.nextLine();
        String arr[]=new String[r];
        for(int i=0;i<r;i++)
            {
            arr[i]=new String(ab.nextLine());
     }
      
    
    if(t%2==0)
        printmat(arr,r,c,0);//filled matrix
    else if(t==1 || (t/2)%2==0)
        printmat(arr,r,c,1);//same matrix
    else
        printmat(arr,r,c,2);//fill rest values
}}