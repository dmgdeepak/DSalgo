import java.util.*;
class temp
{
	int x;
	
}
class classequal
{
public static void main(String args[])
{
temp a=new temp();
temp b=new temp();
List<temp> ab=new ArrayList<temp>();
ab.add(a);
System.out.println(ab.contains(a)+" "+ab.contains(b));
}
}