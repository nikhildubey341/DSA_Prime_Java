package Module_1_IntroductionToJava.D_Loops;

import java.util.Scanner;

public class b_forLoopEx1 {

    public static void main(String[] args) {

        // Table of N numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

//        for(int i=1; i<=10; i++){
//            System.out.println(i*n);
//        }

        // if i want to print like this 3*1=3, 3*2=6

        for(int i=1; i<=10; i++){
            System.out.println(n+ "*" +i+ "=" +n*i);
        }
    }
}
