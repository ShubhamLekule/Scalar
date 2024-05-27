//Problem Description
//Given an integer array A. Find and return the frequency of number B in array A.
//
//
//Problem Constraints
//1 <= |A| <= 105
//1 <= A[i] <= 109
//1 <= B <= 109
//
//
//Input Format
//The first argument is an integer array A.
//The second argument is an integer B.
//
//
//Output Format
//Return the frequency of B in the array A.
//
//
//Example Input
//Input 1:-
//A = [1, 1, 2, 4, 2]
//B = 2
//Input 2:-
//A = [4, 2, 3, 4, 4]
//B = 4
//
//
//Example Output
//Output 1:-
//2
//Output 2:-
//3
//
//
//Example Explanation
//Explanation 1:-
//There are two occurences of 2 in array A.
//Explanation 2:-
//There are three occurences of 4 in array A.
import java.util.ArrayList;
import java.util.Arrays;
public class FrequencyOfXinArray {
	 public static int solve(ArrayList<Integer> A, int B) {
	        int count=0;
	    for(int element:A) if(element==B)count++;
	    return count;
	    }
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(4, 2, 3, 4, 4));
		int B=4;
		System.out.println(solve(arr,B));



}

}
