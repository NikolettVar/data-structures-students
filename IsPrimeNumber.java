/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssampletest;

/**
 *IsPrimeNumber.java
 *N Varadi
 * 25 03 2021
 */

public class IsPrimeNumber {
    public static boolean isPrime(int number, int divisor) {
        
		if(number <= 2) {//1 and 2 are prime numbers in math, base case
			return true;
		}
		if(divisor == (number/2)) {
			return true;
		}
		else if(number % divisor == 0) {//if the number is dividable by the divisor withour remainder, it's not a prime
			return false;
		}
		else {
			return isPrime(number, divisor +1);//call method recursively, keep checking division results when incrementing divisor
		}
    }
}
