package javaprograms;
import java.util.*;
class Testt
{
	int a,b;
	Testt(int i,int j)
	{
		a=i;
		b=j;
	}
	boolean equal(Testt obj) 
	{
		if(obj.a==a && obj.b==b)
		   return true;
		else
		   return false;
	}
}
public class Objectsequal 
{
    public static void main(String args[])
    {
	Testt t1=new Testt(10,20);
	Testt t2=new Testt(100,200);
	Testt t3=new Testt(10,20);
	Testt t4=new Testt(100,200);
	System.out.println(t1.equal(t2));
	System.out.println(t1.equal(t3));
	System.out.println(t2.equal(t4));
     }
}
