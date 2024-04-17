import java.util.Scanner;
class SeasonIf {
public static void main(String args[]) 
{
  System.out.println("Enter any month(1 to 12)");
  Scanner s = new Scanner(System.in);
  int month = s.nextInt();
  String season;
  if(month == 12 || month == 1 || month == 2) 
   season = "Winter";
  else if(month == 3 || month == 4 || month == 5)
    season = "Spring";
  else if(month == 6 || month == 7 || month == 8)
    season = "Summer";
  else if(month == 9 || month == 10 || month == 11)
    season = "Autumn";
  else
    season = "Bogus Month";
    System.out.println(" entered month is in the " + season + ".");
  }
}
