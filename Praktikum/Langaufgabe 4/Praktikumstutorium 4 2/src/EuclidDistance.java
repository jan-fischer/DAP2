
public class EuclidDistance implements Distance {

	@Override
	public double distance(Point p1, Point p2) {
		double inderWurzel = 0;
		for(int i = 0; i <p1.dimension; i++){
			double q = p1.get(i);
			double p = p2.get(i);
			double erg = q-p;
			
			inderWurzel += erg*erg;
			
		}
		return Math.sqrt(inderWurzel);
	}
	
}
