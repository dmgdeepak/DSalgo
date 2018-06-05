import java.util.*;
import java.lang.*;
import java.io.*;
class infixtopost
 {
      static int prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
        }
        return -1;
    }
 	public static void infixToPostFix (char a[])
 	{
 	    Stack<Character> s=new Stack<Character>();
 	    for(int i=0;i<a.length;++i)
 	    {
 	        //if(a[i])
 	        if(prec(a[i])==-1 && a[i]!=')' && a[i]!='(')
 	        System.out.print(a[i]);
 	        else
 	        {
 	           if(a[i]=='(')
 	           s.push(a[i]);
 	          else if(a[i]==')')
 	           {
 	               while(!s.isEmpty() && s.peek()!='(')
 	               {
 	                   System.out.print(s.pop());
 	               }
 	               if(!s.isEmpty() && s.peek()=='(')
 	               s.pop();
 	           }
 	           else{
 	           while(!s.isEmpty() && prec(s.peek())>=prec(a[i]))
 	           {
 	                System.out.print(s.pop());
 	           }
 	           s.push(a[i]);}
 	        }
 	    }
 	    while(!s.isEmpty())
 	            System.out.print(s.pop());
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    infixToPostFix(ab.next().toCharArray());
	    System.out.println();
	}
	 }
}
