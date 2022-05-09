package entities;

public class Student {
	
public String name;
public double grade1;
public double grade2;
public double grade3;

public double finalgrade() {
	return grade1 + grade2 + grade3;
}

public double missingpoints() {
	return 60.00 - finalgrade();
}


public void pass() {
	
	System.out.printf("\nFINAL GRADE = %.2f%n", finalgrade());
	
	if(finalgrade() > 60.00) {
		System.out.println("PASS");
	}
	
	else {
		System.out.println("FAILED");
		
					
		System.out.printf("MISSING " + missingpoints() + " POINTS");
	}
		
	
}
}

