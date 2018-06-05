import java.util.*;
import java.lang.*;
import java.io.*;
class printBracket
 {
  public static void bracketCount(String str)
  {
    Stack<Character> stk=new Stack<Character>();
    int max=1;
    for(int i=0;i<n;++i)
    {
      if(str.charAt(i)=='(')
      {
        System.out.print(max);
          stk.push(++max);
      }
      else if(str.charAt(i)==')')
        {
          System.out.print(str.pop());
        }
    }
  }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
    bracketCount(ab.next());
	    System.out.println();
	}
	 }
}
