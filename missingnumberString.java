class GfG
{
public int missingNumber(String s)
     {
     int len=getLen(s);
     return len;
     }
     public int getLen(String str)
     {
       int start=0,i=1,n=str.length();
       while(i<=6)
       {
         if(start+i<n && start+i+i<n)
        {
            int a=Integer.parseInt(str.substring(start,start+i));
            int b=Integer.parseInt(str.substring(start+i,start+i+i));
            int diff=Math.abs(a-b);
          start+=i;
         //length is invalid
         if(diff>2 || diff<1)
         {
           start=0;
           System.out.println("fails for length "+i+" a = "+a+" b "+b);
           ++i;
         }
       }
       else
       =+i;
       }
       return -1;
     }

}
