import java.util.Scanner;
public class TakingInput_2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        // Read the next token as a string
	        String input = sc.next();

	        // Take the first character of the string
	        char a = input.charAt(0);

	        // Print the character
	        System.out.println("You entered: " + a);

	        sc.close();

	}

}
