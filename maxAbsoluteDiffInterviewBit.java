Find max |A[i] - A[j]| + |i - j|

Idea is to break the equation by having both positive and negative sign for | |
we will have 4 possibilities 

(A[i] + i) - (A[j] + j)
-(A[i] - i) + (A[j] - j) 
(A[i] - i) - (A[j] - j) 
(-A[i] - i) + (A[j] + j) = -(A[i] + i) + (A[j] + j)

Now 1st and last , 2nd and 3rd are same 
So only 2 case needed to be consider .

get max value for positive signed bracket
get min value for negative signed bracket

public class Solution {
   public int maxArr(ArrayList<Integer> A) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        int c=Integer.MAX_VALUE;
        int d=Integer.MAX_VALUE;
        for(int i=0;i<A.size();++i)
        {
            a=Math.max(A.get(i)+i,a);
            b=Math.max(A.get(i)-i,b);
            c=Math.min(A.get(i)+i,c);
            d=Math.min(A.get(i)-i,d);
        }
        int res=a-c;
        res=Math.max(res,b-d);
        return res;
    }
}
