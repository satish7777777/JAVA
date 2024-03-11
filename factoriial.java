import java.util.Scanner;

class factoriial{
public static void main(String args[]){

Scanner in = new Scanner(System.in);

System.out.println("Enter fibonacci number till you want: ");

int num = in.nextInt();

System.out.println(factorial(num));
}

public static void factorial(int num){

int first = 0;
int second = 1;

for(int i = 0; i<= num; i++){
int next = first+second;
	first = second;
	second = next;
}
}
}
