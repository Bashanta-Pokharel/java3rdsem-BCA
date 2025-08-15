import java.util.Scanner;
public class swap2
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the value for a and b");
int a = sc.nextInt();
int b = sc.nextInt();
a = a+b;
b = a-b;
a = a-b;
System.out.println("the value of a after swapping is "+a);
System.out.println("the value of b after swapping is "+b);
}}
