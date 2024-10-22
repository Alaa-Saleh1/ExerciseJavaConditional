import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Ex1. Write a program that checks the role of the user
          If the role is admin print "welcome admin"
          If the role is superuser print "welcome superuser"
          If the role is user print "welcome user" (tip:
          use if else) */

//        System.out.println("Please enter your role: ");
//        String role = input.nextLine();
//
//        if(role.equalsIgnoreCase("admin")){
//            System.out.println("welcome admin");
//        }else if (role.equalsIgnoreCase("superuser")){
//            System.out.println("welcome superuser");
//        } else if (role.equalsIgnoreCase("user")) {
//            System.out.println("welcome user");
//        } else System.out.println("sorry, you cannot access. ");


        /*Ex 2.Take three numbers from the user and print the greatest number.
          Test Data */

//        System.out.println("Please enter the 1st  number: ");
//        int number1= input.nextInt();
//        System.out.println("Please enter the 2nd number: ");
//        int number2= input.nextInt();
//        System.out.println("Please enter the 3rd number: ");
//        int number3 = input.nextInt();
//
//
//        if(number1 > number2 && number1 > number3) {
//            System.out.println("The greatest number is 1st number "+number1);
//        }
//         else if (number2 > number1 && number2 > number3) {
//            System.out.println("The greatest number is 2nd number "+number2);
//        }
//        else System.out.println("The greatest number is 3rd number "+number3);


        /* Ex3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday. */


//
//        System.out.println("*************TestDay**************");
//
//        Random randomInt = new Random();
//
//        int dayRandom = randomInt.nextInt(7)+1;
//
//        switch (dayRandom){
//            case 1:
//                System.out.println("number: 1");
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("number: 2");
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("number: 3");
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("number: 4");
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("number: 5");
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("number: 6");
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("number: 7");
//                System.out.println("Saturday");
//                break;
//        }






        /* Ex4. Write a program that takes a numeric score as input and prints
           the corresponding letter grade using the following grading scale:
           A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59 */

//        System.out.println("Please enter your numeric score: ");
//        int numberScore = input.nextInt();
//
//        if (numberScore <= 100 && numberScore >= 90){
//            System.out.println("Numeric Score: " + numberScore);
//            System.out.println("Letter Grade: A");
//
//        } else if (numberScore <= 89 && numberScore >= 80) {
//            System.out.println("Numeric Score: " + numberScore);
//            System.out.println("Letter Grade: B");
//
//        } else if(numberScore <= 79 && numberScore >= 70){
//            System.out.println("Numeric Score: " + numberScore);
//            System.out.println("Letter Grade: C");
//
//        } else if (numberScore <= 69 && numberScore >= 60) {
//            System.out.println("Numeric Score: " + numberScore);
//            System.out.println("Letter Grade: D");
//
//        } else {
//            System.out.println("Numeric Score: " + numberScore);
//            System.out.println("Letter Grade: F");
//        }

        /* Ex5. Write a Java program that takes a person's age as input and
           categorizes them into one of three age categories: "Child,"
           "Teenager," or "Adult" using an if statement. */

//        System.out.println("Please enter your age: ");
//        int age = input.nextInt();
//
//        if (age >= 20){
//            System.out.println("You are an Adult. ");
//
//        } else if (age <= 19 && age >= 13) {
//            System.out.println("You are a Teenager. ");
//
//        } else System.out.println("You are a Child. ");

    }
}