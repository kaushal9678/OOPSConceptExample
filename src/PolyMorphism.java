import java.io.DataInputStream;

/**
 * 
 */

/**
 * @author mac This class shows how to implement polymorphism concept in java.
 *
 */
public class PolyMorphism {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		float number3;
		float number4;
		DataInputStream dataInput = new DataInputStream(System.in);
		try {
			System.out.println("Please enter First integer value for add:");
			number1 = Integer.parseInt(dataInput.readLine());
			System.out.println("Please enter Second integer value for add:");
			number2 = Integer.parseInt(dataInput.readLine());

			// call method to add two integer type values
			sum(number1, number2);

			System.out.println("Please enter First Float value for add:");
			number3 = Float.parseFloat(dataInput.readLine());
			System.out.println("Please enter Second float value for add:");
			number4 = Float.parseFloat(dataInput.readLine());
			sum(number3,number4);
		} catch (Exception e) {

		}

	}

	public static void sum(int num1, int num2) {// this method is used to add
												// two integer
		int result = num1 + num2;
		System.out.println("Result of sum of type integer:" + " " + result);
	}

	public static void sum(float num1, float num2) {
		// this method overload sum method and takes parameter of float type
		float result = num1 + num2;
		System.out.println("Result of sum of type integer:" + " " + result);
	}

}
