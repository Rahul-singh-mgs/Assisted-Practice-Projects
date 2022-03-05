public class typeCasting {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		
		
		char z='Z';
		System.out.println("Value of z: "+z);
		
		int b=z;
		System.out.println("Value of b: "+b);
		
		float c=z;
		System.out.println("Value of c: "+c);
		
		long d=z;
		System.out.println("Value of d: "+d);
		
		double e=z;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}
