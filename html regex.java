import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int t=Integer.parseInt(ab.nextLine());
        while(t-->0)
        {
            boolean flag=false;
            String str=ab.nextLine();
            int end=-1,st=-1;
            Pattern p=Pattern.compile("href=");
            Pattern x=Pattern.compile(">");
            Matcher m=p.matcher(str);
           if(m.find())
           {
               flag=true;
               end=m.end();}
            if(flag)
            {
             m=x.matcher(str);
            if(m.find(end))
                st=m.start();
            System.out.print(str.substring(end+1,st-1)+",");
                p=Pattern.compile("<");
                m=p.matcher(str);
                if(m.find(st))
                {
                    end=m.start();
                }
                System.out.println(str.substring(st+1,end));
            }
        }
    }
}