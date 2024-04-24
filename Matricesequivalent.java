package javaprograms;
import java.util.*;
public class Matricesequivalent 
{
	public static void main(String[] args)
	{
		boolean equal=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter row size and column size");
		int r=s.nextInt();
		int c=s.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("enter matrices elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ar[i][j]=s.nextInt();
			}
		}
		System.out.println("our matrix is");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+ " ");
				if(j==c-1)
				System.out.println(" ");
			}
		}
		System.out.println("enter row size and column size");
		int r2=s.nextInt();
		int c2=s.nextInt();
		int ar2[][]=new int[r2][c2];
		System.out.println("enter matrices elements");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				ar2[i][j]=s.nextInt();
			}
		}
		System.out.println("our matrix is");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(ar2[i][j]+ " ");
				if(j==c2-1)
				System.out.println(" ");
			}
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
			if(ar[i][j]!=ar2[i][j])
			equal=false;
			break;
		     }
                 }
		if(equal==false) 
		System.out.println("Matrices are not equal");
		else
		System.out.println("Matrices are equal");
		}
	}
