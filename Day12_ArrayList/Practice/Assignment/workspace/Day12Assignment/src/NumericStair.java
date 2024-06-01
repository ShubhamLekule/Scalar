//Problem Description
//Given an integer A in the function parameter.
//Return a 2D array with A rows such that the i-th row has numbers from 1 to i.
//
//
//Problem Constraints
//1 <= A <= 103
//
//
//
//Input Format
//Only argument A is an integer.
//
//
//
//Output Format
//Return a 2D array of integers
//
//
//
//Example Input
//Input 1:
//A = 3
//Input 2:
//A = 4
//
//
//Example Output
//Output 1:
//[[1], [1, 2], [1, 2, 3]]
//Output 2:
//[[1], [1, 2], [1, 2, 3], [1, 2, 3, 4]]
//
//
//Example Explanation
//For Input 1:
//The 2D array contains 3 rows where the rows have 1, 2 and 3 
//elements respectively.
//For Input 2:
//The 2D array contains 4 rows where the rows have 1, 2, 3 and 4
//elements respectively.
import java.util.ArrayList;
public class NumericStair {
	public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> arr =new ArrayList<>();

        for(int i=1;i<=A;i++){
            ArrayList<Integer> stair=new ArrayList<Integer>();
            for(int j=1;j<=i;j++){
                stair.add(j);
            }
            arr.add(stair);
        }
        return arr;
    }
	public static void main(String[] args) {
		// call solve



}

}
