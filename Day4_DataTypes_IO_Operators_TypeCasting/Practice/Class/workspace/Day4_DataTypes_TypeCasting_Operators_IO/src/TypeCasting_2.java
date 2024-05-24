
public class TypeCasting_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l=1000000000000l;// it will throw error integer number is too large
		// by default when compiler see a number its try to store as integer 
		// we need to explicitly add l when storing long variable's value
		System.out.println("L = "+l);

	}

}
