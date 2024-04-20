package javaprograms;
import java.util.*;
class St
{
	int arr[]=new int[10];
	int top=-1;
	/*St()
	{
		int top=-1;
	}*/
	void push(int item) 
	{
		if(top==arr.length-1)
		{
		System.out.println("Stack Overflow");	
		}
		else 
		{
			arr[top]=item;
			top=top+1;
		}
	}
	void pop() 
	{
		if(top==-1) 
		{
			System.out.println("Stack underflow");
		}
		else 
		{
			int x=arr[top];
			top--;
		}
	}
	void display() 
	{
		for(i=0;i>arr.length-1;i++) 
		{
			System.out.println(arr[i]);
		}
	}
}
public class Stack 
{
   public static void main(String args[]) 
   {
	int top=-1;
	St obj=new St();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element");
	int item=sc.nextInt();
	obj.push(item);
	obj.display();
   }
}
