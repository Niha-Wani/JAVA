
class Casting
{
public static void main(String args[])
{
byte b;
int i=160;
double d=323.142;
System.out.println("conversion of int to byte");
b=(byte)i;
System.out.println("value of i \n" +i );
System.out.println("value of  b\n" +b);
System.out.println("conversion of int to double");
d=i;
System.out.println("value of d" +d);
System.out.println("conversion of  double to int");
i=(int)d;
System.out.println("value of  i\n"  +i);
System.out.println("conversion of  double to byte");
b=(byte)d;
System.out.println("value of d and b\n"+d+b);
}
}
