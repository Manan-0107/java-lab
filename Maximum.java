import java.util.Scanner;
class Maximum{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number");
int a = s.nextInt();
System.out.println("Enter the second number");
int b = s.nextInt();
System.out.println("Enter the third number");
int c = s.nextInt();
int d = a>b?(a>c?a:c):(b>c?b:c);
System.out.println("The greatest number is "+ d);
}
}