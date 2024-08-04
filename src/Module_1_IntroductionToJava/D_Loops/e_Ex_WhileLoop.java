package Module_1_IntroductionToJava.D_Loops;

import java.util.Scanner;

public class e_Ex_WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        while (!hasLearnt){
            System.out.println("Went to school, tried to run");
            System.out.println("Have You Understood");

            hasLearnt= sc.nextBoolean();
        }
    }
}
