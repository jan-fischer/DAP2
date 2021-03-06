import java.awt.List;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConvexHull {
	static ArrayList<Point> points = new ArrayList<Point>();
	
	public static ArrayList<Point> simpleConvex(Point[] P) {
		
		ArrayList<Point[]> kanten_list = new ArrayList<Point[]>();
		
		
		for(int p = 0; p<P.length; p++){
			
			for (int q = 0;q<P.length; q++) {
				System.out.println("\n\n\n"+p +"->p____q->"+q);
				boolean valid = true;
				
				for (int i = 0; i < P.length; i++) {
					Point r = P[i];
					
					if (!(P[p].equals(r) || P[q].equals(r))) {
						System.out.print("\nÜberprüfe  p("
								+ P[p].get(0) + "," + P[p].get(1) + ") und q("
								+ P[q].get(0) + "," + P[q].get(1)
								+") für Punkt r("+r.get(0)+","+r.get(1)+")");
						
						if (where(P[p], P[q], r.get(0), r.get(1))==-1) {
							System.out.println("Liegt Links");
							valid = false;
						}else
							System.out.println("Liegt Rechts");
					}
				}
				if (valid == true) {
				    if (!P[p].equals(P[q])){
						
					
								
					System.out.println("-----------\n\n\nPunkt p(" + P[p].get(0) + ","
							   + P[p].get(1) + ") und q(" + P[q].get(0) + ","
							   + P[q].get(1) + ") wird hinzugefügt\n\n");
					
					Point[] kante = {P[p],P[q]};
					kanten_list.add(kante);
						
				    }
				
				}

			}
		}
		
		
		for(int i = 0; i<kanten_list.size(); i++){
			Point[] kanten = kanten_list.get(i);
			Point a = kanten[0];
			Point b = kanten[1];
			
			if(b!=null)
			System.out.println("("+a.get(0) + ","
								+ a.get(1) + ") --> ("
								+b.get(0) + ","
								+ b.get(1) + ")");
								
			else System.out.println("------");
		}
		
		
		
		
		
		for(int i = 0; i<points.size(); i++){
			Point a = points.get(i);
			
			System.out.println("("+a.get(0) + ","
								+ a.get(1) + ") -->");
								
		
		}
		
		
		
		return konstructList(kanten_list);
	}
	
	public ArrayList<Point> konstructList(ArrayList<Point[]> p){
		
	}
	
	
	public static int where(Point p, Point q, double rX, double rY) {
		
		// g(x)= mx+n
		// n = -y -mx;
		double a = (q.get(1) - p.get(1));
		double b = (q.get(0) - p.get(0));
		double m;
		if(b == 0){
			m = 0;
		}else{
			m = roundScale2(a)/roundScale2(b);
		}
		
		// System.out.println("Steigung berechnet: "+m);
		double n = (p.get(1) - (p.get(0) * m));
		// System.out.println("Y-Achsenabschnitt berechnet: "+n);
		// mx = y-n
		// x = (y-n)/m
		double x = (rY - n) / m;
		// System.out.println("x Wert zu y = "+rY+" ist gleich "+x);
	System.out.println("\ng(x)= "+m+"x + "+n);
		if (rX < x)
			return -1;
		else if (rX > x) return 1;
		else return 0;
	}
	
	 public static double roundScale2( double d )
  {
    return Math.rint( d * 100 ) / 100.;
  }

	public static void main(String[] args) {

		Point[] points = { new Point(0, 0), new Point(0,2 ), new Point(1, 4), new Point(4,4), new Point(4,0), new Point(2,2) };
		System.out.println(simpleConvex(points));

	}

}
