public static String smallestwindow(String str,String pat)
{
	int len=str.length();
	int len2=pat.length();
	int count=0,start=0,index=-1,min_len=Integer.MAX_VALUE;
	//two arrays to store occurence
	int hashpat[]=new int[256];
	int hashstr[]=new int[256];
	for(int i=0;i<len2;++i)
		++hashpat[pat.charAt(i)];
	
	for(int i=0;i<len;++i)
	{
		++hashstr[str.charAt(i)];
		//check if pattern has occurence of char x more than or equal to string occurence of that char
		if(hashpat[str.charAt(i)]!=0 && hashpat[str.charAt(i)]>=hashstr[str.charAt(i)])
		{
			++count;
		}
		// all chars involved now find length of window
		if(count==len2)
		{
			while(hashpat[str.charAt(start)]==0 || hashpat[str.charAt(start)]<hashstr[str.charAt(start)])
			{
				if(hashpat[str.charAt(start)]<hashstr[str.charAt(start)])
					--hashstr[str.charAt(start)];
				++start;
			}
			int lenwindow=i-start+1;
			if(min_len>lenwindow)
			{
				index=start;
				min_len=lenwindow;
			}
		}
	}
	if(index==-1)
		return "-1";
	return str.substring(start,start+min_len);
}