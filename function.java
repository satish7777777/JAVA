import java.util.Scanner;

public class function {
    // public static int addi(int a, int b){
    //     return a + b;
    // }
    // public static int mul(int a, int b){
    //     int m = a*b;
    //     return m;
    // }
    public static int fact(int a){
        int facto = 1;
        for(int i=a; i>=1;i--){
            facto = facto * i;
           
        }
        System.out.println(facto);
        return facto;
    }
    public static void main(String args[]){
        try(
        Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            System.out.println("factorial of no is" + fact(a));
        }
        
        
    }
    
}
