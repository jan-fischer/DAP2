
public class Interval implements Comparable<Interval> {
	private int a,b;
	
	
	
	public Interval(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
		
	public int getStart(){
		return a;
	}
	public int getEnd(){
		return b;
	}
	
	public String toString(){
		return new String("("+a+","+b+")");
	}

	
	@Override
	public int compareTo(Interval o) {
		if(this.getEnd() < o.getEnd()) return -1;
		else if(this.getEnd() > o.getEnd()) return 1;
		else return 0;
	}
	
}