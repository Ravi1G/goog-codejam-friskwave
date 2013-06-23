package com.friskwave.utils;

import java.util.HashMap;

/**
 * @author Parth Arora
 * @email arora.parth@gmail.com
 * @desc This class contains generic implementations for certain mathematical
 * operations that might come of use in multiple places.
 */
public class NumberOperations{
	
	public static final long HCF(long p, long q){
		
		if (q == 0) {
			return p;
		}
		
		return HCF(q, p % q);
	}
	
	public static final HashMap<Integer,Long> getPrimeFactors(long number){
		
		long n = number;
		
		HashMap<Integer,Long> factors = new HashMap<Integer,Long>();
		
		int  k = 0;
		for (long i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.put(k++,i);
				n /= i;
			}
		}
		
		return factors;
	}
	
	public static final long convertToDecimal(String value, int base){
		
		return 0;
	}
}