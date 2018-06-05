import java.util.*;
import java.lang.*;
import java.io.*;
class Sortbyroll implements Comparator<String>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(String a, String b)
    {
        return a.compareTo(b);
    }
}
class sortbycompare
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    ArrayList<String> arr=new ArrayList<String>();
	    while(n-->0)
	    {
	        arr.add(ab.next());
	    }
	    Collections.sort(arr,(a,b) ->
		{
		return (b+a).compareTo(a+b);	
		});
	     Iterator itr=arr.iterator();  
  while(itr.hasNext()){  
   System.out.print(itr.next());  
	}
	 }
 }}