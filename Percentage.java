import java.util.Scanner;
class Percentage{
public static void main(){
int[] a = {100,76,89,90,65,68};
int sum=0;
for(int i=0;i<a.length;i++){
sum+=a[i];
}
System.out.println(sum);
double p = ((float)sum/600)*100;
System.out.println(p);
}
}