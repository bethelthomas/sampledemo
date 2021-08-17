package sampleapp;

public class SalesClass {
	public void display() {
		int[] arr= {23,45,56,67,78,91};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("array size"+arr.length);
	}
	
	public void print() {
		System.out.println("Print all array numbers");
		display();
	}

	
	
}
