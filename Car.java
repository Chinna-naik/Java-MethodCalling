package Methodcalling;

public class Car {
	
	void Start()  // Method to start the car
	{
		System.out.println("Car Started");
	}
	void Shiftgear() // Method to shift gear
	{
		System.out.println("car Shift gear");
	}
	void move() // Method to move the car by calling Start() and Shift gear()
	{
		Start(); // Calling Start method
		Shiftgear(); // Calling Shift  gear method
		System.out.println("car Moved");
	}
} 