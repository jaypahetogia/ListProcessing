import java.util.ArrayList;
import java.util.Collections;

import ecs100.UI;

public class YourCode {
	// Return an ArrayList that contains twice each of the numbers
	// in the input list.
	//
	// For example, if input contained [1,2,10] this method should
	// return a list with [2,4,20].
	//
	// You should not modify the input ArrayList.
	public ArrayList<Double> mapTwice(ArrayList<Double> input) {
		ArrayList<Double> Twice = new ArrayList<Double>(); //create new array list "Twice"
		for(int i=0; i<input.size(); i++) { //loop for input
			Double n = input.get(i)*2; //multiply each value in input by 2 and assign to variable n
			Twice.add(n); //add variable n to new array list "Twice"
		}
			return Twice;
		
	}

	// Return an ArrayList that contains the strings from the
	// input list, in the same order, converted to upper case.
	//
	// Hint: The toUpperCase() method on String returns an
	// uppercased version of the string.
	//
	// You should not modify the input ArrayList.
	public ArrayList<String> mapToUpper(ArrayList<String> input) {
		ArrayList<String> upperCase = new ArrayList<String>();//create new ArrayList
		upperCase.addAll(input);	//add input to ArrayList upperCase
		for(int i=0; i<upperCase.size(); i++) { 
			String upName = upperCase.get(i).toUpperCase(); //changing each word toUpperCase
			upperCase.set(i, upName); //setting each word in arrayList to upperCase
		}
		return upperCase;
	}

	// Return true if word is a palindrome, reading the same
	// backwards and forwards.
	//
	// Hint: the substring(int beginIndex, int endIndex)
	// method gives the part of the string from beginIndex
	// (inclusive) to endIndex (exclusive).
	// Hint: charAt(int index) gives the character at the
	// given position in a string as a char, which is a
	// primitive type that can be used as an integer.
	// Hint: Strings have a length() method.
	public boolean isPalindrome(String word) {
		for(int i=0; i<word.length(); i++) {
			if (word.charAt(i) == word.charAt(word.length()-i)) //comparing 1st and last char, working my way to middle
				return true;
		}
		return false;
	}

	// Return an ArrayList that contains the strings from the
	// input list starting with the given prefix, in the same
	// order they appeared.
	//
	// Hint: the startsWith(String prefix) method on String returns
	// true if and only if the string starts with the prefix.
	//
	// You should not modify the input ArrayList.
	public ArrayList<String> filterStarts(ArrayList<String> input, String prefix) {
		ArrayList<String> begins = new ArrayList<String>();
		for(int i=0; i<input.size(); i++) { 
			if(input.get(i).startsWith(prefix)) { //get each word beginning with the prefix
				begins.add(input.get(i)); //add each word with prefix to new "begins" ArrayList
			}
		}
		return begins;
	}

	// Return the sum of all numbers in the input list.
	//
	// For example, if input contained [1,2,10] this method should
	// return 13.
	//
	// You should not modify the input ArrayList.
	public double foldSum(ArrayList<Double> input) {
		if (input.size() != 0) {
		double sum = 0;
		for(int i=0; i<input.size(); i++) {
			sum = sum + input.get(i); //adding each value in input
		}
		return sum;
		}
		return 0;
	}

	// Return whether the list is ordered from lowest to highest.
	//
	// For example, if input contained [1,2,3] this method should
	// return true, while if input contained [1,3,2] it should
	// return false.
	//
	// You should not modify the input ArrayList.
	public boolean isOrderedAscending(ArrayList<Double> input) {
		for(int i=0; i<input.size(); i++) {
			if (input.get(i)>input.get(i+1)) { //checking pairs if value is greater than previous value
			}
		}
		return false;
	}

	// Return an ArrayList that contains the words from
	// list input1 that are in the same position in
	// input2.
	//
	// Remember: compare Strings with .equals(other)
	//
	// You should not modify the input ArrayLists.
	public ArrayList<String> matchingWords(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> match = new ArrayList<String>();
		for(int i=0; i<input1.size() && i<input2.size(); i++) { //make sure i is not bigger than both input sizes
			if (input1.get(i).equals(input2.get(i))) { //if word input1 equals word in input2 of same ith position
				match.add(input1.get(i)+", "+input2.get(i)); //add both equal words to new "match" ArrayList
				return match;
			}
		}
		return null;
	}

	// Return an ArrayList that contains all the words in
	// the input1 list that are also in the input2 list.
	//
	// Hint: You will use nested loops.
	// Hint: You will probably need a boolean variable.
	//
	// You should not modify the input ArrayLists.
	public ArrayList<String> intersection(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> same = new ArrayList<String>();
		for(String n:input1) {	//Go into each word in input1
			for(int i=0; i<input2.size(); i++) { //nesting loop
				if (input2.get(i) == n) {	//check each word in input2 if same as each word in input1
					same.add(n);	//add the words into new "same" ArrayList
				}
			}
		}
		return same;
	}

