package Module_1_IntroductionToJava.D_Loops;

public class h_Continue {

    public static void main(String[] args) {


        // ex 1
//        for(int i=0; i<=20; i++){
//
//            if(i==2) continue;
//
//            System.out.println("gave toffee to" +i);
//
//        }

        // ex 2

//        for(int i=0; i<=20; i+=1){
//
//            if(i==2 || i==8 || i>=15) continue;
//
//            System.out.println("gave toffee to "  +i);
//        }




        // another method for ex2

        for(int i=0; i<=20; i++){

            if(i==2 || i==8) continue;
            if(i>=15) break;

            System.out.println("gave toffee to " +i);
        }

    }
}
