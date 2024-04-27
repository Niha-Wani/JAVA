package javaprograms;
import java.util.*;
class Box
{
	double length;
	double height;
	double breadth;
	double volume() 
	{
		double v;
		v=length*breadth*height;
		return v;
	}
	Box()
	{
		length=breadth=height=-1;
	}
	Box(double l,double b,double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	Box( Box ob)
	{
		length=ob.length;
		breadth=ob.breadth;
		height=ob.height;
	}
	Box(double x)
	{
	 length=breadth=height=x;
        }
}
class Boxweight extends Box
{
	double weight;
	Boxweight(double l,double b,double h,double wt)
	{
	     super(l,b,h);
	     weight=wt;
	}
	Boxweight()
	{
	      length=breadth=height=weight=-1;
	}
	Boxweight(double x,double wt)
	{
		super(x);
		weight=wt;
	}
	Boxweight(Boxweight ob)
	{
		super(ob);
		weight=ob.weight;
	}
	
}
class Shipment extends Boxweight
{
	double cost;
	Shipment(double l,double b,double h,double wt,double c)
	{
		super(l,b,h,wt);
		cost=c;
	}
	Shipment()
	{
		length=breadth=height=weight=cost=-1;
	}
	Shipment(double x,double wt,double c)
	{
		super(x,wt);
		cost=c;
	}
	Shipment(Shipment ob)
	{
		super(ob);
		cost=ob.cost;
	}
}
public class Inheritance 
{
    public static void main(String args[]) 
    {
	//Shipment obj1=new Shipment(10,20,30,40,50);
	Shipment obj2=new Shipment(5,2,3,8,10);
	System.out.println("volume of box1 is " +obj2.volume());
    }
}
