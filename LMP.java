import java.util.Scanner;
import java.util.Random; 

//Storage
public class LMP {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          Random rand = new Random();

          int option = 0;
          int width, height;

//Main Loop
          while(option > 5 || option < 1) {
               System.out.println("Select an option:");
               System.out.println("1. Print a rectangle.");
               System.out.println("2. Print a downwards right triangle.");
               System.out.println("3. Print an upwards triangle.");
               System.out.println("4. Print a random rectangle.");
               System.out.println("5. Exit");
               
//Input
               System.out.print("Enter a number: ");
               if (input.hasNextInt()) {
                    option = input.nextInt();
               }
               else {
                    option = 0;  
               }
               input.nextLine();

//Calculations and Output
               switch(option) {
                    case 1:
                    for (int i = 0; i < 5; i++) {
                         for (int j = 0; j < 7; j++) {
                              System.out.print("*");
                         }
                         System.out.println();
                    }
                    break;

                    case 2:
                    for (int i = 0; i < 6; i++) {
                         for (int j = 0; j <= i; j++) {
                               System.out.print("*");
                         }
                         System.out.println();
                    }
                    break;

                    case 3:
                    for (int i = 5; i>= 0; i--) {
                         for (int j = 0; j <= i; j++) {
                              System.out.print("*");
                         }
                         System.out.println();
                    }
                    break;

                    case 4:
                    width = rand.nextInt(9) + 2;
                    height = rand.nextInt(6) + 1;
                    for (int i = 0; i < height; i++) {
                         for (int j = 0; j < width; j++) {
                              System.out.print("*");
                         }
                         System.out.println();
                    }
                    break;

                    case 5:
                    System.out.println("Goodbye.");
                    break;

                    default:
                    System.out.println("Bad input, try again.");
                    break;
               }
          }
          input.close();
     }
}