public class Job implements Comparable<Job> {

	private int a, b;

	public Job(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int getDauer() {
		return a;
	}

	public int getDeadline() {
		return b;
	}

	public String toString() {
		return new String("(" + a + "," + b + ")");
	}

	@Override
	public int compareTo(Job o) {

		if (this.getDeadline() < o.getDeadline())
			return -1;
		else if (this.getDeadline() > o.getDeadline())
			return 1;
		else
			return 0;

	}

}
