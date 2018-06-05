Idea is to map every char of pattern to string
Whenever a repeat detected then check with previous map
if not same then pattern is not followed


public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    ArrayList<String> res=new ArrayList<String>();
	    loop:
	    for(String str:dict)
	    {
	        if(str.length()!=pattern.length())
	        continue loop;
	        Map<Character,Character> map=new HashMap<Character,Character>();
	        char st[]=str.toCharArray();
	        char pat[]=pattern.toCharArray();
	        for(int i=0;i<pat.length;++i)
	        {
	            if(map.containsKey(pat[i]))
	            {
	                if(map.get(pat[i])!=st[i])
	                continue loop;
	            }
	            else
	            map.put(pat[i],st[i]);
	        }
	        res.add(str);
	    }
	    return res;
	}