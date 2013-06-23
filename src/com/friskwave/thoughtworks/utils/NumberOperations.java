package com.friskwave.thoughtworks.utils;

public class NumberOperations {
	
	public static Double convertRomanToArabic(String romanValue) {
		
		Double arabicValue = 0.0;
		
		romanValue = romanValue.toUpperCase();
		
		for(int x = 0;x<romanValue.length();x++) {
		
			switch(romanValue.charAt(x)) {
				
				case 'M':
					arabicValue += 1000;
					break;
				
				case 'D':
					arabicValue += 500;
					break;
				
				case 'C':
					arabicValue += 100;
					break;
				
				case 'L':
					arabicValue += 50;
					break;
				
				case 'X':
					arabicValue += 10;
					break;
				
				case 'V':
					arabicValue += 5;
					break;
				
				case 'I':
					arabicValue += 1;
					break;
			}
		}
		
		if(romanValue.contains("IV")) {
			arabicValue-=2;
		}
		if(romanValue.contains("IX")) {
			arabicValue-=2;
		}
		if(romanValue.contains("XL")) {
			arabicValue-=20;
		}
		if(romanValue.contains("XC")) {
			arabicValue-=20;
		}
		if(romanValue.contains("CD")) {
			arabicValue-=200;
		}
		if(romanValue.contains("CM")) {
			arabicValue-=200;
		}
		
		return arabicValue;
	}
}