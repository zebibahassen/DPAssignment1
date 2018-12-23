//Overloading allows different methods to have same name,
//but different signatures where signature can differ by number of input parameters
//or type of input parameters or both.
//Overloading is related to compile time (or static) polymorphism.

// Java program to demonstrate working of method 
// overloading in Java. 

public class Overloading { 

	// Overloaded sum(). This sum takes two int parameters 
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Overloading s = new Overloading(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 
