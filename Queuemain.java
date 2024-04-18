import java.util.*;
class Queue
{
	int ar[]=new int[10];
	int front=-1;
	int rear=-1;
	void insert(int val) 
	{
		if(rear==9)
		{
			System.out.println("Queue is full");
		}
		else if(front==-1)
		{
			front++;
			rear++;
			ar[rear]=val;
		}
		else 
		{
			rear++;
			ar[rear]=val;
		}
	}
	int deletion()
	{
		int x=0;
		if(front==-1 || front>rear)
			System.out.println("Queue is empty");
		else
		{
			 x=ar[front];
			front++;
		}
			return x;
	}
	void display() 
	{
		if(front==-1 || front>rear)
		System.out.println("Queue is empty");
		else 
		{
			for(int i=front;i<=rear;i++) 
			{
				System.out.print( " "+ar[i]);
			}
		}
	}
}
public class Queuemain 
{
public static void main(String args[]) 
	{
	Queue obj=new Queue();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element");
	int value=sc.nextInt();
	obj.insert(value);
	//obj.display();
	System.out.println("Enter the element");
	int p=sc.nextInt();
	obj.insert(p);

	System.out.println("Enter the element");
	int q=sc.nextInt();
	obj.insert(q);
	System.out.println("Enter the element");
	int r=sc.nextInt();
	obj.insert(r);
	System.out.println("Enter the element");
	int s=sc.nextInt();
	obj.insert(s);
	System.out.println("Enter the element");
	int x=sc.nextInt();
	obj.insert(x);
	System.out.println("Enter the element");
	int y=sc.nextInt();
	obj.insert(y);

	System.out.println("Enter the element");
	int a=sc.nextInt();
	obj.insert(a);

	System.out.println("Enter the element");
	int b=sc.nextInt();
	obj.insert(b);
	System.out.println("Enter the element");
	int c=sc.nextInt();
	obj.insert(c);
	
	obj.display();
	int f=obj.deletion();
	System.out.println("The deleted element is " +f);
	obj.display();
	
}
}
