package com.java;

public class Customer {
	
	// properties / instance variables
	String name;
	int id;
	String address;
	long phone;
	String email;
	
	
	// methods/ functions
	public void viewproduct() {
		System.out.println(" This is a view product method");
		
	}
	public void addproduct() {
		System.out.println(" This is a add product method");
		
	}
	public void placeproduct() {
		System.out.println(" This is a place product method");
		
	}

	public static void main(String[] args) {
		
		Customer ob=new Customer();
		ob.id=1;
		ob.name="Ankita";
		ob.address="Pune";
		ob.email="ab@gmail.com";
		ob.phone=8080109858L;
		ob.addproduct();
		ob.placeproduct();
		ob.viewproduct();
		
		
		Customer ob1=new Customer();
		ob1.id=2;
		ob1.name="Yogita";
		ob1.address="Mumbai";
		ob1.email="XYZ@gmail.com";
		ob1.phone=908048536L;
		ob1.addproduct();
		ob1.placeproduct();
		ob1.viewproduct();
		
		System.out.println(ob1.id + " "+ob1.name+" "+ob1.phone+" "+ ob1.address);
		System.out.println(ob.id + " "+ob.name+" "+ob.phone +" "+ ob.address);
	
		
		
	

	}

	

}
