//io imports
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author
 *
 */
public class FileHandler {

    public static String makeFile(String fileName) {
        //creates a file
        File myFile = new File(fileName);
        
        try {
                if (myFile.createNewFile())
                        return myFile + " Successfully Created.";
                
                else
                        //returns when file creation is unsuccessful
                        return "Something went wrong while creating " + myFile + ".";
                
        } 
        
        catch (IOException e) {
             return  e.getMessage(); //will return exception message
                
        }
}
			public static String writeToFile(String fileName, String contents) {
	                File file = new File(fileName);

	                //checks if the file exists and if it doesn't, file will be created
	                if (!file.exists()) {
	                        makeFile(fileName); //calls on makeFile to create the file
	                        
	                }
	                
	                DataOutputStream dOS = null;
	                try {
	                        FileOutputStream fOS = new FileOutputStream(file);
	                        //creates a stream
	                        dOS = new DataOutputStream(fOS);
	                        //writes string encoded as modified UTF-8
	                        dOS.writeUTF(contents);
	                        dOS.close(); //closes the DataOutputStream
	                        return "Succesfully wrote to " + fileName + ".";
	                        
	                }
	                
	                catch (FileNotFoundException fnfe) {
	                        return fnfe.getMessage();
	               
	                } 
	                
	                catch (IOException ioe) {
	                        return "Something went wrong while writing to " + fileName + ".";
	                        
	                }
	        }

	        public static String readFromFile(String fileName) {
	                DataInputStream dis = null;
	                String result = "";
	                try { 
	                        //creates new DataInputStream
	                        FileInputStream fis = new FileInputStream(new File(fileName));
	                        dis = new DataInputStream(fis);
	                        while (dis.available() > 0) {

	                                //reads characters encoded with modified UTF-8
	                                result += dis.readUTF();
	                                
	                        }

	                        dis.close();
	                        return result;
	                        
	                } 
	                
	                catch (EOFException eofe) {
	                        return result;
	                        
	                } 
	                
	                catch (FileNotFoundException c) {
	                        return fileName + " does not exist.";
	                        
	                } 
	                
	                catch (IOException ioe) {
	                        return "Something went wrong while reading from " + fileName + ".";
	                        
	                }
	        }

	        public static String deleteFile(String fileName) {
	                File file = new File(fileName);
	                //deletes file
	                if (file.delete()) 
	                        return fileName + " sucessfully deleted.";
	                
	                else 
	                        return "Something went wromg while deleting " + fileName + ".";
	                       
	        }

	        //will display the choices user can pick from
	        public static void displayMenu() {
	                System.out.println("Please select one of the following options: ");
	                System.out.println("1. Make a file.");
	                System.out.println("2. Write to a file.");
	                System.out.println("3. Read from a file.");
	                System.out.println("4. Delete a file.");
	                System.out.println("5. Exit the program.");
	               
	        }

	               
}
