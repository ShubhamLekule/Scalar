//Problem Description
//You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you want to find the total number of minutes you've been cooking for the sum of your preparation time and the time the lasagna has already spent baking in the oven. The preparation time of one layer is 2 minutes. Given the number of layers added to the lasagna and the number of minutes the lasagna has been baking in the oven, find the total elapsed cooking time (prep + bake) in minutes.
//
//
//Problem Constraints
//1 <= N <= 20
//0 <= M <= 40
//
//
//Input Format
//There are 2 lines in the input.
//The first line contains the integer N denoting the number of layers.
//The second line contains the integer M denoting the time the lasagna has already spent baking in the oven.
//
//
//Output Format
//Print in a single line the total elapsed cooking time.
//
//
//Example Input
//Input 1:-
//3
//20
//
//Input 2:-
//1
//29
//
//
//Example Output
//Output 1:-
//26
//
//Output 2:-
//31
import java.util.Scanner;
public class TotalElaspedCookingTime {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int layer=ip.nextInt();
        int bakeTm=ip.nextInt();
        System.out.print((layer*2)+bakeTm);

	}

}
