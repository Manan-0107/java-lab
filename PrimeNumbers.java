class PrimeNumbers{
public static void main(String[] args){
int a=20;

for(int i =2 ; i<=a ;i++){
char ch ='y';
for(int j=2;j<=Math.sqrt(i) ; j++){
if(i%j==0){
ch='n';
break;
}
}
if(ch=='y'){
System.out.println(i);
}
}
}
}