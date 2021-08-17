package sampleapp;

public class SalesClass {
	public void display() {
		int[] arr= {23,45,56,67,78,91};
		for(int num:arr)
			System.out.println(num);
	}
	
	public void print() {
		System.out.println("Print all array numbers");
		display();
	}

	
	
}
