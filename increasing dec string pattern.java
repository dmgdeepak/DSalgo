Idea is to push minimum number to stack and whenever i is detected print last number as we need minimum at every point
http://www.geeksforgeeks.org/form-minimum-number-from-given-sequence/

 public static String ID(String pattern)
{
	Stack<Integer> stk=new Stack<Integer>();
	String res=new String();
	for(int i=0;i<=pattern.length();++i)
	{
		stk.push(i+1);
		if(i==pattern.length() || pattern.charAt(i)=='I')
		{
		    	while(!stk.isEmpty())
	{
		res+=String.valueOf(stk.pop());
		//	res+=' ';
	}
		//	res+=String.valueOf(stk.pop());
		//	res+=' ';
		}
	}

	return res;
}