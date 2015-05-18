import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Anwendung {
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

	public static void main(String[] args) {
		String path = null;
		if (args.length == 1) {
			path = args[0];
		}

		String zeile;
		ArrayList<Interval> A = new ArrayList<Interval>();
		try {
			RandomAccessFile file = new RandomAccessFile(path, "r");

			zeile = file.readLine();
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

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void printIntervalArrayList(ArrayList<Interval> A) {

		System.out.print("[");
		for (int i = 0; i < A.size(); i++) {
			System.out.print("[" + A.get(i).getStart() + ", "
					+ A.get(i).getEnd() + "], ");
		}
		System.out.println("]");
	}

}
