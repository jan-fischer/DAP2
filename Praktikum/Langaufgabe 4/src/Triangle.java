
public class Triangle extends Simplex {

	
	public Triangle(Point... points) {
		super(points);
	}

	@Override
	public boolean validate() {
		System.out.println("Triangle: "+this.toString()+" Dimension beträgt: "+dimension+" und die Menge der Punkte: "+ (points.length-1));
		if(points.length-1==3 && dimension == 2){
			return true;
		}
		return false;
	}
	
	
	
}
