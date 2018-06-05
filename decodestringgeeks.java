original string: abbbababbbababbbab 
encoded string : "3[a3[b]1[ab]]".

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
   
     public static String check(String str)
     {
         String q=new String();
         int n=str.length();
         int j=0;
         Stack<Integer> integerstack=new Stack<Integer>();
         Stack<Character> stringstack=new Stack<Character>();
         for(j=0;j<n;j++)
         {
             int count=0;
             char temp=str.charAt(j);
             if(Character.isDigit(temp)){
                while (Character.isDigit(str.charAt(j)))
                {
                    count = count * 10 + str.charAt(j) - '0';
                    j++;
                }
      
                j--;
                integerstack.push(count);

                 }
                 
                 else if (str.charAt(j) == '[')
            {
                if (Character.isDigit(str.charAt(j-1)))
                    stringstack.push(str.charAt(j));
      
                else
                {
                    stringstack.push(str.charAt(j));
                    integerstack.push(1);
                }
            }
      
             else if(str.charAt(j) == ']')
                 {
                     String t=new String();
                     
                   while(!stringstack.isEmpty()  && stringstack.peek()!='[')
                   {
                       t=stringstack.pop()+t;
                   }
                    if (!stringstack.empty() && stringstack.peek() == '[')
                   stringstack.pop();
                   int ty=integerstack.pop();
                   while(ty-->0)
                   q=q+t;
                   for (int i = 0; i < q.length(); i++)
                    stringstack.push(q.charAt(i));
      
                q = "";
                 }
                   else
                stringstack.push(str.charAt(j));
             }
             
          while (!stringstack.isEmpty())
        {
            q = stringstack.peek() + q;
            stringstack.pop();
        }
         return q;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	   String str=ab.next();
	   System.out.println(check(str));
	}
	 }
}