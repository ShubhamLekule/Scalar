//Problem Description
//You are given lowercase string (S) and you have to return a string that is the uppercase form of S.
//
//
//Problem Constraints
//1 <= S.size() <= 1000
//
//
//
//Input Format
//First and only argument containing a lowercase string S.
//
//
//
//Output Format
//You have to return uppercase form of input string.
//
//
//
//Example Input
//Input 1:
//
//interviewbit
//Input 2:
//
//scaler
//
//
//Example Output
//Output 1:
//
//INTERVIEWBIT
//Output 2:
//
//SCALER
//
//
//Example Explanation
//Explanation 1:
//
//Clearly, uppercase of interviewbit is INTERVIEWBIT.
//Explanation 2:
//
//Clearly, uppercase of scaler is SCALER.
public class LowToHighII {
	public String solve(String A) {
        String str="";
        for(int i=0;i<A.length();i++){
            str=str+(char)(((int)A.charAt(i))-32);
        }
        return str;
    }
	public static void main(String[] args) {
		//call solve
	}

}
