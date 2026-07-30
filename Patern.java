import java.util.Scanner ; 
class Patern{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String s1 = s.nextLine();
char[] s2 = s1.toCharArray();
int n = s1.length();
for(int i=0;i<n;i++){
for(int j=n-i;j>0;j--){
System.out.print(' ');
}
for(int r = 0;r<i+1;r++){
System.out.print(s2[r]);
System.out.print(' ');
}
System.out.println('\n');
}
}
}