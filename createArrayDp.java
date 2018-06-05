import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class createArrayDp {

    // Complete the countArray function below.
    static long countArray(int n, int k, int x,int last,int i) {
        if(i>=n-1) return 1;
        long res=0;
        for(int j=1;j<=k;++j)
        {
            if(i==n-2 && j==x) continue;
            if(j==last) continue;
            res+=countArray(n,k,x,j,i+1);
        }
        return res%1000000007;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nkx = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkx[0]);

        int k = Integer.parseInt(nkx[1]);

        int x = Integer.parseInt(nkx[2]);

        long answer = countArray(n, k, x,1,1);

        System.out.println(String.valueOf(answer));

        scanner.close();
    }
}
