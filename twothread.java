import java.util.*;
class multithread extends Thread
{
	private Thread ab;
	private int temp;
	multithread(int a)
	{
		temp=a;
		System.out.println("Starting Thread "+a);
	}
	public void run()
	{
		try
		{
		for(int i=0;i<6;i++)
		{
			System.out.println("working Thread "+temp);
			Thread.sleep(50);
		}}
		catch(InterruptedException ax)
		{
			System.out.println("Exxiting from"+temp);
		}
	}
	public void start()
	{
		ab=new Thread(this);
		ab.start();
}}
class twothread
{
	public static void main(String args[])
	{
		multithread ab=new multithread(1);
		multithread abc=new multithread(2);
		ab.start();
		abc.start();
	}
}