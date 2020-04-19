package bai6_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint v1 = new MyPoint();
		MyPoint v2 = new MyPoint(5, 10);
		MyPoint v3 = new MyPoint(3, 3);
		MyTriangle t1 = new MyTriangle(v1, v2, v3);
		System.out.println(t1.toString());
		System.out.println(t1.getPerimeter());
		System.out.println(t1.getType());
	}

}
