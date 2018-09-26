/**
 * @Lab 3 (Task 2)
 * @author Thanh Kha (Tkha) 
 * @partner none
 *
 */
import java.util.ArrayList;

public class Lab3Task2 {
	
	public static final int dimension = 4;

	public static void main(String[] args) {
		// Arrays for test
		int[] a1 = {10, 15, 30, 40};
		int[] a2 = {15, 5, 8, 2};
		int[] a3 = {20, 2, 4, 2};
		int[] a4 = {1, 4, 5, 0};
		
		// Array of Arrays
		int [] arr [] = {a1, a2, a3, a4};
		
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
		
		// TODO(Task 2a) Test Sum Array w/Directions
		runningSum2DArray(arr, 1);
		runningSum2DArray(arr, 2);
		runningSum2DArray(arr, 3);
		runningSum2DArray(arr, 4);

		// TODO(Task 2b): Test Sum ArrayList w/Directions
		runningSum2DArrayList(list, 1);
		runningSum2DArrayList(list, 2);
		runningSum2DArrayList(list, 3);
		runningSum2DArrayList(list, 4);
	}
	
	/** Task 2: Sum Array in direction **/	
	public static void runningSum2DArray(int [] arr [], int direction) {
		System.out.print("\nAdd Array Test ");
		int sum = 0;
		int[] string_length = getFormat(arr);

		switch(direction) {
		
			case 1: // Left
				System.out.println("Left: ");
				for(int i = 0; i < dimension; i++) {
					// Add up entire row
					for(int j = 0; j < dimension; j++) 
						sum += arr[i][j];
					
					// Reduce row left to right
					for(int j = 0; j < dimension; j++) {
						System.out.print(sum);
						int size = Integer.toString(sum).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
						sum -= arr[i][j];
					}
					sum = 0;
					System.out.println();
				}
				break;
				
			case 2: // Right
				System.out.println("Right: ");
				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) {
						sum += arr[i][j];
						System.out.print(sum);
						int size = Integer.toString(sum).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
					}
					sum = 0;
					System.out.println();
				}
				break;
				
			case 3: // Up
				System.out.println("Up: ");
				int [][] temp = new int[1][dimension];
				// add up all the arrays in the ith position
				
				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) 
						temp[0][j] += arr[i][j];
				}
				
				// Print reduce top-down
				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) {
						System.out.print(temp[0][j]);
						int size = Integer.toString(temp[0][j]).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
						temp[0][j] -= arr[i][j];
					}
					System.out.println();
				}
				break;

			case 4: // Down
				System.out.println("Down: ");
				int [][] temp2 = new int[dimension][dimension];

				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) {
						temp2[i][j] = arr[i][j];
						
						if (i > 0) 
							temp2[i][j] += temp2[i-1][j];
						System.out.print(temp2[i][j]);
						int size = Integer.toString(sum).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
					}
					System.out.println();
				}
				
				break;
			
			default: // Error
				System.out.println("Invalid inputs (only 1-4)");
				break;
		}
		System.out.println();
	}
	
	/** Task 2 (contd.): Sum ArrayList in direction **/	
	public static void runningSum2DArrayList(ArrayList<ArrayList<Integer>> list, int direction) {
		System.out.print("\nAdd ArrayList Test ");
		int sum = 0;
		int[] string_length = getFormat(list);
		switch(direction) {
		
			case 1: // Left
				System.out.println("Left: ");
				for(int i = 0; i < dimension; i++) {
					// Add up entire row
					for(int j = 0; j < dimension; j++) 
						sum += list.get(i).get(j);
					
					// Reduce row left to right
					for(int j = 0; j < dimension; j++) {
						System.out.print(sum);
						int size = Integer.toString(sum).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
						sum -= list.get(i).get(j);
					}
					sum = 0;
					System.out.println();
				}
				break;
				
			case 2: // Right
				System.out.println("Right: ");
				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) {
						sum += list.get(i).get(j);
						System.out.print(sum);
						int size = Integer.toString(sum).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
					}
					sum = 0;
					System.out.println();
				}
				break;
				
			case 3: // Up
				System.out.println("Up: ");
				int [][] temp = new int[1][dimension];
				// add up all the arrays in the ith position
				
				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) 
						temp[0][j] += list.get(i).get(j);
				}
				
				// Print reduce top-down
				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) {
						System.out.print(temp[0][j]);
						int size = Integer.toString(temp[0][j]).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
						temp[0][j] -= list.get(i).get(j);
					}
					System.out.println();
				}
				break;

			case 4: // Down
				System.out.println("Down: ");
				int [][] temp2 = new int[dimension][dimension];

				for(int i = 0; i < dimension; i++) {
					for(int j = 0; j < dimension; j++) {
						temp2[i][j] = list.get(i).get(j);
						
						if (i > 0) 
							temp2[i][j] += temp2[i-1][j];
						System.out.print(temp2[i][j]);
						int size = Integer.toString(sum).length();
						for(int k = 0; k < string_length[j] - size + 1; k++)
							System.out.print(" ");
					}
					System.out.println();
				}
				
				break;
			
			default: // Error
				System.out.println("Invalid inputs (only 1-4)");
				break;
		}
		System.out.println();
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
