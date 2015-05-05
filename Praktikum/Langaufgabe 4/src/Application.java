import javax.management.RuntimeErrorException;


public class Application {
	public static void main(String[] args) {
		if(args.length == 6){
		Point[] points = new Point[3];
		try{
		for(int i = 0; i< points.length; i++){
			points[i] = new Point(Integer.valueOf(args[i*2]),Integer.valueOf(args[i*2+1]));
		}
		}catch(IllegalArgumentException e){
			System.out.println("Ungültiger Argumentetyp");
			return;
		}
		Triangle t = new Triangle(points);
		System.out.println(t.perimeter());
		}else if(args.length == 0){
			//ZUFALLSZAHLEN
		}
		else{
			new RuntimeException("Fehlerhafte Menge von Argumenten");
			}
		
	}
}
