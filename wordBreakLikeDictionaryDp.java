Idea is to check whether words are there in dictionary till last character 

import java.util.*;
import java.lang.*;
import java.io.*;
class wordBreakLikeDictionaryDp
 {
	 public static boolean possibleWord(ArrayList<String> dict,String str)
	 {
		 int size=str.length();
		 boolean dp[]=new boolean[size+1]; // dp[i]  represents if dictionary contains subString till i
		 for(int i=1;i<=size;++i)
		 {
			 // if dictionary has a word from 0 to i
			 if(!dp[i] && dict.contains(str.substring(0,i)))
				 dp[i]=true;
			 //subString till i exists now check from i+1
			 if(dp[i])
			 {
				 //we are at end and subString is possible in dictionary
				 if(i==size)
					 return true;
				 for(int j=i+1;j<=size;++j)
				 {
					 if(!dp[j] && dict.contains(str.substring(i,j)))
						 dp[j]=true;
					 
				 }
				 if(dp[size])
					 return true;
			 }
		 }
		 return false;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    ArrayList<String> dict=new ArrayList<String>();
	    for(int i=0;i<n;++i)
	    dict.add(ab.next());
	    System.out.println(possibleWord(dict,ab.next())?"1":"0");
	}
	 }
}