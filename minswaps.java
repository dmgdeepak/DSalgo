	public static int minSwaps(int[] A, int N)
	{
	ArrayList<Pair<Integer,Integer> > arr=new ArrayList<Pair<Integer,Integer>>();
	for(int i=0;i<N;++i)
	{
	arr.add(new Pair<Integer,Integer>(A[i],i));
	}
	Collections.sort(arr,new Comparator<pair<Integer,Integer>>())
	{
		@Override
		public int compare(pair<Integer,Integer> a,pair<Integer,Integer> b)
		{
			return b.getValue()-a.getValue();
		}
	}
	
	for(pair<Integer,Integer> a :arr)
	{
		System.out.println(a.getKey()+" "+a.getValue());
	}
}