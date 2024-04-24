import java.util.*;
class Swap 
{
	int a,b;
	Swap(int i,int j)
	{
		a=i;
		b=j;
	}
	void swap(Swap ob)
	{
	int temp;
	temp=ob.a;
	ob.a=ob.b;
	ob.b=temp;
	}
}
public class Swapmain 
{
public static void main(String args[])
	{
	int i=10,j=20;
	Swap obj = new Swap(i,j);
	System.out.println("The value of a and b before swapping is " +obj.a+ " and " +obj.b);
	obj.swap(obj);
	System.out.println("After swapping value is a= " +obj.a+ " b= " +obj.b);
}
}
