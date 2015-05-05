
public abstract class Simplex {
	Point[] points;
	int dimension = 0;
	public Simplex(Point... points) {
		this.points = new Point[points.length+1];
		System.out.println("Länge des Arrays: "+points.length);
		
		
		
		for(int i = 0; i< points.length; i++){
			if(points[i].dimension>dimension) dimension = points[i].dimension;
			this.points[i] = points[i];
		}
		
	}
	
	
	public abstract boolean validate();
	
	
	//Summe der Seitenlängen
	public double perimeter(){
		double sum = 0;
		for(int i = 0; i<points.length-1; i++){
			for(int j = i+1 ; j<points.length-1; j++){
				double seite = new EuclidDistance().distance(points[i], points[j]);
				System.out.println("Seite mit Länge: "+seite);
				sum += seite;}
		}
		
		System.out.println(sum);
		return sum;
	
	}
	
	
}
