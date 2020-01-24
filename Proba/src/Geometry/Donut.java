package Geometry;

public class Donut extends Circle {
	private int innerR;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int r, int innerR) {
		super(center, r);
		this.innerR = innerR;
	}
	
	public int getInnerR() {
		return innerR;
	}
	
	public void setInnerR(int innerR) {
		this.innerR = innerR;
	}
	
	public double area() {
		return super.area() - innerR * innerR * Math.PI;
	}
}
