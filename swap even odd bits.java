 public static int swapbits(int x)
     {
         int even=x&0xAAAAAAAA; // return set bits at even pos 0xAAAAAAAA is number havin 1 at even pos
         int odd=x&0x55555555; // return set bits at odd pos 0x55555555 is number havin 1 at odd pos
         even>>=1;
         odd<<=1;
         return (odd|even);
     }