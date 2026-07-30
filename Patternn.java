import java.util.Scanner;
class Patternn{
public static void main (String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for(int i=0;i<n;i++){
for(int j=n-i-1;j>0;j--){
System.out.print(' ');
}
for(int r = 0;r<i+1;r++){
System.out.print('*');
System.out.print(' ');
}
System.out.println('\n');
}
for(int k=n-1;k>0;k--){
for(int l=k-1;l<n;l++){
System.out.print(' ');
}
for(int h =0;h<k;h++){
System.out.print('*');
System.out.print(' ');
}
System.out.println('\n');
}
}
}
