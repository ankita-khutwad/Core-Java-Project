package com.java;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=89, v2=67, v3=81;
		
		if(v1>v2 && v2>v3) {
			System.out.println(v1+ " is the smallest");
		}
		else if(v2<v1 && v2<v3 ) {
			System.out.println(v2+ " is the smallest");
		}
		else {
			System.out.println(v3+" is the smallest");
		}

	}

}
