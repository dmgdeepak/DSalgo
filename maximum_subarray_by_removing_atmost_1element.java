 public static int maxSumSubarray(int A[], int n)
         {
             int max_so_far=A[0];
			 int cur_max=A[0];
			 int fw[]=new int[n];
			 int bw[]=new int[n];
			 fw[0]=A[0];
			 bw[n-1]=A[n-1];
			 for(int i=1;i<n;++i)
			 {
				 cur_max=Math.max(A[i],A[i]+cur_max);
				 max_so_far=Math.max(max_so_far,cur_max);
				 fw[i]=cur_max;
			 }
			 max_so_far=cur_max=A[n-1];
			 for(int i=n-2;i>=0;--i)
			 {
				 cur_max=Math.max(A[i]+cur_max,A[i]);
				 max_so_far=Math.max(max_so_far,cur_max);
				 bw[i]=cur_max;
			 }
			 for(int i=1;i<n-1;++i)
			 {
				 max_so_far=Math.max(bw[i+1]+fw[i-1],max_so_far);
			 }
			 return max_so_far;
         }