
public class TypeCasting_7 {

	public static void main(String[] args) {
		// forcefully long to int type casting when its not compatible leads to garbage value
		//like 1000000000000l is not compatible as int
		
		long l=1000000000000l;
		int i=(int)l;
		System.out.println("I = "+i);
		//OP : I = -727379968

	}

}
