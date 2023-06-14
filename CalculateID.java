package n1e1to3;

public class CalculateID {
	
	public static String calculateID(int id) {
		String code = "";
		
		if (id <= 12500000) {
			code = "A";
		} else if (id <= 25000000) {
			code = "B";
		} else if (id <= 37500000) {
			code = "C";
		} else if (id <= 50000000) {
			code = "D";
		} else if (id <= 62500000) {
			code = "E";
		} else if (id <= 75000000) {
			code = "F";
		} else if (id <= 87500000) {
			code = "G";
		} else if (id <= 90000000) {
			code = "H";
		} else if (id <= 95000000) {
			code = "I";
		} else if (id <= 97000000) {
			code = "J";
		}
		return code;
	}
	

}

/*
 *  - Exercise 2	
 *  
    Create a class called CalculoDni that calculates 
    the letter of the DNI by receiving the number as a parameter.
    Create a jUnit class that verifies its correct operation, 
    parameterizing it so that the test receives a wide spectrum 
    of data and validates if the calculation is correct for 
    10 predefined ID numbers.
 * 
 *
 * 
 * */
