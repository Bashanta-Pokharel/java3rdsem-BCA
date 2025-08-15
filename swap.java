import java.util.Scanner;
public class swap
{
public static void main(String[]arg)
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the value of  a and b ");
int a = sc.nextInt();
int b = sc.nextInt();

int temp = a;
a = b;
b = temp;
System.out.println("the value of a after swapping="+a);
System.out.println("the value of b after swapping="+b);
}
}

