import java.util.Scanner;
class Calculator{
public static void main(String[] args){
float b,d,e;
char ch='y';
Scanner s = new Scanner(System.in);
while(true){
System.out.println("Enter you choice");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("5. Quit");
int c = s.nextInt();
switch(c){
case 1 :
System.out.println("Enter the first number");
b = s.nextFloat(); 
System.out.println("Enter the second number");
e = s.nextFloat();
d= e+b;
System.out.println("The addition of two input numbers is" + d);
break;

case 2 :
System.out.println("Enter the first number");
b = s.nextFloat();
System.out.println("Enter the second number");
e = s.nextFloat(); 
d= e>b?e-b:b-e;
System.out.println("The Subtraction of two input numbers is" + d);
break;

case 3 :
System.out.println("Enter the first number");
b = s.nextFloat();
System.out.println("Enter the second number");
e = s.nextFloat(); 
d= e*b;
System.out.println("The Multiplication of two input numbers is" + d);
break;

case 4 :
System.out.println("Enter the first number");
b = s.nextFloat();
System.out.println("Enter the second number");
e = s.nextFloat(); 
d= b/e;
System.out.println("The Division of two input numbers is" + d);
break;

case 5 :
ch ='n';
break;

default :
System.out.println("Enter the choice between 1 - 5");
break;
}
if(ch=='n'){
System.out.println("The program of calculator is over as you presses 5");
break;}
else{
continue;
}
}
}
}




