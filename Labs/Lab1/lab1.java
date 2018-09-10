
public class Main {
	
	/** MAIN METHOD **/
	public static void main(String[] args) {
		
		// Problem 1 Examples
		String word1 = "cinema";
		String word2 = "iceman";
		System.out.println(isAnagram(word1, word2));
		
		// Problem 2 Examples
		word1 = "abdere";
		word2 = "ereabd";
		System.out.println(isRotation(word1, word2));
	}
	
	/** PROBLEM 1 **/
	public static boolean isAnagram(String word1, String word2) {
		
		// Check same length
		if(word1.length() != word2.length())
			return false;
		
		// Put each word in array
		char[] arr1 = new char[word1.length()];
		char[] arr2 = new char[word1.length()];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = word1.charAt(i);
			arr2[i] = word2.charAt(i);
		}
				
		// Eliminate each characters
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) { 
					arr2[j] = '-';
					count++;
				}
			}
		}
		
		// Return result
		return count == word1.length();
	
	}
	
	/** PROBLEM 2 **/
	public static boolean isRotation(String word1, String word2) {
		
		// Check same length
		if(word1.length() != word2.length())
			return false;
		
		// Put each word in array
		char[] arr1 = new char[word1.length()];
		char[] arr2 = new char[word1.length()];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = word1.charAt(i);
			arr2[i] = word2.charAt(i);
		}
		
		// Check each letter in word2 to match first letter of word1
		for(int i = 0; i < arr2.length; i++) {
			
			// If matching letter: Compare rotation
			if(arr2[i] == arr1[0]) { 
				int j = i; // set location of index word2 as j
				for(int x = 0; x < arr1.length; x++) { // iterate through both word1 and word2 (from j)
					if(arr1[x] == arr2[j]) {
						if(x == arr1.length-1) // end of word1 and all matched
							return true;
						
						// increment j to continue checking rest of words
						j++; 
						if(j == arr2.length) 
							j=0; // reset j to first index if at end of array
					
					// If no match, continue checking rest of word2 array
					} else {
						break;
					}
				}// end of for-loop (int x)
			} 
		} // end of for loop (int i)
		
		// No true result
		return false;
	}
	
	

}
