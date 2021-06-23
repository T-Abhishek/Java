import java.util.Scanner;
class primeno
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,c=0;
System.out.println("Please insert a number:");
n=sc.nextInt();


for(int i=2;i<=n;i++)
{
if(n%i==0)
{ c++; }
}

if(c==1){
System.out.println(n+" is a prime number");
}
else{
System.out.println(n+" is not a prime number");
}
}
}
