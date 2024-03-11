public class loop {
    public static void main(String args[]){
        // for(int i=1;i<=10; i++){
        //     System.out.println(i);
        // }

        // int i=1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }
        //Q.1 Sum of natural no
        // int sum = 0;
        // for(int i=1;i<=10; i++){
           
        //     sum = 2 * i;
        //     System.out.println("table of "sum);
        // }
        
    //     for(int i=1;i<=4; i++){//1 22 333 4444
    //         // System.out.print("*");
    //         for(int j=1;j<=i;j++){
    //             System.out.print(i);
    //         }
    //         System.out.println();
    //     }
    //       *
    //     * *
    //   * * * 
    // * * * * 
    // int n=5;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // *****
    // ****
    // ***
    // **
    // *
    // int n = 5;
    // for(int i=n; i>=1;i--){
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //     for(int i=1;i<=4; i++){//1 12 123 1234
    //         // System.out.print("*");
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    // }
    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1
    int n =5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int sum = i+j;

            if(sum%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
           
        }
        System.out.println();
    }
}
    
}
