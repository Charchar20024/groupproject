public class GroupProject {
    	    public static String encode(String str) {
	        String result = " " ;
	        
	        // The following loop is what makes the encoding / decoding possible. 
	        char variable ; 
	        for(int i = 0 ; i < str.length() ; ++i) {
	        	variable = str.charAt(i) ;
	            if(Character.isLowerCase(variable)) { 
	                result += (char)('a' + (25-variable+'a')) ; // Controls whether output letters will be lower case
	            } else if(Character.isUpperCase(variable)) {
	                result += (char)('A' + (25-variable+'A')) ; // Controls whether output letters will be upper case 
	            } else {
	                result += variable ;
	            }
	        }
	        return result;
	    }

	    public static String decode(String str) {
	        return encode(str); // Encode could be used for decode
	    }
    		
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in) ; // Scanner to collect user input
	        System.out.print( " 1) I want to ENCODE a message OR 2) I want to DECODE a message. Please enter your choice : " ) ; 
	        // Line above prints the choice message so user can decide to encode or decode
	        int choice = input.nextInt() ; 
	        // After user input is taken, the command chosen will run
	        input.nextLine() ; 
	        if(choice == 1) { // Runs the encode command if user inputed 1
	            System.out.print(" Enter message you wish to encode : " ) ;
	            String line = input.nextLine();
	            System.out.println(" Encoded message is : " + encode(line)) ;
	        } else if(choice == 2) { // Runs the decode command if user inputed 2
	            System.out.print(" Enter message you with to decode : ") ;
	            String line = input.nextLine() ; 
	            System.out.println(" Decoded message is : " + decode(line)) ;
	            input.close(); // Closes the scanner for user input
	        }
	    }
  }
  
}

