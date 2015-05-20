public class Main {
	static int[] A = { 1, 2, 3, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5,
			6, 7, 8 };

	public static int Z(int i, int max) {

		if (i > 0 && A[i] > A[i - 1])
			return Z(i - 1, max + 1);
		else if (i > 0 && A[i] <= A[i - 1] && Z(i - 1, 0) > max)
			return Z(i - 1, 0);
		
		else
			return max + 1;
	}

	public static void main(String[] args) {
		System.out.println(Z(A.length - 1, 0));
	}
}
