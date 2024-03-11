import java.util.Scanner;

class input{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.print("Enter number");
int num1=in.nextInt();

System.out.print("Enter 2nd number: ");
int num2=in.nextInt();

System.out.println("You Entered: "+num1);
System.out.println("Youur @nd no is: "+num2);

System.out.println("sum of two no is : "+(num1+num2));
}
}