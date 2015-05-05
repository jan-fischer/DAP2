
public class Point {
	int dimension;
	double[] feld;
	

	//Konstruktor
	public Point(double... args) {
		dimension = args.length;
		feld = args;
		//System.out.println("-----------------------\nPoint "+this.toString()+": Punkte sind eingefügt");
		
	}
	
	//GETTER
	public double get(int i){
		//System.out.println("-----------------------\nPoint "+this.toString()+": get() Methode aufgerufen Koordinate: "+i+" ist: "+feld[i]);
		return feld[i];
	}
	
	
	
	
	
	
}
