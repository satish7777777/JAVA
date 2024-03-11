import java.util.*;


public class second {
    public static void main(String args[]){
        //System.out.println("enter first no");
        
        // try(
        //     Scanner a = new Scanner(System.in)){
        //         int x = a.nextInt();
        //         int y = a.nextInt();
        //        // System.out.println("First no is " + x);
                
        //         //System.out.println("Second no is " + y);
        //         if(x==y) {
        //             System.out.println("a and b are equal");
        //         }
        //         else if(x>y){
        //             System.out.println("a is grater than b");
        //         }
        //         else if(x<y){
        //             System.out.println("a is smaller then b");
        //         }
        //     }
        System.out.println("enter age");
        try(
            Scanner sc = new Scanner(System.in)){
                int age = sc.nextInt();
                //System.out.println("age is " + age);
                if(age<18){
                    System.out.println("Not an adult");
                }
                else if(age>18){
                    System.out.println("You are an adult");
                }
            } 
    }
}
