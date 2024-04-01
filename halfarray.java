import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class halfarray
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of element");
int size = sc.nextInt();
if(size<=0){
System.out.println("Array should be greater than zero");
System.exit(0);
}
int n1 = size%2==0 ?(size/2) : (size/2)+1;
int n2 = size - n1;
ArrayList<Integer> first=new ArrayList<>();
ArrayList<Integer> second=new ArrayList<>();
System.out.println("Enter the element:");
for(int i=0;i<n1;i++)
first.add(sc.nextInt());
for(int i=0;i<n2;i++)
second.add(sc.nextInt());
Collections.sort(first);
Collections.sort(second,Collections.reverseOrder());
for(int i=0;i<n1;i++)
System.out.println(first.get(i));
for(int i=0;i<n2;i++)
System.out.println(second.get(i));
}
}


