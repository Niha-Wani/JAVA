package javaprograms;
import java.util.*;
public class Foreach 
{
public static void main(String args[]) 
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements ");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter array elements ");
	for(int i:a) 
	{
		a[i]=sc.nextInt();
	}
	/*System.out.println("The array elements are ");
	for(int i:a)
       {
		System.out.println(i);
	}*/
	System.out.println("The array elements are ");
	for(int i=0;i<n;i++) 
	{
		System.out.println(a[i]);
	}
}
}
