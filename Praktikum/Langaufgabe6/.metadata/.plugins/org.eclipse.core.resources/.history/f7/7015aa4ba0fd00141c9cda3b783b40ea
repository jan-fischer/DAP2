import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Anwendung {
	

	//_____________________Interval___________________________
	private static void startInterval(String path) {

		try {

			
			ArrayList<Interval> A = new ArrayList<Interval>();

			RandomAccessFile file = new RandomAccessFile(path, "r");

			String zeile = file.readLine();
			while (zeile != null) {

				StringTokenizer st = new StringTokenizer(zeile, ",");

				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());

				Interval ivall = new Interval(start, end);
				A.add(ivall);
				zeile = file.readLine();
			}
			file.close();
			System.out.println("Unsortiert: ");
			printIntervalArrayList(A);
			Collections.sort(A);
			System.out.println("Sortiert: ");
			printIntervalArrayList(A);

			System.out.println("Berechnetes Intervalscheduling: ");
			printIntervalArrayList(intervalScheduling(A));
		} catch (Exception e) {
			
		}

	}

	//Interval-Algo
	public static ArrayList<Interval> intervalScheduling(
			ArrayList<Interval> intervals) {

		int n = intervals.size();
		ArrayList<Interval> A = new ArrayList<Interval>();
		A.add(intervals.get(0));
		int j = 0;

		for (int i = 1; i < n; i++) {
			if (intervals.get(i).getStart() >= intervals.get(j).getEnd()) {
				A.add(intervals.get(i));
				j = i;
			}
		}

		return A;
	}
	
	
	
	//_______________________Lateness________________________________________

	private static void startLateness(String path) {
		try {
			
			ArrayList<Job> A = new ArrayList<Job>();

			RandomAccessFile file = new RandomAccessFile(path, "r");

			String zeile = file.readLine();
			while (zeile != null) {

				StringTokenizer st = new StringTokenizer(zeile, ",");

				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());

				Job job = new Job(start, end);
				A.add(job);

				zeile = file.readLine();

			}

			file.close();
			System.out.println("Unsortiert: ");
			printJobArrayList(A);
			Collections.sort(A);
			System.out.println("Sortiert: ");
			printJobArrayList(A);
			System.out.println("Berechnetes Latenessscheduling");
			printArray(latenessScheduling(A));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	//Lateness-Algo
	public static int[] latenessScheduling(ArrayList<Job> jobs) {
		int n = jobs.size();
		int[] A = new int[n];
		int z = 0;

		for (int i = 0; i < n; i++) {
			A[i] = z;
			z += jobs.get(i).getDauer();
		}

		return A;
	}
	
	
	
	//______________________Ausgaben____________________________________________
	private static void printIntervalArrayList(ArrayList<Interval> A){
		
		System.out.print("[");
		for(int i = 0; i<A.size();i++){
			System.out.print("["+A.get(i).getStart()+", "+A.get(i).getEnd()+"], ");
		}
		System.out.println("]");
	}
	
private static void printJobArrayList(ArrayList<Job> A){
		
		System.out.print("[");
		for(int i = 0; i<A.size();i++){
			System.out.print("["+A.get(i).getDauer()+", "+A.get(i).getDeadline()+"], ");
		}
		System.out.println("]");
	}
	
	private static void printArray(int[] A){
		System.out.print("[");
		for(int i = 0; i<A.length; i++){
			System.out.print(A[i]+", ");
		}
		System.out.println("]");
	}

	// _____________________________Main____________________________________________

	public static void main(String[] args) {
		String methode = "i";
		String path = null;

		if (args.length == 2) {// TODO Fehlerbehandlung
			methode = args[0];
			path = args[1];

		}

		if (methode.equals("Interval")) {
			System.out.println("Bearbeite Datei '"+path+"'");
			startInterval(path);

		} else {
			System.out.println("Bearbeite Datei '"+path+"'");
			startLateness(path);

		}

	}
}