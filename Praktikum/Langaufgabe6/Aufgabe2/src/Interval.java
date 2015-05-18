
public class Interval {
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
	
}