package org.Collage;

public class Details {

	private void studinfo(String name) {

	System.out.println(name);	
	}
	
	private void studinfo(int Id) {

	System.out.println(Id);	
	}
	
	private void studinfo(float Fees) {
	System.out.println(Fees);	
	}
	
	private void studinfo(String Address, int No) {

	System.out.println(Address);
	System.out.println(No);
	}
	
	public static void main(String[] args) {
		
	Details d = new Details();
	
	d.studinfo("Purushoth");
	d.studinfo(2000);
	d.studinfo("No : 3 MGM Nager,  Medavakkam", 100);
	d.studinfo(3000.1990f);
	}
	
	
}
