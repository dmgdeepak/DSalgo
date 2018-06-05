public static int countInversion(int arr[],int n)
     {
         int inv=0;
		 List<Integer> set=new ArrayList<Integer>();
		 set.add(arr[0]);
		 for(int i=1;i<n;++i)
		 {
			 set.add(arr[i]);
			 int c=0;
			 for(int g:set)
			 {
				 if(g>arr[i])
					{
			 inv+=i-c;
					    break;}
				 ++c;
			 }
		 }
		 for(int f:set)
		 System.out.print(f+" ");
		 return inv;
     }