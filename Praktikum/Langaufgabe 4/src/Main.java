public class Main {
	public static void main(String[] args) {
		Triangle t = new Triangle(new Point(0,0),new Point(3,4), new Point(8,8));
		System.out.println(t.validate());
		System.out.println(t.perimeter());
	}
}
