/**
 * @Lab 3 (Task 1)
 * @author Thanh Kha (Tkha) 
 * @partner none
 *
 */
import java.util.ArrayList;

public class Lab3Task1 {
	
	public static final int dimension = 4;

	// Main Method
	public static void main(String[] args) {
		
		// Arrays for test
		int[] a1 = {10, 15, 30, 40};
		int[] a2 = {15, 5, 8, 2};
		int[] a3 = {20, 2, 4, 2};
		int[] a4 = {1, 4, 5, 0};
		
		// Array of Arrays
		int [] arr [] = {a1, a2, a3, a4};
		
		// TODO(Task 1a): Print 2D Arrays
		System.out.println("Array Test:");
		print2Darray(arr);
		
		// Lists for test
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		ArrayList<Integer> l3 = new ArrayList<>();
		ArrayList<Integer> l4 = new ArrayList<>();
		
		// Add values to lists
		l1.add(10); l1.add(15); l1.add(30); l1.add(40);
		l2.add(15); l2.add(5); l2.add(8); l2.add(2);
		l3.add(20); l3.add(2); l3.add(4); l3.add(2);
		l4.add(1); l4.add(4); l4.add(5); l4.add(0);
		
		// ArrayList of ArrayLists
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(l1); list.add(l2); list.add(l3); list.add(l4);
		
		// TODO(Task 1b) Print 2D ArrayLists
		System.out.println("\nList Test:");
		print2Dlist(list);

	}
	
	
	/** Task 1: Print 2D Array **/
	public static void print2Darray(int [] arr []) {
		
		int[] string_length = getFormat(arr);
		
		// Print ArrayLists with format
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				System.out.print(arr[i][j]);
				int size = Integer.toString(arr[i][j]).length();
				for(int k = 0; k < string_length[j] - size + 1; k++)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/** Task 1 (contd.): Print 2D ArrayList **/
	public static void print2Dlist(ArrayList<ArrayList<Integer>> list) {
		
		int[] string_length = getFormat(list);
		
		// Print ArrayLists with format
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j));
				int size = Integer.toString(list.get(i).get(j)).length();
				for(int k = 0; k < string_length[j] - size + 1; k++)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static int[] getFormat(int[] arr []) {
		int[] temp = {0, 0, 0, 0};
		
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				if(temp[j] < Integer.toString(arr[i][j]).length())
					temp[j] = Integer.toString(arr[i][j]).length();
			}
		}
		
		return temp;
	}
	
	public static int[] getFormat(ArrayList<ArrayList<Integer>> list) {
		int[] temp = {0, 0, 0, 0};
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				if(temp[j] < Integer.toString(list.get(i).get(j)).length())
					temp[j] = Integer.toString(list.get(i).get(j)).length();
			}
		}
		
		return temp;
	}

}
