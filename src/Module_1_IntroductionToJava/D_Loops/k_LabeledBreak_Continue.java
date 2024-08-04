package Module_1_IntroductionToJava.D_Loops;

public class k_LabeledBreak_Continue {

    public static void main(String[] args) {

        outerLoop:
        for(int i=0; i<10; i++){
            int j =0;
            while (j<=5){
                if(j==3) break outerLoop;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
