package lab06;
/*
 * Description: Create a class called Complex for performing arithmetic with complex numbers. 
 * Write a program to test your class. Use floating-point variables to represent the private data of the class.   
*/

public class Complex {

	private final double realPart;
	private final double imaginaryPart;
	
	public Complex() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public Complex(double r, double i) {
		this.realPart = r;
		this.imaginaryPart = i;
	}
	
	// return a string of Complex object
    public String toString() {
    	
        if (imaginaryPart == 0) 
        	return realPart + "";
        
        if (realPart == 0) 
        	return imaginaryPart + "i";
        
        if (imaginaryPart <  0) 
        	return realPart + " - " + (-imaginaryPart) + "i";
        
        return realPart + " + " + imaginaryPart + "i";
    }
	
	/*
	Add two Complex numbers: The real parts are added together and the imaginary parts are added together. */
	public Complex add(Complex toAdd) {
		Complex a = this;
		double r = a.realPart + toAdd.realPart;
        double i = a.imaginaryPart + toAdd.imaginaryPart;
        return new Complex(r, i);
	}
	
	/*
	Subtract two Complex numbers: 
    * The real part of the right operand is subtracted from the real part of the left operand, 
    * and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.*/
	public Complex sub(Complex toSub) {
		 Complex a = this;
	     double r = a.realPart - toSub.realPart;
	     double i = a.imaginaryPart - toSub.imaginaryPart;
	     return new Complex(r, i);
	}
	/* 
	 *  Print Complex numbers in the form (realPart, imaginaryPart). */
	public Complex result() {
		return this;
	}

}
