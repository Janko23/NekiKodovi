package Geometry;

import java.awt.Graphics;

public class Line /*extends Shape*/ {
	private Point startPoint;
	private Point endPoint;
	
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public double Length(Point startPoint, Point endPoint) {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	/*public void draw(Graphics g) {
		
	}*/
	
	/*public boolean contains(int x, int y) {
		return 
	}*/
	
	
}
