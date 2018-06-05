//if i xor number with all 1 then it will be complement of that number
// find nnumber of bits are there in number shift 1 till that number i.e. the new number is having 1 more bit so reduce with 1
// we will be having all 1's
import java.util.*;
import java.lang.*;
import java.io.*;
class demo
{
public static void main (String[] args)
 {
Scanner ab=new Scanner(System.in);
int t=ab.nextInt();
while(t-->0)
{
  int n=ab.nextInt();
  int bits=((int)Math.floor(Math.log(n)/Math.log(2)))+1;
  System.out.println(((int)(Math.log(n)/Math.log(2)))+1);
 System.out.println(Integer.toBinaryString(n));
 //System.out.println(Integer.toBinaryString((1<<bits)-1)); all 1's
 n=((1<<bits)-1)^n;
 int twoComplement=n+1;
    System.out.println(Integer.toBinaryString(n));
    System.out.println("Two's compl "+Integer.toBinaryString(twoComplement));
}}
}
