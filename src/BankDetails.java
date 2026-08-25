import java.util.Scanner;

public class BankDetails {



    public static void main(String[] args) {

        boolean isWorking = true;

        String accountNumber = "Acc123";
        String name = "Mohamed Atef";

        int credit = 50000;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Welcome in CIB Bank System");
        System.out.println("Enter your account number");
        String accUser = sc.nextLine();


        if (accUser.equals( accountNumber)){
            System.out.println("Welcome " + name);

            while (isWorking){
                System.out.println("Enter number of required Process");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Exit");
                int processNum = sc.nextInt();

                if (processNum == 1){
                    System.out.println("Deposit process will start");
                    System.out.println("Enter amount");
                    int amount = sc.nextInt();

                    if (processNum == 1){
                        credit += amount;
                    }else  if (processNum ==2){
                        credit -= amount;
                    }

                    System.out.println("Your Credit = " + credit);
                }else if (processNum == 2){
                    System.out.println("Withdrawal process will start");
                    System.out.println("Enter amount");
                    int amount = sc.nextInt();

                    if (processNum == 1){
                        credit += amount;
                    }else  if (processNum ==2){
                        credit -= amount;
                    }

                    System.out.println("Your Credit = " + credit);
                }else {
                    System.out.println("System will Close");
                    isWorking = false;
                }


            }
        }else {
            System.out.println("Wrong Data ! Please Retry Again!");
            System.out.println("System will shut down!");
            sc.close();
        }




//        System.out.println("Insert Credit/Depit Card");
//        String creditCardNumber = sc.nextLine();
//        // RFID result  =  2921103547896
//        System.out.println("Credit Card Number is: " + creditCardNumber);
//
//        // Name
//        System.out.println("Enter Name");
//        String name = sc.nextLine();
//        System.out.println("Name is: " + name);
//
//        // expire date
//        System.out.println("Enter Expire Date");
//        String expireDate = sc.nextLine();
//        System.out.println("Expire Date is: " + expireDate);
//
//        // cvc
//        System.out.println("Enter CVC");
//        String cvc = sc.nextLine();
//        System.out.println("Expire CVC is: " + cvc);


    }

}
/*

//        long MILLISECONDS = 99950000;
//
//        long hours = MILLISECONDS / 1000 / 3600;
//
//        System.out.println("Hours are: " + hours);


//        int result = credit + 1;
//        System.out.println(result);
//
//        int multiply;
//
//        multiply = 5 * 5;
//        System.out.println(multiply);
//
//        float division;
//        division = 5 / 5;
//        System.out.println("Division result: " + division);
//
//        double add;
//
//        add = 1 + 2;
//
//        System.out.println("Add value: " + add);
 */