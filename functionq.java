import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;

//5import javax.xml.validation.TypeInfoProvider;

public class functionq {
    //Q  3 numbers from user and print avarage
    // public static int avarage(int a, int b, int c){
    //     int avg = ((a + b + c)/3);
    //     return avg;
    // }
    // public static void main(String args[]) {
    //     try(
    //         Scanner sc = new Scanner(System.in)){
    //             System.out.print("1st no ");
    //             int a = sc.nextInt();
    //             System.out.print("2nd no ");
    //             int b = sc.nextInt();
    //             System.out.print("3rd no ");
    //             int c = sc.nextInt();
                
    //             System.out.println("avarage of numbers is " + avarage(a, b, c));
    //         }
        
    // }

    //Q sum of odd number from 1 to n

    // public static void osum(int n){
    //     int sum = 0;
    //     for(int i=1; i<=n; i++){
    //         if(i%2==1){
    //              sum = sum+i;
                
    //         }
    //     }
    //     System.out.println(sum);
        
    // }

    // public static void main(String args[]){
    //     try(
    //         Scanner sc = new Scanner(System.in)){
    //             System.out.println("enter number till you want ");
    //             int n = sc.nextInt();

                
    //             //System.out.println("add of odd no " + osum(n));
    //             osum(n);
    //         }
    // }

    //Q Take 2 numbers and return grater one

    // public static int grater(int n, int m){
    //     if(n>m){
    //         return n;
    //     }
    //     else{
    //         return m;
    //     }
    // }
    // public static void main(String args[]){
    //         try(
    //             Scanner sc = new Scanner(System.in)){
    //                 int n = sc.nextInt();
    //                 int m = sc.nextInt();
    
                    
    //                 //grater(n, m);
    //                 System.out.println(grater(n,m));
    //             }
                   
    //     }
    
    //Q Take radius and return circumfernce of circle

    // public static double circle(Double c){
    //     double circumfernce = ((2 * 3.14) * c);
    //     return circumfernce;
    // }

    // public static void main(String args[]){
    //     try(
    //         Scanner sc =new Scanner(System.in)){
    //             System.out.println("enter radius");
    //             double c = sc.nextDouble();
    //             System.out.println(circle(c));
    //         }
    // }
    // public static double circle(Double radius){
    //     double circumfernce = ((2 * 3.14) * radius);
    //     return circumfernce;
    // }

    // public static void main(String args[]){
    //     try(
    //         Scanner sc =new Scanner(System.in)){
    //             double radius = sc.nextDouble();
    //             System.out.println(circle(radius));
    //         }
    // }

    //Take input age and print eligible or not eligible
    public static boolean vote(int a){
        if(a>=18){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        try(
            Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            System.out.println(vote(a));
        }
    }
}
