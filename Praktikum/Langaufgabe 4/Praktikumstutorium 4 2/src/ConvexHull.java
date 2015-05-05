import java.awt.List;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConvexHull {
	static ArrayList<Point> points = new ArrayList<Point>();
	static String s = new String();
	public static ArrayList<Point> simpleConvex(Point[] P) {
		Point[][] kanten = new Point[P.length][2];
		for(int i = 0; i<P.length;i++){
			kanten[i][0] = P[i];
			kanten[i][1] = null;
		}
		
		for(int p = 0; p<P.length; p++){
			
			for (int q = p+1;q<P.length; q++) {
				System.out.println("\n\n\n"+p +"->p____q->"+q);
				boolean validL = true;
				boolean validR = true;
				for (int i = 0; i < P.length; i++) {
					Point r = P[i];
					//System.out.println("Punkt R: (" + P[i].get(0) + ","
					//			+ P[i].get(1) + ")");
					if (!(P[p].equals(r) || P[q].equals(r))) {
						System.out.print("\nÜberprüfe  p("
								+ P[p].get(0) + "," + P[p].get(1) + ") und q("
								+ P[q].get(0) + "," + P[q].get(1)
								+") für Punkt r("+r.get(0)+","+r.get(1)+")");
						if (where(P[p], P[q], r.get(0), r.get(1))==-1) {
							System.out.println(" - LIEGT LINKS");
							
							validR = false;
						}else{
							System.out.println(" - LIEGT RECHTS");
							validL = false;
						}
					}
				}
				if (validL == true || validR == true) {
				if (!P[p].equals(P[q])){
						
						s = (s+ "-----------\n\n\nPunkt p(" + P[p].get(0) + ","
								+ P[p].get(1) + ") und q(" + P[q].get(0) + ","
								+ P[q].get(1) + ") wird hinzugefügt\n\n");
								
								
						System.out.println("-----------\n\n\nPunkt p(" + P[p].get(0) + ","
								+ P[p].get(1) + ") und q(" + P[q].get(0) + ","
								+ P[q].get(1) + ") wird hinzugefügt\n\n");
					
						int durchlauf = 0;
						for(int i = 0; i<kanten.length; i++){
							if(P[p].equals(kanten[i][0])){
								if(kanten[i][1] == null){
									kanten[i][1] = P[q];
									break;
								}
							}
							else if(P[q].equals(kanten[i][0])){
								if(kanten[i][1] == null){
									kanten[i][1] = P[p];
									break;
								}
							}
						}
						
				}
				
				}

			}
		}
		System.out.println("ERG: "+s);
		for(int i = 0; i<kanten.length; i++){
			Point a = kanten[i][0];
			Point b = kanten[i][1];
			
			if(b!=null)
			System.out.println("("+a.get(0) + ","
								+ a.get(1) + ") --> ("
								+b.get(0) + ","
								+ b.get(1) + ")");
								
			else System.out.println("------");
		}
		
		ArrayList<Point> liste = new ArrayList<Point>();
		
		Point vorletztesElement = null;
		Point letztesElement = null;
		boolean running = true;
		while(running){
			if(letztesElement == null){
				int i = 0;
				while(kanten[i][1]==null)i++;
				System.out.println(kanten[i][0]+"-->"+kanten[i][1]);
				vorletztesElement = kanten[i][0];
				letztesElement = kanten[i][1];
			}else{
				int i = 0;
				running = false;
				while(kanten[i][1]==null && !(((kanten[i][0]).equals(letztesElement) && !kanten[i][1].equals(vorletztesElement)) ||((kanten[i][1]).equals(letztesElement) && !kanten[i][1].equals(vorletztesElement)))) i++;
				running = true;
				if(i<P.length){
					if((kanten[i][0]).equals(letztesElement)){
						System.out.println("-->"+kanten[i][1]);
						letztesElement = kanten[i][1];
						break;
					}
					else if((kanten[i][1]).equals(letztesElement)){
						System.out.println("-->"+kanten[i][0]);
						letztesElement = kanten[i][0];
						break;
					}else{
						System.out.println("Fehler");
						
					}
				}
				
			}
		}
		
		System.out.println("Los gehts");
		for(int i = 0; i<liste.size(); i++){
			Point p = liste.get(i);
			System.out.println("("+p.get(0)+","+p.get(1)+")");
		}
		return points;
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
		else return 1;

	}
	
	 public static double roundScale2( double d )
  {
    return Math.rint( d * 100 ) / 100.;
  }

	public static void main(String[] args) {

		Point[] points = { new Point(1, 3), new Point(2, 1), new Point(5, 6),new Point(2,2),new Point(1, 0) };
		System.out.println(simpleConvex(points));

	}

}
