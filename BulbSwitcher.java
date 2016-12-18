package com.Brainteaser;

public class BulbSwitcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(bulbSwitch(7));
	}
	/* For primes, they only have 1 and itself as their factors; so primes are even-operation numbers;
	 * So for 7- return 2
	 * For non primes, there are some square numbers like 4,9 which are odd operation numbers. 
	 * We need to find them. We can find them using sqrt function
	 * https://luzcn.gitbooks.io/interview/content/leetcode/bulb_switcher.html */
	 public static int bulbSwitch(int n) 
	 {
	        if(n < 0)
	        	return 0;
	        return (int)Math.sqrt(n);
	 }
}
