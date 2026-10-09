import java.util.Scanner;

public class WhileImplementer {

    /*
    Create an int array containing
    14, 7, 22, 35, 10, 41, 18, and 50.
    Use loops and if statements to:
    (1) print every element,
    (2) calculate the sum,
    (3) calculate the average,
    (4) find the largest value,
    (5) find the smallest value,
    (6) count even numbers,
    and (7) count values greater than the average.
     */


    public static void main(String[] args) {
/*
user enter data
data -> should fill an array
use while loop .. print numbers / items
 */
//task 1
//        int counter = 0;
//        boolean isAdding = true;
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter Length");
//        int length = scanner.nextInt();
//
//        int[] numbers = new int[length];
//
//        while (counter < length) {
//            System.out.println("Please Enter number");
//            numbers[counter] = scanner.nextInt();
//            counter++;
//        }
//
//        counter = 0;
//
//        while (counter < length) {
//            System.out.print(numbers[counter] + ", ");
//            counter++;
//        }


        /*
guessing game
static number = 5
accept/take input from user
5 ==> correct
4 ==> Low Number
7 ==> High Number
     */



        int counter = 0;
        int number = 15;
        boolean isGuessing = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome in the Guessing Game!");

        while (isGuessing){

            System.out.println("Enter Number!");
            int answer = scanner.nextInt();
            counter++;

            if (answer == number){
                System.out.println("Correct Answers! You Won the game!");
                System.out.println("Well Done!");
                System.out.println("You Consumed " + counter + " Attempts");
                isGuessing = false;
            } else if (answer > number) {
                System.out.println("You Entered High Value! Enter a Lower answer!");
            } else if (answer < number) {
                System.out.println("You Entered Low Value! Enter a Higher answer!");
            }

            if (counter == 11){
                System.out.println("Exceeded number of Attempts!");
                isGuessing = false;
            }
        }
    }


}