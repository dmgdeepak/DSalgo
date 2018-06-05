import java.util.*;
class maxsubarray
{
public static void main(String args[])
{
	Scanner ab=new Scanner(System.in);
	String str=new String(ab.nextLine());
	ArrayList<String> arr=new ArrayList<String>();
	for(int i=0;i<str.length();i++)
		if(str.charAt(i)>'0' && str.charAt(i)<='9')
		{
	String temp=new String();
		while(str.charAt(i)>='0' && str.charAt(i)<='9')
		temp=temp+str.charAt(i++);
	arr.add(temp);
}
PriorityQueue<String> pq=new PriorityQueue<String>();
for(String st:arr)
	pq.add(st);

}
}