package Module_1_IntroductionToJava.A_Basics_of_Java;

import javax.xml.transform.Source;

public class c_TypeCasting {

    public static void main(String[] args) {

        // 1. Implicit Conversion (Direct/Widening) (small to big)

        int num =12;
        long numLong = num;

        System.out.println(numLong);




      // 2. Explicit Conversion {Big to Small)

        long count = 15;
        // int countLong = count; //lossy conversion
        long countLong = (int) count;  //TypeCasting
        System.out.println(countLong);


        // Another ex :

        int Age = 150;
        byte newAge = (byte) Age;
        System.out.println(newAge);  // lossy conversion -- data loss because byte only store (-128 to 127)

        // ex:

        int a = 10;
        byte newA = (byte) a;
        System.out.println(newA); // it print correct because it is the range of byte

        // ex:

        int b = 127;
        byte newB = (byte) b;
        System.out.println(newB); // till 127 we can print correct value;

        // after 127 if i want to print 128

        int c = 128;
        byte newC = (byte) c;
        System.out.println(newC); // it print in reverse that is -128


    }


}
