package javaprograms;
import java.util.Scanner;
class Ifelse
{
  public static void main(String[] args)
  {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number ");
      int n=s.nextInt();
      if(n%2== 0)
      {
      System.out.println("The number is even.");
      }
      else
      {
      System.out.println("The number is odd.");
      }
   }
}
