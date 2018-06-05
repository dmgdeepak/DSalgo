import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[])
    {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt(); //points
                int M = scan.nextInt();

                int tree[] = new int[N];
                int count[] = new int[N];
                Arrays.fill(count, 1);

                for(int i=0;i<M;i++)
                {
                        int u1 = scan.nextInt();
                    int v1 = scan.nextInt();

                    tree[u1-1] = v1;

                    count[v1-1] += count[u1-1];

                    int root = tree[v1-1];

                    while(root!=0)
                    {
                        count[root-1] += count[u1-1];
                        root = tree[root-1];
                    }
                }


                int counter = -1;
                for(int i=0;i<count.length;i++)
                {
                        if(count[i]%2==0)
                        {
                                counter++;
                        }

                }
                System.out.println(counter);
    }
        }

