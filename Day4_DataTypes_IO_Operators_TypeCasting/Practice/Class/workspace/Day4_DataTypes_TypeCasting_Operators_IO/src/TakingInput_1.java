
import java.util.*;
public class TakingInput_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int x=sc.nextInt();
		long y=sc.nextLong();
		float p=sc.nextFloat();
		double q=sc.nextDouble();
		//char a=sc.next();
		String a=sc.next();//Its read one word at a time more precisly its reads till 1st space occured
		String b=sc.nextLine();//its read on line at a time

		System.out.println("x = "+x+" \ny = "+y+"\np = "+p+"\nq = "+q+"\na = "+a+"\nb = "+b);
		
		//Input:
//		10
//		1000000000000
//		3.17
//		5.123456789012345
//		Shubham Lekule is Awesome 
//		Output:
//			x = 10 
//			y = 1000000000000
//			p = 3.17
//			q = 5.123456789012345
//			a = Shubham
//			b =  Lekule is Awesome 
		
	}

}
