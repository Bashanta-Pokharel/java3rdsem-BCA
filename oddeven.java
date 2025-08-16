									 
import java.util.Scanner;
public class oddeven
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
if (n % 2 ==0 )
{
System.out.println(" the  number is even");
}
else
{
System.out.println(" the number is odd");
}
}
}