import java.util.Scanner;

class addition
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int x=s.nextInt();

        System.out.println("Enter value of b:");
        int y=s.nextInt();

        int sum=x+y;
        System.out.println("Sum is:"+sum);
    };
};
