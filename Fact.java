package javaprograms;
import java.util.*;
public class Fact
{
	static int fact;
        static int factorial(int num)
{
    	if(num==1)
    	return 1;
    	else
	return fact=num*factorial(num-1);
}	
	public static void main(String args[])	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the desired number");
	int n=sc.nextInt();
	int facto=factorial(n);
	System.out.println("Factorial of : " +n+ " is: "+facto);
	}
}
