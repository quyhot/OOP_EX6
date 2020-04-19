package bai6_1;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1.setX(x1);
		v1.setY(y1);
		v2.setX(x2);
		v2.setY(y2);
		v3.setX(x3);
		v3.setY(y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public String toString() {
		return "MyTriangle[v1=(" + v1.getX() + "," + v1.getY() + ")" 
				+ ",v2=(" + v2.getX() +"," + v2.getY() +")," 
				+ "v3=(" + v3.getX() + "," + v3.getY() + ")]";
	}
	public double getPerimeter() {
		return v1.distance(v2) + v1.distance(v2) + v2.distance(v3);
	}
	public String getType() {
		if(v1.distance(v2) == 0 && v1.distance(v3) == 0) {
			return "Three points overlap.";
		}
		if(v1.distance(v2) == 0 || v1.distance(v3) == 0 || v2.distance(v3) == 0) {
			return "A line.";
		}	
		if (v1.distance(v2) == v1.distance(v3) && v1.distance(v2) == v2.distance(v3)) {
			return "Equilateral triangle.";
		}
		if (v1.distance(v2) == v1.distance(v3) || v1.distance(v2) == v2.distance(v3) || v1.distance(v3) == v2.distance(v3)){
			return "isosceles triangle.";
		}
		else 
			return "scalene triangle.";
	}
}
