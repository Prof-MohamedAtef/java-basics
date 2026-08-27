import java.util.Scanner;

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


//
//        int a = 10;
//        int b = 25;
//        int c = 15;
//
//        int largest = (a > b)
//                ? (a > c ? a : c)
//                : (b > c ? b : c);
//
//        System.out.println("Largest number = " + largest);

//        int a = 20;
//        int b = a;
//        System.out.println(b);
//        b = 100;
//
//        System.out.println(a);
//        System.out.println(b);
//
//        int[] a = {10, 20, 30};
//        int[] b = a;
//
//        b[0] = 100;
//
//        System.out.println(a[0]);

//        String name = "Ahmed";
//
//        String newName = name.concat(" Ali");
//
//        System.out.println(name);
//        System.out.println(newName);
//
//        String name1 = "Ahmed";
//        String name2 = name1;
////        System.out.println(name2);
//        name2 = "Ali";
//
//        int[] numbers1 = {10, 20};
//        int[] numbers2 = numbers1;
//
//        numbers2[0] = 500;
////
//        System.out.println(name1);
//        System.out.println(name2);
////
//        System.out.println(numbers1[0]);
//        System.out.println(numbers2[0]);
//
//        Character ch = 'a';
//


        /*
        primitives
         */
//
//        double r = 2.5;
//        float t = 3.5f;
//        long m = 80L;
////        int x = 5;
//        x = 10;
//        System.out.println(x);
//
//        String name = "Mohamed";
//
//        name = "Ahmed";
//        System.out.println(name);
////
////        name = name + "Fares";
////        System.out.println(name);
////
//        String newName = name.concat("Omar");
//        System.out.println(newName);

//        StringBuilder builder = new StringBuilder("Hi");
//        builder.append(", I am Mohamed");
//        builder.append(", I am 33 years old");
//        System.out.println(builder);

        /*
        primitives
         */

//        int x = 8;
//        /*
//        reference types
//         */
//        Double xx = 8.2;
//        String name = "Fares";
//        name = "Omar";
//        String userName = name.concat("asadas");

        /*
        One Dimensional Array
         */

//        int[] numbers = new int[10];
//        numbers[0] = 5;
//        numbers[1] = 8;
//        numbers[2] = 12;
//        numbers[4] = 18;
//
//        for (int counter = 0; counter < numbers.length; counter++) {
//            System.out.println(numbers[counter]);
//        }
//

//        fruits[0] = "Banana";
//        fruits[1] = "Apple";
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i] + " number: " + numbers[i]);
//        }

        Scanner scanner = new Scanner(System.in);
        String[] fruits = new String[10];
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Enter Fruit Name");
            fruits[i] = scanner.nextLine();
        }

        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}