/*
 * Student Name: Liying Guo	
 * Lab Professor: Amal Ibrahim
 * Due Date: Aug 11, 2023
 * Description: Assignment 03
 */
/*
 * This class has entry main method
 * see the the comments on main method.
 * */
public class Assignment03LiyingGuo {
	/*
	 * The main method has two loop
	 * first loop:
	 *    it has 1000 times run; in each run, generate a random number between 1 to 10
	 *    based on the generated random number, increase the count saved in an element of the array
	 * second loop:
	 *    it has 10 times run; in each run, output a message on the times of the side dice(from 1 to 10)
	 *    increase the index at the end
	 * */
	public static void main(String[] args) {
		int roll = 0;
		//int array reference type variable declaration and initialization
		//instantiate the int array with 10 elements
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 10) + 1;
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		//fixed:the index condition is out of index that's why it crashed.
		for(int index = 0; index < diceRolls.length; index++) {  
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		//Output total rolls
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Your Liying Guo");

	}

}
