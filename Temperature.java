import java.util.Scanner;
class Temperature{
public static void main(String[] args){
float[] a = new float[7];
Scanner s = new Scanner(System.in);
int count =0;
float sum=0;
for(int i=0;i<7;i++){
System.out.println("Enter the temperature at" + i);
a[i] = s.nextFloat();
}
for(int j=0;j<7;j++){
sum+=a[j];
}
double a1=sum/7.0;
System.out.println("The average of temperature is" + a1);
float largest =a[0];
float smallest =a[0];
for(int k=0;k<6;k++){
if(largest<a[k+1]){
largest = a[k+1];
}
else {
smallest= smallest<a[k+1] ? smallest:a[k+1];
}
}System.out.println(smallest);
System.out.println(largest);
for(int h=0;h<7;h++){
if(a[h]>a1){
count++;
}
}
System.out.println(count);
}}
