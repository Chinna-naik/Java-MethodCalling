package Methodcalling;

//Main class to test the Mobile class
public class MobileApp {

	 // Creating an object of Mobile class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an object of Mobile class
		Mobile M = new Mobile();
		
		// Accessing and printing the object's data members
		System.out.println("you are mobile name is "+M.name);
		System.out.println("you are mobile color is "+M.color);
		
		 // Calling methods of the object
		M.call(); 
		M.mail();
	}

}
