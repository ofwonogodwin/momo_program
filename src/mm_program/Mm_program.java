/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mm_program;

/**
 *
 * @author godwin-ofwono
 */
import java.util.Scanner;
public class Mm_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mobile Money Program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Code(eg *i65#) :");
        String code = scanner.nextLine();
        
         if (code.equals("*165#")) {
            displayMainMenu(scanner);
        } else {
            System.out.println("Invalid Code.");
        }

        scanner.close();
    }

    private static void displayMainMenu(Scanner scanner) {
       
            System.out.println("\n Welcome to Mobile Money");
            System.out.println("1. Send Money");
            System.out.println("2. Airtime & Bundles");
            System.out.println("3. Pay with MoMo");
            System.out.println("4. Payments");
            System.out.println("5. Savings & Loans");
            System.out.println("6. Financial Services");
            System.out.println("7. Invest & Insure");
            System.out.println("8. My Account");



            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                    System.out.println("Send Money.");
                    System.out.println("1. Mobile User");
                    System.out.println("2. Outside Uganda");
                    System.out.println("3. Donations");
                    System.out.print("Select an option: ");
                    int choose = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (choose == 1) { 
                        System.out.print("Enter Number You Are Sending To: ");
                        int num = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        System.out.print("Enter Amount to Send: ");
                        double amount = scanner.nextDouble();
                        System.out.println("You have Sent UGX " + amount + " to " + num);
                    }
                    else if (choose == 2) {
                        System.out.print("Enter Country Name : ");
                        String country = scanner.next();
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        System.out.println("You Have sent UGX  " + amount + " to " + country);
                    }
                    else if (choose == 3) { 
                        System.out.println("Select Organization:");
                        System.out.println("1. Organization A");
                        System.out.println("2. Organization B");
                        int charity = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();

                        if (charity == 1) {
                            System.out.println("You have donated UGX " + amount + " to Organization A.");
                        }
                        else if (charity == 2) {
                            System.out.println("You have donated UGX " + amount + " Organization B.");
                        } 
                        else {
                            System.out.println("Invalid option.");
                        }
                    } 
                    else {
                        System.out.println("Invalid option.");
                    }                   


            }
//            Am going to add the pin kinda Option
            else if(choice == 2) {
                    System.out.println("Airtime & Bundles.");
            }
            else if(choice == 3) {
                    System.out.println("Pay with MoMo.");
            }
            else if(choice == 4) {
                    System.out.println("Payments.");
            }
            else if(choice == 5) {
                    System.out.println("Savings & Loans");
            }
            else if(choice == 6) {
                    System.out.println("Financial Services.");
            }
            else if(choice == 7) {
                    System.out.println("Invest & Insure.");
            }
            else if(choice == 8) {
                    System.out.println("My Account.");
            }
            else  {
                    System.out.println("Invalid Option, Try again");
            }

    }
    
}
