//Problem Description
//
//Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.
//
//Problem constraints
//
//1 <= N <= 1000
//
//1 <= A <= 1000
//
//
//Input Format
//
//The first line contains a single integer N representing the length of the array A followed by N elements of the array A.
//
//
//Output Format
//
//A single line output containing two space-separated integers.
//The first integer is the maximum value of the array.
//The second integer is the minimum value of the array. 
//
//There is **no space** after the minimum value in the output format. 
//There is only a **single space** between the maximum and minimum value.
//
//
//Example Input
//
//Input 1:
//5 1 2 3 4 5
//Input 2:
//4 10 50 40 80
//
//Example Output
//
//Output 1:
//5 1
//Output 2:
//80 10
//Note: There is no space after the minimum value in the output format.
//There is only a single space between the maximum and minimum value.
//
import java.util.Scanner;
public class MaxAndMinArrayElement {
	public static int[] maxAndMin(int[] arr){
        int[] maxMin={Integer.MIN_VALUE,Integer.MAX_VALUE};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxMin[0])maxMin[0]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<maxMin[1])maxMin[1]=arr[i];
        }
        return maxMin;

    }
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        int[] maxMin=maxAndMin(arr);
        System.out.print(maxMin[0]+" "+maxMin[1]);

	}

}
