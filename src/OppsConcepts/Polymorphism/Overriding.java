package OppsConcepts.Polymorphism;

class Parent {               //   class 1
	// Method 1 of parent class 
	void Print()
	{
		// Print statement
		System.out.println("parent class");
	}
}
class subclass1 extends Parent { //class 2

	// Method 2
	void Print() { System.out.println("subclass1"); }
}
class subclass2 extends Parent { //class 3

	// Method 3
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
}

// Class 4
// Main class
class Overriding {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of class 1
		Parent a;
		// Now we will be calling print methods
		// inside main() method
		a = new subclass1();
		a.Print();
		a = new subclass2();
		a.Print();
	}
}

