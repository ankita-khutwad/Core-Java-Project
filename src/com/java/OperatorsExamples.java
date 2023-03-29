package com.java;

public class OperatorsExamples {

	public static void main(String[] args) {
		int a=10, b=20;
		int result=(a<b)?a:b; // ternary operator
		System.out.println(result);
		System.out.println(" ");
		
		//Arithmetic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b%a);
		System.out.println(" ");
		
		//Relational operators
		//output of any relational operator is boolean i.e. true or false
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);//not operator
		System.out.println(a==b);
		System.out.println(" ");
		
		//Logical operators
		System.out.println((a!=b) && (a>b));
		System.out.println((a!=b) || (a>b));
		
		//Bitwise operators
		System.out.println("Shift oprators");
		System.out.println(a>>2);//left shift
		// 10 -> 1010 -> 0010 -> 2
		System.out.println(a<<2);//right shift
		//10 ->1010 ->101000 -40
		
		//Assignment operators
		a=a+10;
		a+=10;
		
		a=a*b;
		a*=b;
	}

}
