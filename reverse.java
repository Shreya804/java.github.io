import java.util.Scanner;
 public class reverse {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int rev=0;
    System.out.println("Enter a number ");
    int num = sc.nextInt();
    
    while(num!=0){
        int rem=num%10;
        rev = rev*10+rem;
        num=num/10;
    }
    System.out.println("Reversed number = "+rev);
    }
 
}