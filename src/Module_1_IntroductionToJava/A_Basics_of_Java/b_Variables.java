package Module_1_IntroductionToJava.A_Basics_of_Java;

public class b_Variables {

    public static void main(String[] args) {

        // data types
        boolean isPassed = true;

        int count = 12;
        byte marks = 13;

      //  byte num = 1300; //Byte cannot store large values , it store only (-128 to 127 )

        short studentsCount = 1235;

        float pi = 3.14f; // (by default store in double thats why write f after the value)

        double secondPi = 3.14;

        float thirdPi = 3.143213241123f; //print only till 6 to 7 decimal number because it is float data type

        char myLetter = 'a';

        System.out.println(isPassed);
        System.out.println(count);
        System.out.println(marks);
        System.out.println(studentsCount);
        System.out.println(pi);
        System.out.println(secondPi);
        System.out.println(thirdPi);
        System.out.println(myLetter);



    }
}
