/**
 * @Lab 3 (Task 3)
 * @author Thanh Kha (Tkha) 
 * @partner none
 *
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Lab3Task3 {
	
	public static final int dimension = 4;

	public static void main(String[] args) {
		
		// TODO(Task 3): Test Iterator of ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1); al.add(2); al.add(3); al.add(4);
		printArrayListBasicLoop(al);
		printArrayListEnhancedLoop(al);
		printArrayListForLoopListIterator(al);
		printArrayListWhileLoopListIterator(al);
		
	}
	
	/** Task 3 (Iterate over an ArrayList) **/
	// Using basic while / for loop
	public static void printArrayListBasicLoop(ArrayList<Integer> al) {
		System.out.println("\nTest while-loop");
		int count = 0;
		while (count != al.size()) {
			System.out.print(al.get(count) + " ");			
			count++;
		}
		System.out.println();

		System.out.println("\nTest for-loop");
		for(int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
		System.out.println();

	}
	// Using enhanced for loop (:)
	public static void printArrayListEnhancedLoop(ArrayList<Integer> al) {
		System.out.println("\nTest ehanced for-loop");
		
		for(Integer x : al) 
			System.out.print(x + " ");
		System.out.println();
		
	}
	// Using basic for loop with iterator
	public static void printArrayListForLoopListIterator(ArrayList<Integer> al) {
		System.out.println("\nTest for-loop w/iterator");

		for (Iterator<Integer> it = al.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
	}
	// Using basic while loop with iterator
	public static void printArrayListWhileLoopListIterator(ArrayList<Integer> al) {
		System.out.println("\nTest while w/iterator");
		Iterator<Integer> iterate = al.iterator();
		
		while(iterate.hasNext()) {
			int j = (Integer)iterate.next();
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
