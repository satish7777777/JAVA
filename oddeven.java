import java.util.Scanner;
public class oddeven{ 
	public static void main(String args[]){
 	Scanner in = new Scanner(System.in); 
 	System.out.println("ENter No: ");  
	int num = in.nextInt(); 

if(num%2==0){ 
	System.out.print("Even"); 
}
else{System.out.print("Odd");
}

} 
}