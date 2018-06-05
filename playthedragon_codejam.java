import java.util.*;
class gfg
{
public static void main(String args[])
{
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		int arr[6]=new int[6];
		for(int i=0;i<6;i++)
			arr[i]=ab.nextInt();
		int hd=arr[0];
		if(arr[4] ==0 && arr[5]==0)
		{
			start:
			//check if win
			if(arr[2]<=0)
			{
				break;//print count
			}
			//attack
			if(arr[0]-arr[3]>arr[3])
			{
			arr[2]-=arr[1];
			arr[0]-=arr[3];
			goto start;
			}
		//improve health
		if(arr[0]-arr[3]<=arr[3])
			{
				arr[0]=hd;
				arr[0]-=arr[3];
				goto start;
			}
		}
		if(arr[4]>0 &7 arr[5]==0) //can buff
		{
			start2:
			//check if win
			if(arr[2]<=0)
			{
				break;//print count
			}
			//buff first time and second time arr 4 , arr 5 =0 then start call
			if(arr[0]-arr[3]<=arr[3] && arr[4]>0 &&)
			{
				
			}
		}
	}
}