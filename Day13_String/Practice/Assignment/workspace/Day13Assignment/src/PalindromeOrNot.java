//Problem Description:
//
//Write a program to check whether the given string is a palindrome or not. Return True if it is palindrome else return False.
//
//Note: A string is said to be a palindrome if the reverse of the string is the same as the string itself.
//
//Input Format:
//
//First line will have the number of test cases. For each testcase there will be single line of input consisting of a string.
//Output Format:
//
//True if palindrome else False
//Sample Input 1:
//
//1
//level
//Sample Output 1:
//
//True
//Sample explanation:
//
//'level' when reversed returns 'level' only which are same therefore True is returned.
//Sample Input 2:
//
//1
//Scaler
//Sample Output 2:
//
//False
//Sample explanation:
//
//'Scaler' when reversed returns 'relacS' which is not equal to original string therefore False is returned.

public class PalindromeOrNot {
	public static boolean isPalin(String s) {
	    String str="";

	    for(int i=s.length()-1;i>=0;i--){
	        str=str+s.charAt(i);
	    }
	    if(str.equals(s)) return true;
	    else return false;
	}
	public static void main(String[] args) {
		// call isPalim

	}

}
