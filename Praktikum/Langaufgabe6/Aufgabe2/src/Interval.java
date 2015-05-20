
public class Interval implements Comparable<Interval> {
	private int a,b;
	
	
	
	public Interval(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
		
	public int getStart(){ //Gibt Anfang zurrück
		return a;
	}
	public int getEnd(){//Gibt Ende zurrück
		return b;
	}
	
	public String toString(){
		return new String("("+a+","+b+")"); //Darstllung des Intervalls
	}

	
	@Override
	public int compareTo(Interval o) { 
		if(this.getEnd() < o.getEnd()) return -1; //Ist das Ende kleiner als das Ende eines anderen Interval dann soll es als kleiner gelten
		else if(this.getEnd() > o.getEnd()) return 1;//Ist das Ende größer als eine Anderes soll es als größer gelten
		else return 0; //Wenn gleich dann soll eine 0 zurrückgegeben werden
	}
	
}