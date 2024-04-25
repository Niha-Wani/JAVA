package javaprograms;
import java.util.*;
public class Sortarraycolumn 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter row size and column size");
		int r=s.nextInt();
		int c=s.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("enter 2D array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ar[i][j]=s.nextInt();
			}
		}
		System.out.println("our 2D array is");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+ " ");
				if(j==c-1)
					System.out.println(" ");
			}
		}
	   for(int i=0;i<c-1;i++)
	   {
		for(int j=0;j<r-i-1;j++)
		 {
		   if(ar[i][j]>ar[i+1][j])
		    {
		      int temp=ar[i][j];
		      ar[i][j]=ar[i+1][j];
        	      ar[i+1][j]=temp;
		     }
		  }
	     }
		System.out.println("our sorted 2D array is");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+ " ");
				if(j==c-1)
				System.out.println(" ");
			}
		}
}
}
