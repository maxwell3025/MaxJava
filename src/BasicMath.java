public class BasicMath {

	public static void main(String[] args) {

		float inputA = 127769;
		float inputB = 347887;
		
		divide (inputA, inputB);
		divide(5354,34232);
		add (inputA, inputB);
	}
/*
 * The divide method is to calculate a n1/n2 and print out the result 
 */
	public static void divide(float n1, float n2) {
		float output = n1 / n2;
		String explanation = " ,let me show you, " + n1 + " / " + n2 + " = "
				+ output;
		/* this is to print out the result */
		System.out.println("The answer is " + output + explanation);
	}
	
	public static void add(float n1, float n2) {
		float output = n1 + n2;
		String explanation = " ,let me show you, " + n1 + " + " + n2 + " = "
				+ output;
		System.out.println("The answer is " + output + explanation);
	}


}
