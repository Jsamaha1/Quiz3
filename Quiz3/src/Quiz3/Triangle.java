package Quiz3;

public class Triangle extends GeometricObject {
	/**
	 * Extention of the abstract class GeometricObject
	 * Takes in three sides of a triangle and computes information about it from that info.
	 * 
	 * @author Jacques
	 */

	// Three double data fields with default values	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	/** No arg constructor that creates a triangle with the default values.*/
	public Triangle(){
		
	}
	
	/** A constructor that creates a triangle with specefied siders */
	public Triangle(double side1, double side2, double side3){
		// Assigns the given values to the side variables
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Accessor methods for the three variables */
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea(){
		/** Calculates and returns the area using Herons formula*/
		double s = (side1 + side2 + side3)/2;
		double Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return Area;
	}
	
	/** A method that returns the perimeter of the triangle */
	public double getPerimeter(){
		return (side1+side2+side3);
	}
	
	/** A method that returns a string describing the triangle */
	public String toString(){
		String descrip = "The triangle has sides of: " + side1 + " " + side2+ " "+ side3;
		descrip += " and a perimter of: " + getPerimeter() + " and an area of: " + getArea();
		return descrip;
	}
	
	
}
