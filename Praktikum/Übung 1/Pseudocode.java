public class Pseudocode {
	public static void main(String[] args) {
		int[] feld = {1,2,3};
		run(feld);
	}
	public static void run(int[] array){
		int counter = 0;
		int n = array.length;
		counter++;
		for(int i = n-1; i>=0; i--){
			counter++;
			for(int j = 0; j<=i-1; j++){
				counter = counter+5;
			}
		}
		
		System.out.println(counter);
	}
	
}
