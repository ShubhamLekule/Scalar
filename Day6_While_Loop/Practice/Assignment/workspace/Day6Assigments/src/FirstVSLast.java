//Problem Description
//Write a program that asks the user to input a number T, indicating the number of test cases.
//Then, for each test case, ask for input a number N and print the first and last digits of N.
//
//
//
//Problem Constraints
//1 <= T <= 1000
//
//0 <= N <= 100000000
//
//
//
//Input Format
//First line is T which means number of test cases.
//
//Each next T lines contain an integer N.
//
//
//
//Output Format
//T lines each containing two space separated integers representing first and last digits of the input integer.
//
//
//
//Example Input
//Input 1:
//
//2
//5
//1001
//Input 2:
//
//2
//10023
//1589
//
//
//Example Output
//Output 1:
//
//5 5
//1 1
//Output 2:
//
//1 3
//1 9
//
//
//Example Explanation
//Explanation 1:
//
//5 has fist and last digits same.
//1001 also has fist and last digits same.
//Explanation 2:
//
//10023 has 1 as first digit and 3 as last digit.
//1589 has 1 as first digit and 9 as last digit.
//

import java.util.Scanner;
public class FirstVSLast {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int T=ip.nextInt();
        while(T>=1){
            long N=ip.nextLong();
            if(N<10)System.out.println(N+" "+N);
            else{
            long last=N%10;
            while(N>=10){
                N=N/10;
            }
            System.out.print(N+" ");
            System.out.println(last);
            }
            T--;
        }

	}

}
