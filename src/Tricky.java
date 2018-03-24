/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1. Your predicted output 
 // 1. message 1
 // 2. message 2
 // 3. Done with message 2
 // 4. Done with main.

public class Tricky {
	 public static void main(String[] args) {
	        message1();
	        message2();
	        System.out.println("Done with main.");
	    }
	    
	    public static void message1() {
	        System.out.println("This is message1.");
	    }
	    
	    public static void message2() {
	        System.out.println("This is message2.");
	        message1();
	        System.out.println("Done with message 2.");
	    }
	}


// 3. Were you correct? Explain any differences
 //No I wasn't, because apparently it runs the message 2 first, then turns back to message one. 
//Then declares that message 2 is done and after that with main.
 

