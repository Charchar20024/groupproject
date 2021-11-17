import java.util.Scanner;

/**
 * 
 */

/**
 * @author stephanie
 *
 */
public class Main extends FileHandler {
	public static void main(String[] args) {
		 //takes user input
        Scanner scanner = new Scanner(System.in);
        //choice value is initialized to 0
        int choice = 0;
        
        while (choice != 5) {
                displayMenu();
                System.out.print(" >> "); //indicates where user should type
                choice = scanner.nextInt();
                scanner.nextLine();
                
                //switch cases depending on user choice
                switch (choice) {
                //first case, happens if user choice is 1
                case 1:
                        //gets file name from user
                        System.out.print("Please enter the name of the file to make: ");
                        String makeFileString = scanner.nextLine();
                        // call the makeFile method with file name and Print the result
                        System.out.println(makeFile(makeFileString));
                        break;
                //case for writing to file
                case 2:
                        
                        System.out.print("Please enter the name of the file to make: ");
                        String writeFileString = scanner.nextLine();
                        System.out.print("Please enter the contents to write to the file: ");
                        String writeFileContents = scanner.nextLine();
                        String result = writeToFile(writeFileString, writeFileContents);
                        System.out.println(result);
                        break;
                //case for reading from file        
                case 3:
                        //asks for the name of the file user wants to read from
                		System.out.print("Please enter the name of the file to read from: ");
                        String filename = scanner.nextLine();
                        System.out.println(readFromFile(filename));
                        break;
                //case for deleting file       
                case 4:
                        //asks user for the name of the file they want to delete
                        System.out.print("Please enter the name of the file to delete: ");
                        String fileToDelete = scanner.nextLine();
                        System.out.println(deleteFile(fileToDelete));
                        break;
                
                //will close the program
                case 5:
                        System.out.println("Now exiting the program...");
                        break;
                        
                //default case
                default:
                        System.out.println("Please select one of the five options.");
                        break;
                        
                }
                
        }
        	//closes scanner
        	scanner.close();

	}

}
