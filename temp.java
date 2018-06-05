import java.util.*;
public class Solution {
public static int search(String str[],String b,int end,int start)
    {
    if(start==end)
        {
    if(str[start].compareTo(b)==0)
        return start;
    else
        {
        return -1;
    }}
    else
        {
        int mid=(start+end)/2;
        if(str[mid].compareTo(b)==0)
            return mid;
        else
            {
            if(str[mid].compareTo(b)>0)
                search(str,b,end,mid-1);
            else
                search(str,b,mid+1,start);
            return -2;
        }
    }
}
    public static void main(String[] args) {
     String a,b;
        char m;
        Scanner ab=new Scanner(System.in);
        a=ab.nextLine();
       // ab.next();
        b=ab.next();
        m=ab.next().charAt(0);
       String []str=a.split("\\s"); //split array by empty space
        Arrays.sort(str);
        int strsize=str.length;
        int pos=search(str,b,strsize,0);
        System.out.print(pos);
    }
}
