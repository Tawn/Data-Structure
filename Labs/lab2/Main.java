/**
 * @Lab 2 (Java Generics)
 * @author Thanh Kha (Tkha) 
 * @partner none
 *
 */
public class Main <T>{
	
	public static void main(String[] args) {
		Integer [] intArry = {1, 2, 3, 4, 5 };
		Double [] doubArry = {1.1, 2.2, 3.3, 4.4};
		Character [] charArray = {'H','E','L', 'L', 'O' };
		String [] strArray = {"once", "upon", "a", "time" };
		printArray(intArry);
		printArray(doubArry);
		printArray(charArray);
		printArray(strArray);
		
//		System.out.println("max Integer is: " + getMax(intArry));
//		System.out.println("max Double is: " + getMax(doubArry));
//		System.out.println("max Character is: " + getMax(charArray));
//		System.out.println("max String is: " + getMax(strArray));
		
	}
	
	/** Part 1 Print Method **/
	
	public static void printArray(Object[] array) {
		System.out.print("[ ");
		for(Object x : array) {
			System.out.print(x += " ");
		}
		System.out.println("]");
	}

	/** Part 2 Method Overloading **/
	
//	public static void printArray(Integer[] array) {
//		System.out.print("[ ");
//		for(Integer x : array) {
//			System.out.print(x);
//			System.out.print(" ");
//		}
//		System.out.println("]");
//	}
//	
//	public static void printArray(Double[] array) {
//		System.out.print("[ ");
//		for(Double x : array) {
//			System.out.print(x);
//			System.out.print(" ");
//		}
//		System.out.println("]");
//	}
//	
//	public static void printArray(Character[] array) {
//		System.out.print("[ ");
//		for(Character x : array) {
//			System.out.print(x);
//			System.out.print(" ");
//		}
//		System.out.println("]");
//	}
//	
//	public static void printArray(String[] array) {
//		System.out.print("[ ");
//		for(String x : array) {
//			System.out.print(x);
//			System.out.print(" ");
//		}
//		System.out.println("]");
//	}
	
	/** Part 3 Generic Type **/
	
//	public static <T> void printArray(T[] array) {
//		System.out.print("[ ");
//		for(Object x : array) {
//			System.out.print(x += " ");
//		}
//		System.out.println("]");
//	}
	
	/** Part 4 Comparable **/

	public static <Object extends Comparable> Object getMax(Object[] array) {
		/**
		 *  Warnings: 
		 *  1. The type parameter Object is hiding the type Object
		 *  2. Comparable is a raw type. References to generic type Comparable<T> 
		 *  should be parameterized.
		 *  3. Type safety: The method compareTo(Object) belongs to the raw type
		 *  Comparable. References to generic type Comparable<T> should be 
		 *  parameterized
		 */
		// 
		Object max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max.compareTo(array[i]) < 0)
				max = array[i];
		}
		return max;
	}
	
	/** Part 5 Type Safe Comparable **/

//	public static <T extends Comparable<T>> T getMax(T[] array) {
//
//		T max = array[0];
//		for(int i = 1; i < array.length; i++) {
//			if(max.compareTo(array[i]) < 0)
//				max = array[i];
//		}
//		return max;
//	}
	
}
