package javaprograms;
import java.util.Scanner;
public class Array 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int ar[]=new int [size];
		System.out.println("Enter array elements ");
		for(int i=0;i<size;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("our array is");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
	
		}
		System.out.println("our array  after incrementing each element by 1 ");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]+1);
		}
	}
}
