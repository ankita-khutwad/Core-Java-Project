package com.java;

import java.util.Arrays;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		int otp=5826 , orderId;
		long phone=80801098;
		orderId= 234;
		byte value1=78;
		short value2=89;
		
		char symbol='*';
		boolean status=true;
		
		float amount=596.598F; // F-->float  D-->double  L-->long
		
		// non primitive data types
		int scores[]=new int[10]; // 10 indicates no of elements
		int scores1[]= {1,2,3,4,5,6,7}; // static initialization of arrays
		
		float amounts[]= new float[5];
		char vowels[]= {'a', 'e', 'i', 'o','u'};
		
		
		System.out.println(orderId);
		amounts[4]=3.4f;
		System.out.println(symbol);
		System.out.println(amount);
		System.out.println(scores1);// it prints reference of array
		System.out.println(Arrays.toString(scores));

	}

}
