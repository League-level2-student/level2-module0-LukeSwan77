package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Luke", "Sarah", "Moriah", "Rachel", "Hannah"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "MoMo";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] nums;
		nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for(int i = 0; i < 50; i++) {
			nums[i] = ran.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] < smallestNumber) {
				smallestNumber = nums[i];
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int largestNumber = nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] > largestNumber) {
				largestNumber = nums[i];
			}
		}
		System.out.println(largestNumber);
	}
}
