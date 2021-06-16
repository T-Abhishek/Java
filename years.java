import java.util.Scanner;

class years{
public static void conversion(){

Scanner sc=new Scanner(System.in);
int minute=0,day,year,remMin;
System.out.println("Enter minutes");

while(!sc.hasNextInt()){
System.out.println("Input is not a number!\nEnter integer 

only");
sc.nextLine();
}

minute=sc.nextInt();
year=minute/(365*24*60);
remMin=minute%(365*24*60);
day=remMin/(24*60);
System.out.println(year+" years and "+day+" days");
}

public static void main(String args[])
{
conversion();
}

