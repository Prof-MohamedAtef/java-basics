public class Operators {
    public static void main(String[] args) {
//        String name = "Mohamed";
//        System.out.println(name);
//
//        name = "Fares";
//        System.out.println(name);
//
//        int x = 0;
//        System.out.println(x);
//
//        x += 3;
//        System.out.println(x);
//
//        double c = 0;
//
//        System.out.println(c);
//
//        float f = 0;
//        System.out.println(f);
//
//        f += 2;
//        System.out.println(f);
//
//        long MILLION = 1_000_000;
//        System.out.println(MILLION);
//
//        short milliSecond = 50;
//        System.out.println(milliSecond);
//
        /*
        operators

        mathematical operators
         */
//        int x = 2;
//        int y = 3;
//
//        double result = x + y;
//        System.out.println(result);
//
//        result -= 3;
//        System.out.println(result);
//
//        result += 1;
//        System.out.println(result);
//        result++; // +1
//        System.out.println(result);
//
//        result --;
//        System.out.println(result);
//
//        result *= 2;
//        System.out.println(result);
//
//        result = result / 2;
//        System.out.println(result);

//        result *= 2;
//        System.out.println(result);

//        result /= 2;
//        System.out.println(result);

//        result %= 2;
//        System.out.println(result);
        /*
        relation operators ( comparison )
        ==
        !=
        >
        <
        >=
        <=
         */
//        int x = 8;
//        int y = 10;
//        if (x == y){
//            System.out.println("x is equal y");
//        }else if(x >= y){
//            System.out.println("x greater than or equal y");
//        }else if(x <= y){
//            System.out.println("x less than or equal y");
//        }else if(x != y){
//            System.out.println("x is not equal y");
//        }


        /*
        logical operators
        && || !
         */

//        int x = 8;
//        int y = 11;
//        int z = 9;
//        int n = 13;
//        if (x == 7 || y == 10){
//            System.out.println("False");
//        }else if (x == 8 && y == 11 && z == 9 && n == 12){
//
//        }
//        else if((x == 8 && y == 11 && z == 9 && n == 12)
//        ||
//                (x == 8 && y == 11 && z == 9 && n == 13)
//        ){
//            System.out.println("true");
//        }else if(x != 8){
//
//        }


//        boolean isClear = false;
//
//        if (!isClear){
//            System.out.println("Hi");
//        }

        /*
        ternary operator
        ?:
         */

//        int age = 20;
//        String result = (age >= 18) ? "Adult" : "Minor";
//
//        System.out.println(result);



        int a = 10;
        int b = 25;
        int c = 15;

        int largest = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);

        System.out.println("Largest number = " + largest);

    }
}
