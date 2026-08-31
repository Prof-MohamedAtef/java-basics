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
//
//        Scanner scanner = new Scanner(System.in);
//        String[] fruits = new String[10];
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println("Enter Fruit Name");
//            fruits[i] = scanner.nextLine();
//        }
//
//        for (String fruit: fruits){
//            System.out.println(fruit);
//        }

        /*
        Task 1 - Student Information - solution
         */
//        int age = 0;
//        int grade = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age");
//        age =  scanner.nextInt();
//        System.out.println("Your age is: " + age);
//
//        System.out.println("Enter your grade");
//        grade =  scanner.nextInt();
//        System.out.println("Your grade is: " + grade);
//
//        System.out.println("Did you pass the exams? (yes/no)");
//        String answer = scanner.next();
//
//        if (answer.equalsIgnoreCase("yes")) {
//            System.out.println("You passed the exam");
//        } else {
//            System.out.println("You failed the exam");
//        }

        /*
        Task 2 - Numeric Calculations - solution
         */
//
//        int x = 25, y = 8;
//        System.out.println(x + y);
//        System.out.println(x - y);
//        System.out.println(x * y);
//        System.out.println(x / y);
//        System.out.println(x % y);
        /*
        integer division left a 1 in the reminder which has not been printed using the division directly. Instead, we had to use the % operator.
         */

        /*
        Task 3 - Primitive Type Selection - solution
         */
//
//        int studentsNumber = 0;
//        long population = 8_000_000_000L;
//        double price = 30.5;
//        float temperature = 26.5f;
//        char grade = 'A';
//        boolean isLoggedIn = true;

        /*
        Task 4 - String Immutability - Solution
         */
//
//        String name = "Ahmed";
//        String newName;
//        newName = name.concat("Ali");
//        System.out.println(name);
//        System.out.println(newName);

        /*
        Task 5 - StringBuilder Mutability - Solution
         */
//
//        StringBuilder stringBuilder = new StringBuilder("Java");
//        stringBuilder.append("Programming");
//        stringBuilder.append(" - Session One");
//        System.out.println(stringBuilder);

        /*
        Task 6 - Mutable Array Reference
         */
//
//        int [] numbers = {10, 20, 30};
//        int [] nums = numbers;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//
//        nums[0] = 500;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        /*
        3. One-Dimensional Arrays
        Task 7 - Array Basics
         */

//        int [] nums = {5, 10, 15, 20, 25};
//        System.out.println("First value: " + nums[0]);
//        System.out.println("Fourth value: " + nums[3]);
//        System.out.println("Length: " + nums.length);

        /*
        Task 8 - Update Array Elements
         */
//        int [] numbers = {10, 20, 30, 40, 50};
//        numbers[1] = 200;
//        numbers[3] = 400;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        /*
        Task 9 - Array Sum and Average
         */
//
//        int[] numbers = {12, 18, 25, 30, 15};
//        int sum = 0;
//        int average = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println("Total = " + sum);
//
//        average = sum / numbers.length;
//        System.out.println("Average = " + average);

        /*
        Task 10 - Even and Odd Numbers
         */
//
//        for (int i = 1; i <=20 ; i++) {
//            if ( i % 2 == 0){
//                System.out.println(i + " is Even");
//            }else {
//                System.out.println(i + " is Odd");
//            }
//        }

        /*
        Task 11 - Find the Largest Array Value
         */
//
//        int[] numbers = {17, 42, 8, 91, 35, 60};
//        int largest = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > largest){
//                largest = numbers[i];
//            }
//        }
//        System.out.println(largest + " is the largest number");

        /*
        Task 12 - Count Passing Grades
         */
//
//        int[] grades = {45, 80, 72, 30, 65, 90, 50};
//        int sumPassed = 0;
//        int sumFailed = 0;
//        for (int i = 0; i < grades.length; i++) {
//            if (grades[i] >= 50){
//                sumPassed++;
//            }else {
//                sumFailed++;
//            }
//        }
//
//        System.out.println("Number of Passed students is: " +
//                sumPassed + ", and Number of Failed students is: "
//                + sumFailed);

        /*
        Task 13 - Count with while
         */
//
//        int counter = 0;
//        while (counter < 10){
//            counter ++;
//            System.out.println(counter);
//        }
//        System.out.println("finished");

        /*
        Task 14 - Sum Until a Limit
         */

        int limit = 50;
        int sum = 1;
        while (sum < limit){
            sum+= sum;
            sum++;
        }
        System.out.println(sum);
    }
}