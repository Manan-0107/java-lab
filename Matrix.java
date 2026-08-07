import java.util.Scanner;
class Matrix{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int[][] a = new int[2][2];
int[][] b = new int[2][2];

int[][] c = new int[2][2];

for(int i =0;i<2;i++){
for(int j=0;j<2;j++){
System.out.println("Enter the elements at " + i + j);
a[i][j] = s.nextInt();
b[i][j] = s.nextInt();
}}
for(int i =0;i<2;i++){
for(int j=0;j<2;j++){
c[i][j]=a[i][j] * b[i][j] ;
}}

for(int i =0;i<2;i++){
for(int j=0;j<2;j++){
System.out.println("Output at " + i + j + " " + c[i][j]);
}}
}}
