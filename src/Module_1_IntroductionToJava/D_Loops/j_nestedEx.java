package Module_1_IntroductionToJava.D_Loops;

public class j_nestedEx {

    public static void main(String[] args) {

        for (int i =0; i<5; i++){

            for(int j=0; j<=i; j++){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }
}
