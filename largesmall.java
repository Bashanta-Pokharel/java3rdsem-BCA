public class largesmall
{
public static void main(String[]arg)
{
double a = 40;
double b = 80;
double c = 55;

double largest = (a>b)?(a>c?a:c):(b>c?b:c);
double smallest = (a<b)?(a<c?a:c):(b<c?b:c);
System.out.println("the value of a b c are"+a +b +c);
System.out.println("the largest number among a,b,c ="+largest);
System.out.println("the smallest number among a,b,c ="+smallest);
}
}