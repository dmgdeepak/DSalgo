import java.util.*;
class maxheap
{
	public int heap[];
	public static final int front=0;
	public int size;
	maxheap(int max_size)
	{
		this.heap[]=new int[max_size];
		this.size=-1;
	}
	int getparent(int n)
	{
		return n/2;
	}
	int lchild(int n)
	{
		return 2*n;
	}
	int rchild(int n)
	{
		return 2*n+1;
	}
	public void swap(int pos1,int pos2)
	{
		int temp=heap[pos1];
		heap[pos1]=heap[pos2];
		heap[pos2]=temp;
	}
	public void insert(int item)
	{
		heap[++size]=item;
		int temp=size;
		while(heap[getparent(temp) < heap[temp] )
		{
			swap(getparent(temp),size);
			temp=getparent(temp);
			
		}
		
	}
	public int delete(int pos)
	{
		int data=heap[0];
		heap[0]=heap[size--];
		heapify(0);
		return data;
	}
	public void heapify(int pos)
	{
		if(leaf(pos))
			return;
		if(heap[pos]<heap[lchild(pos)])
		{
			swap(pos,lchild(pos);
			heapify(lchild(pos));
		}
		if(heap[pos]<heap[rchild(pos)])
		{
			swap(pos,rchild(pos));
			heapify(rchild(pos));
		}
	}
}