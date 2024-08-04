package Module_1_IntroductionToJava.D_Loops;

import java.util.Scanner;

public class c_sumOf_N_naturalNo {
    public static void main(String[] args) {

       // Sum of N Natural Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int sum=0;

//        for(int i=1; i<=n; i++){
//            sum = sum+i;
//        }
//        System.out.println("sum is: "+sum);


      // Sum of first N even numbers

        for(int i=1; i<=n; i++){
            // first i want to print the numbers
            System.out.println(2*i);
            sum=sum + 2*i;

        }
       System.out.println("sum is: "+sum);

    }
}
