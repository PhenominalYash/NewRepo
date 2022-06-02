import java.util.Scanner;

public class Mini_Project
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber= (int) (Math.random()*100);
        System.out.println("Enter your guess number between 1 to 100:");
       int userNumber;
        do {
            userNumber = sc.nextInt();

                if (myNumber == userNumber) {
                    System.out.println("Wooh ! congrtas your guess is coreect " + userNumber);
                    System.out.println("Random number was " + myNumber);

                } else if (userNumber > myNumber) {
                    System.out.println("Your number is large");
                } else if (userNumber < myNumber) {
                    System.out.println("Your number is too small");
                }
            }while(userNumber>0);
            System.out.println("the end");


    }
}
