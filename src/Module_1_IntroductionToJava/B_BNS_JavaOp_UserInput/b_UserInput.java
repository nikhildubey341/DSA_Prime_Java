package Module_1_IntroductionToJava.B_BNS_JavaOp_UserInput;

import java.util.Scanner;
public class b_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int Age = sc.nextInt();
        System.out.println("Your Age is:"+Age);


//        int firstNumber = sc.nextInt();;
//        int secondNumber = sc.nextInt();
//        int result1 = (firstNumber+secondNumber);
//        System.out.println(result);


        //typecasting if i want to print my number in Integer
//        float a = sc.nextFloat();
//        long b = sc.nextLong();
//        int result2 = (int) (a+b);
//        System.out.println(result);



        //There is no need of typecasting
//        float x = sc.nextFloat();
//        long y = sc.nextLong();
//        float result3 = x+y;
//        System.out.println(result3);

        sc.close(); // Garbage Collector

    }


}
