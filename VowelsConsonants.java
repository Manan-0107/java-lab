import java.util.Scanner;
class VowelsConsonants{
public static void main(String[] args){
Scanner s =new Scanner(System.in);
String s1 = s.nextLine();
String s2 = s1.toLowerCase();
int n = s1.length();
int count_vowels =0;
int count_consonants =0;
int count_special_character=0;
for(int i=0;i<n;i++){
if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' ||  s2.charAt(i) == 'o' ||  
s2.charAt(i) == 'u' ||  s2.charAt(i) == 'i'){
count_vowels+=1;
}
else if(s2.charAt(i) != ' ' && Character.isLetter(s2.charAt(i))){
count_consonants+=1;
}
else{
count_special_character +=1;
}
}
System.out.println("No of vowels in " + s1+ "is" + count_vowels);
System.out.println("No of consonants in" + s1 + "is" + count_consonants);
System.out.println("No of special character in" + s1 + "is" + count_special_character);
}
}