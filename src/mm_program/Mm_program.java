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
                    System.out.println("0. Back");
                    System.out.print("Select an option: ");
                    int choose = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (choose ==1){
                        System.out.println("Enter Number You are Sending to.");
                        
                    }
                    if (choose ==2){
                        System.out.println("Enter Number You are Sending to.");
                    }
                    if (choose ==3){
                        System.out.println("Enter Number You are Sending to.");
                    }
                    if (choose ==0){
                        System.out.println("Enter Number You are Sending to.");
                    }

                    


            }
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
                    System.out.println("Invalid Option,, Try again");
            }

    }
    
}
