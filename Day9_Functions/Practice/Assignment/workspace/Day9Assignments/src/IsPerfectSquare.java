//Problem Description
//
//You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.
//
//A perfect square is an integer that is the square of an integer. For example 16 is perfect square as it is the square of an integer 4 (42 = 16)
//
//
//Problem Constraints
//
//1 <= A <= 108
//
//
//
//Input Format
//
//First argument is an integer A.
//
//
//
//Output Format
//
//Return an integer (0 or 1) based upon the question.
//
//
//
//Example Input
//
//Input 1:
//
//A = 4
//Input 2:
//
//A = 1001
//
//
//Example Output
//
//Output 1:
//
//1
//Output 2:
//
//0
//
//
//Example Explanation
//
//Explanation 1:
//
//sqrt(4) = 2
//Explanation 2:
//
//1001 is not a perfect square.
import java.util.Scanner;
public class IsPerfectSquare {
	public static int solve(int A) {
        int sqrt=(int)(Math.pow(A,0.5));
        return A==Math.pow(sqrt,2)?1:0;
        
    }
	public static void main(String[] args) {
		System.out.println(solve(new Scanner(System.in).nextInt()));

	}

}
