package javaprograms;
import java.util.Scanner;
public class Matrixmul 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row size and column size");
		int r=s.nextInt();
		int c=s.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("Enter matrices elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ar[i][j]=s.nextInt();
			}
		}
		System.out.println("our matrix is ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+ " ");
				if(j==c-1)
				System.out.println(" ");
			}
		}
		System.out.println("Enter row size and column size");
		int r2=s.nextInt();
		int c2=s.nextInt();
		int ar2[][]=new int[r2][c2];
		System.out.println("Enter matrices elements ");
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
		System.out.println("Matrix multiplication is");
		{
			int mat3[][]=new int[r][c2];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c2;j++)
				{
				     for(int k=0;k<c;k++)
				     {
					mat3[i][j]+=ar[j][j]*ar2[k][j];
				     }
				}
		        }	
			for(int i=0;i<r;i++)
			{
			    for(int j=0;j<c2;j++)
			     {
			      System.out.println(mat3[i][j]);			
		             }
                        }
		}
    }
}
