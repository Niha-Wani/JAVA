import java.util.*;
class Sum
{
	int sum(int a,int b)
	{
		int x=a+b;
		return x;
	}
	int sum(int a,int b,int c)
	{
		int x=a+b+c;
		return x;
	}
	double sum(double a,double b)
	{
		double x=a+b;
		return x;
	}
	double sum(float a,float b) 
	{
		double x=a+b;
		return x;
	}
	double sum(float a,int b) 
	{
		float x=a+b;
		return x;
	}
}
public class Summain 
{
public static void main(String args[])
	{
	Sum obj=new Sum();
	int x=obj.sum(2, 6);
	System.out.println("The sum is " +x);
	int y=obj.sum(3, 5, 7);
	System.out.println("The sum is " +y);
	double  z=obj.sum(2.3, 4.1);
	System.out.println("The sum is " +z);
	double p=obj.sum(2.2,5.2);
	System.out.println("The sum is " +p);
	double q=obj.sum(4.1, 3);
	System.out.println("The sum is " +q);
}
}
