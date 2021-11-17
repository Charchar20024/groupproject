public class GroupProject {
  public static void main(String [] args){
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
    
  }
  
}
