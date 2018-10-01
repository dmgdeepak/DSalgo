import java.util.*;
class test
{
	int temp;
	String item;
	void add(int a,String q)
	{
		this.temp=a;
		this.item=q;
	}
	void show()
	{
		System.out.println(this.temp);
		System.out.println(this.item);
		
	} 
	static void showme() // Static function can't use non static data , member,super pointer
	{
		System.out.println("Showing");
	}
}
class deepak
{
	static{
		//static int help=0;
		System.out.println("Starting");}
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter integer and string to add");
		int item=a.nextInt();;
		String q=a.next();
		test t1=new test();
		t1.add(item,q);
		t1.show();
		test.showme(); // static function called by directly class name instead of object
		//System.out.println(help);

	}
}