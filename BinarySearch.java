package javaprograms;
import java.util.*;
public class BinarySearch
{
        public static void main(String args[]) 
	{
	  int start=0,end, p=0,mid,n,i;
	  boolean flag=false;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of elements");
	  n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter the array elements");
	  for(i=0;i<n;i++) 
	   {
		a[i]=sc.nextInt();
           }
	   System.out.println("The elements are " );
	   for(i=0;i<n;i++)
	    {
		System.out.println(a[i]);
	    }
	    System.out.println("Enter the element you want to search");
	    int key=sc.nextInt();
	    end=n-1;
	    while(start<=end) 
	    {
		mid=start+end/2;
		if(key==a[mid]) 
		  {
			flag=true;
			p=mid;
			System.out.println("The index of key element is " +p);
			break;
		  }
		else if(key<a[mid]) 
		  {
			end=mid-1;
		  }
		 else
			start=mid+1;
	     }
	     if(flag==true)
		System.out.println("Element found ");
	     else
		System.out.println("Element not found");
   }
}
