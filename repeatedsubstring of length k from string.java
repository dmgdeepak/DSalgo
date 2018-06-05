Idea was to put all substring into a map 
if there is more than 2 substring then not possible.
if only 2 then the occurence of one substring should be 1 or i/k -1 as we can only afford 1 diff substring
    
public static boolean repeatedSubString(String s,int k)
{
	if(s.length()%k!=0)
		return false;
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(int i=0;i<s.length();i+=k)
	{
		String str=s.substring(i,i+k);
		if(map.containsKey(str))
			map.put(str,map.get(str)+1);
		else
			map.put(str,1);
	}
	if(map.size()==1)
		return true;
	if(map.size()>2)
		return false;
	Map.Entry<String,Integer> entry=map.entrySet().iterator().next();
 //String key= entry.getKey();
 int ocu=entry.getValue();
if(ocu==1 || ocu==(s.length()/k -1))
return true;
return false;
}