package javaprograms;
import java.util.*;
public class Factit 
{
	public static void main(String[] args) 
	{
		int fac=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fac=i*fac;
		}
		System.out.println("The factorial of a number is" +fac);
	}
}
