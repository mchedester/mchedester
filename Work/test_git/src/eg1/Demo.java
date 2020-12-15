package eg1;

public class Demo {

	public static void main(String[] args) {
		//System.out.println("This is created to understand git pull.....");
		String origString = "mom";

        String reverseString = new StringBuilder(origString).reverse().toString();

        if(origString.equals(reverseString)) {
            System.out.println(origString + " is a palindrome");
        } else {
            System.out.println(origString + " is not a palindrome");
        }
        
        int i=0;
        while (i<10)
        {
        	i++;
        	if (i%2 != 0) {
        	System.out.println(i);
        	}
        }
        
        int num1 = 0; 
        int num2 = 1; 
        int counter = 0; 
   
        while (counter < 20) { 
  
            System.out.print(num1 + " "); 
  
            int num3 = num2 + num1; 
            num1 = num2; 
            num2 = num3; 
            counter = counter + 1; 
        }
        
	}
	


}