	// Return an ArrayList that contains all the words in
	// the input1 list with any duplicate occurrences
	// removed. Keep the first time any duplicate word
	// appears.
	//
	// Hint: You will use nested loops.
	// Hint: Remember that everything is equal to itself.
	//
	// You should not modify the input ArrayList.
	public ArrayList<String> noDuplicates(
			ArrayList<String> input) {
		ArrayList<String> duplicates = new ArrayList<String>();
		duplicates.addAll(input);	//add all values in input into new "duplicates" ArrayList
		for(String n : input) {		//Step into each index of word
			for(int i=0; i<input.size(); i++) {
				if(n == input.get(i)) {		//Compare each word to all other words
					duplicates.remove(i);	//if the same/duplicate, then remove it.
				}
			}
		}
		return duplicates;
	}

	// Return an ArrayList that contains all the words in
	// the input1 list that are NOT in the input2 list.
	// Duplicated words in input1 that are not in input2
	// will appear more than once.
	//
	// You should not modify the input ArrayLists.
	public ArrayList<String> difference(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> different = new ArrayList<String>();
		for(String n:input1) {	//Step into input1
			for(int i=0; i<input2.size(); i++) {
				if (n != input2.get(i)) { //if input1 word is different from each input2 word
					different.add(n);
				}
			}
		}
		return different;
	}
		

	// Return an ArrayList that contains all the words that
	// are in exactly one of the input lists. Duplicated words
	// in each list should appear appropriately.
	//
	// You should not modify the input ArrayLists.
	public ArrayList<String> symmetricDifference(
			ArrayList<String> input1,
			ArrayList<String> input2) {
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(input1);
		unique.addAll(input2);	//add each inputs to new "unique" ArrayList
		for(String n : unique) {
			for(int i=0; i<unique.size(); i++) {
				if(n == unique.get(i)) {	//if words in input1 & input2 are same, remove them
					unique.remove(i);
				}
			}
		}
		return unique;
	}
		
	// Reverse the input list, in place.
	//
	// Hint: The set(index, value) method on ArrayLists updates
	// the value stored at a given index.
	public void reverse(ArrayList<String> input) {
			for(int i=0; i<input.size(); i++)
				input.set(i, input.get(input.size()-i));
		}
		

	// Shuffle the input list, in place, by swapping the element
	// at each position with one at a randomly-chosen equal or
	// later index
	//
	// Hint: You can generate a random integer from 0 to n - 1 with
	// (int)(Math.random() * n), and one from x to n - 1 with
	// x + (int)(Math.random() * (n - x)).
	public void shuffle(ArrayList<Double> input) {
		int j = 0;
		int rando = (int)(Math.random()*j);
		for(int n=0; n<input.size(); n++) {
		for (int i=0; i<input.size(); i++) {
			if (i<=rando && rando<input.size()) {
				input.set(n, input.get(i));
			}
		}
		}
	}

	// Return true if word1 and word2 are anagrams of one
	// another. One word is an anagram of another if it
	// has all the letters of the other word in a different
	// order.
	//
	// Hint: the substring(int beginIndex, int endIndex)
	// method gives the part of the string from beginIndex
	// (inclusive) to endIndex (exclusive).
	// Hint: charAt(int index) gives the character at the
	// given position in a string as a char, which is a
	// primitive type that can be used as an integer.
	public boolean isAnagram(String word1, String word2) {
		if (word1.length() == word2.length()) {
			for(int n=0; n<word1.length(); n++) {
			for(int i=0; i<word2.length(); i++) {
				if(word1.charAt(n) != word2.charAt(i)) {
					return false;
			}
			}
		}
		}
		return true;
	}

	// Return an ArrayList with a rolling five-item Olympic average
	// of the numbers in the input list.
	//
	// An Olympic average of five numbers is the average of the three
	// numbers left after ignoring the lowest and highest numbers. For
	// example, the Olympic average of [9,7,5,6,8] is the average of
	// 7, 6, and 8 (which is 7: (7 + 6 + 8) / 3 = 21 / 3).
	//
	// A rolling average over a list of numbers is a list of the averages
	// of consecutive numbers in the first list centred around each
	// possible point in the first list.
	//
	// Your method should return an Olympic average of each five-item
	// sequence of consecutive numbers in the list.
	//
	// You should not modify the input ArrayList.
	public ArrayList<Double> olympicAverages(ArrayList<Double> input) {
		ArrayList<String> olympics = new ArrayList<String>();
		for(int i=0; i<4; i++) {
			input.get(i);
			
		}
		return null;
	}

	// Order all the numbers in the input list from lowest to highest.
	//
	// Hint: You can loop over the list repeatedly until it is in order,
	// swapping adjacent items that are out of order.
	public void orderAscending(ArrayList<Double> input) {
		for(int n=0; n<input.size(); n++) {
			for(int i=0; i<input.size(); i++) {
				if(input.get(n)<=input.get(i)) {
					input.add(n, input.get(i));
					input.remove(i);
				}
			}
		}
	}

	// The previous method takes up to n^2 steps for a list with size n.
	// It could be faster. This method should do the same thing, but
	// taking many fewer steps.
	public void orderAscendingFaster(ArrayList<Double> input) {
		Collections.sort(input);//sorts input in ascending order by default
		
	}

	// Reverse a string correctly.
	public String reverseString(String input) {
		String reverse = "";
		for(int i=0; i<input.length(); i++) {	//using for loop
			reverse = input.charAt(i) + reverse;
		}
			
			
		
		return null;
	}

	public static void main(String[] args) {
		new UserInterface();
	}
}
