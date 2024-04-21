package javaprograms;
import java.util.*;
public class Multipleoccur 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("our array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(" ");
			System.out.print(ar[i]);
	
		}
		for(int i=0; i < n; i++)
		{
		for(int j=1; j < (n-i); j++)
		{
		if(ar[j-1] > ar[j])
		{
		int temp = ar[j-1];
		ar[j-1] = ar[j];
		ar[j] = temp;
		}
		}
		}
		System.out.println(" ");
		System.out.println("Array After Bubble Sort");
		for(int i=0; i < n; i++)
		{
		System.out.print(ar[i] + " ");
		}
		for(int i=0;i<n;i++) {
			if(ar[i]==ar[i+1]) {
				for(int k=i+1;k<n-1;k++) {
					ar[k]=ar[k+1];
				}
				n--;
			}
		}
		System.out.println("our array after removing duplicate elements is");
		for(int i=0;i<n;i++)
		{
			System.out.print(" ");
			System.out.print(ar[i]);
	
		}
}
}
