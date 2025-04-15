package Methodcalling;

public class GirlfriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Creating an object of the Girlfriend class
		Girlfriend G = new Girlfriend();
		
		// Accessing and printing object's attributes
		System.out.println("Girlfriend name "+G.name);
		System.out.println("Girlfriend weight "+G.height);
		System.out.println("Girlfriend weight "+G.weight);
		System.out.println("Girlfriend no "+G.no);
		
		// Calling methods of the Girlfriend object
		G.eat();   // Displays eating behavior
		G.sleep(); // Displays sleeping behavior

	}  

}
