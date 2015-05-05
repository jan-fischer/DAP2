
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
	
	
	public boolean gleich(Point p){
		boolean stimmt = true;
		if(p.dimension != this.dimension) return false;
		else{
			for(int i = 0; i< this.feld.length; i++){
				if(p.feld[i]!=this.feld[i]) stimmt = false;				
			}	
	
		}
		return stimmt;
	}
	
	
	
}
