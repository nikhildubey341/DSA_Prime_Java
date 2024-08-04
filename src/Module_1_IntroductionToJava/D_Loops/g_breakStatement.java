package Module_1_IntroductionToJava.D_Loops;

public class g_breakStatement {
    public static void main(String[] args) {
        // in for loop;

//        for(int i=0; i<=20; i++){
//            System.out.println(i);
//            if(i>=10) break;
//        }

        // in while loop;

        int i=0;
        while(i<=5){
            System.out.println(i);
            i++;
            if (i==3) break;
        }
    }
}
