import java.util.Scanner;
class fabonacci{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n1=0,n2=1,i,n3;
    System.out.println("Enter a number of count ");

    int count = sc.nextInt();
     System.out.println(n1+" "+n2);
    for( i=2;i<count;i++){
    n3=n1+n2;
    System.out.println(" "+n3);
    n1=n2;
    n2=n3;
}
    
}
}

//0 1  