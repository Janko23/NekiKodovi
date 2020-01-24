package Geometry;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Point p1 = new Point();
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(12);
		p1.setX(5);
		p1.setY(6);
		System.out.println("Distanca je :" + p1.distance(p2.getX(), p2.getY()));
		
		Point pt1 = new Point();
		Point pt2 = new Point();
		pt1.setX(7);
		pt1.setY(8);
		pt2.setX(10);
		pt2.setY(9);
		
		Line l1 = new Line();
		l1.setStartPoint(pt1);
		l1.setEndPoint(pt2);
		System.out.println("x koordinata pocetne tacke je:" + l1.getStartPoint().getX());
		System.out.println("y koordinata pocetne tacke je:" + l1.getStartPoint().getY());
		System.out.println("x koordinata krajnje tacke je:" + l1.getEndPoint().getX());
		System.out.println("y koordinata krajnje tacke je:" + l1.getEndPoint().getY());
		
		System.out.println("Duzina stranice je:" + l1.Length(pt1, pt2));
		System.out.println("Distnca izmedju pt1 i pt2 je: " + pt1.distance(pt2.getX(), pt2.getY()));
		
		Rectangle r1 = new Rectangle();
		
		r1.setWidth(5);
		r1.setHeight(10);
		System.out.println("Povrsina : " + r1.area());
		
		Circle c1 = new Circle();
		Point pc1 = new Point();
		pc1.setX(15);
		pc1.setY(25);
		c1.setCenter(pc1);
		System.out.println("Centar c1 je : \t x :  " + c1.getCenter().getX() + " \t y : " + c1.getCenter().getY());
		c1.setR(5);
		System.out.println("Povrsina kruga: " + c1.area());
		
		Donut d1 = new Donut();
		d1.setCenter(pc1);
		d1.setR(6);
		d1.setInnerR(5);
		System.out.println("Povrsina krifne : " + d1.area());
		
		System.out.println("Broj: " + pt1.distance(pt2.getX(), pt2.getY()));
		System.out.println("Broj: " + pt2.distance(pt1.getX(), pt1.getY()));
		
	}

}
