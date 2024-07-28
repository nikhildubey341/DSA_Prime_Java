package Module_1_IntroductionToJava.B_BNS_JavaOp_UserInput;

public class a_Operators {

    public static void main(String[] args) {

        // Operators

        // 1. Airthmatic Operators: (+, -, *, /, %)

        int a =12;
        int b = 7;

        int add = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b; // print result as integer type
        int modlu = a%b;
        double division = (double) a/b; // typecasting if i want to print result in decimal or accurate result, cast any of variable either a or b

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(modlu);
        System.out.println(division);


        // 2. Assignment Operator (=, +=, -=, *=, /=, %=)

        int num1 = 12;
        int num2 = 7;

        num1+=num2; // num1=num1+num2 (12+7)
        System.out.println(num1); // now value of num1 = 19

        num1-=num2; // num1=num1-num2 (19-7)
        System.out.println(num1); // now num1 = 12

        num1*=num2; // num1=num1*num2 (12*7)
        System.out.println(num1); // now num1 =84

        num1/=num2; // num1=num1/num2 (84/7)
        System.out.println(num1); // now num1 = 12

        num1%=num2; // num1=num1%num2 (12%7)
        System.out.println(num1); // now num1 = 5


        // 3. Relational Operators (==, !=, >, <, >=, <=)

        int x = 12;
        int y = 16;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println((x>y));
        System.out.println((x<y));
        System.out.println(x>=y);
        System.out.println(x<=y);



        //4. Logical Operators (&&, ||, !)

        boolean firstExpression = false;
        boolean secondExpression = true;

        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(! firstExpression);
        System.out.println(! secondExpression);


        // Other Operators

        // Increment / Decrement (a++(a=a+1) and a--(a=a-1))

        int p = 12;
        p = p + 1; // now p=13
        p++; //p=p+1 , now p=14
        p--; // p=p-1. now p=14-1=13
        p--; //now p=13-1=12
        System.out.println(p);






    }
}
