public class Solution {
	//idea is to use two equation
	//1 sum of number
	// sum of square of number
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n=A.size();
        //take sum from 1 to n
        long sum=n*(n+1)>>1;
        //take current sum
        long csum=0;
        long squaresum=0;
        long ssum=(((n*(n+1))/2)*(2*n+1))/3;
        for(int i=1;i<=n;++i)
        {
                  csum+=A.get(i-1)    ;
                  squaresum+=(A.get(i-1)*A.get(i-1));
        }
        //diff of number
        long sumdiff=sum-csum;
        //sum of numbers
        long nsum=(ssum-squaresum)/sumdiff;
        
        long a=(sumdiff+nsum)/2;
        long b=Math.abs(sumdiff-a);
       // System.out.print(a+" "+b);
        ArrayList<Integer> r=new ArrayList<Integer>();
        boolean flag=false;
        int i=0;
        for( i=0;i<n;++i)
        {
            if(A.get(i)==a)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            long temp=b;
            b=a;
            a=temp;
        }
          r.add((int)a);
        r.add((int)b);
      /*  r.add((int)sumdiff);
        r.add((int)nsum);*/
        return r;
    }
}
