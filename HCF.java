package javaprograms;
import java.util.*;
public class HCF
    {
    public static void main(String args[]) 
        {
    	int a,b,i,hcf=0;
    	Scanner sc=new Scanner (System.in);
    	System.out.println("Enter the first number");
    	a=sc.nextInt();
    	System.out.println("Enter the second number");
    	b=sc.nextInt();
    	for(i=1;i<=a||i<=b;i++)
            {
    		if(a%i==0 && b%i==0)
    			hcf=i;
    	}
    	System.out.println("HCF of two numbers " +a+ " and "+b+ " is "+hcf);
    }
}
