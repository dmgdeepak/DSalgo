	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    boolean flag=true;
	    int e=ab.nextInt();
	    Map<Integer,String> map=new HashMap<Integer,String>();
	    Map<Integer,String> map1=new HashMap<Integer,String>();
	    boolean visited[]=new boolean[n+1];
	    for(int i=0;i<e;i++)
	   {
	       int val=ab.nextInt();
	       if(map.containsKey(val))
	       {
	           String str=map.get(val);
	           map.put(val,str+ab.nextInt());
	       }
	       else
	       {
	           String str=new String(String.valueOf(ab.nextInt()));
	           map.put(val,str);}
	       }
	    for(int i=0;i<e;i++)
	   {
	       int val=ab.nextInt();
	       if(map1.containsKey(val))
	       {
	           String str=map1.get(val);
	           map1.put(val,String.valueOf(ab.nextInt())+str);
	         //  System.out.println(String.valueOf(ab.nextInt())+" "+str);
	       }
	       else
	       {
	           String str=new String(String.valueOf(ab.nextInt()));
	           // System.out.println(str);
	           map1.put(val,str);}
	       }
	      /*  for(Map.Entry<Integer,String> m:map1.entrySet())
	       {
	          System.out.println(m.getKey()+" "+m.getValue());
	       }*/
	       for(Map.Entry<Integer,String> m:map.entrySet())
	       {
	           int key=m.getKey();
	           visited[key]=true;
	           String str=new String(m.getValue());
	          // System.out.println(m.getKey()+" "+m.getValue());
	           if(!map1.containsKey(key))
	           {
	             //  System.out.println("no key");
	               flag=false;
	               break;
	           }
	           if(!str.equals(map1.get(key)))
	           {
	              // System.out.println(str+" no match "+map1.get(key));
	               flag=false;
	               break;
	           }
	           
	       }
	       for(Map.Entry<Integer,String> m:map1.entrySet())
	       {
	           if(!visited[m.getKey()])
	           {
	               flag=false;
	               break;
	           }
	       }
	       System.out.println((flag)?"1":"0");
	}
	 }
