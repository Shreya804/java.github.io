import java.util.Scanner;
 public class palindrome {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int rev=0,rem;
    System.out.println("Enter a number ");
    int num = sc.nextInt();
    int temp=num;
    while(temp!=0){
    rem = temp%10;
    rev = rev*10+rem;
    temp = temp/10;
     }
     if(num==rev){
     System.out.println("Number is palindrome");}
    else{
     System.out.println("Number is  not a palindrome");}
  }
 
}