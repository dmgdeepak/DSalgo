 boolean know(int a,int b,int M[][])
    {
        return (M[a][b]==1)?true:false;
    }
    int getId(int M[][], int n)
    {
        int a=0,b=n-1;
        while(a<b)
        {
            if(know(a,b,M))
            ++a;
            else
            --b;
        }
        for(int i=0;i<n;++i)
        {
            if(i!=a &&(know(a,i,M) || !know(i,a,M)))
            return -1;
        }
        return a;
    }