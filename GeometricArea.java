import java.util.Scanner;
class GeometricArea{
double a;
void Area(double r){
a = 3.14 * r *r;
System.out.println("The area of circle is "+a);
}
void Area(int l){
a = l*l;
System.out.println("The area of square is " + a);
}
void Area(double h,double r1){
a = 3.14*2*h*r1;
System.out.println("The area of Cylinder is " + a);
}

void Area(int l1,int b){
a = l1*b;
System.out.println("The area of Rectangle is " + a);
}

void Area(int len,float height){
a = 0.5*len*height;
System.out.println("The area of Triangle is " + a);
}
public static void main(String[] args){
double r,h;
int l,l1,b,len;
float height;
Scanner s = new Scanner(System.in);
System.out.println("Enter the radius for cylinder and circle");
r = s.nextDouble();
System.out.println("Enter the length of square");
l= s.nextInt();
System.out.println("Enter the length of rectangle");
l1= s.nextInt();
System.out.println("Enter the breadth of rectangle");
b=s.nextInt();
System.out.println("Enter the length of triangle");
len = s.nextInt();
System.out.println("Enter the height of triangle");
height = s.nextFloat();
System.out.println("Enter the height of cylinder");
h = s.nextDouble();
GeometricArea aw = new GeometricArea();
aw.Area(r,h);
aw.Area(l);
aw.Area(l1,b);
aw.Area(r);
aw.Area(len,height);



}}