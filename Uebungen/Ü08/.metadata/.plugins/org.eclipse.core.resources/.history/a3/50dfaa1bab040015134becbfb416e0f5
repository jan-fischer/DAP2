
public class Main {
	public static void main(String[] args) {
		int[] A = {0,7,10,8,2,5,1,8,16,6}; //Die 0 ist nur da um den Pseudocode besser darzustellen.
		int n = A.length-1; //Wegen 1...n siehe Pseudocode
		
		//BottomUpMethode:
		
		int[] mem = new int[n+1]; //Wegen 0...n siehe Pseudocode
		mem[0] = 0;
		mem[1] = A[1];
		
		for(int i = 2; i<=n; i++){
			mem[i] = Math.max(mem[i-2]+A[i], mem[i-1]);
		}
		
		System.out.println(mem[n]);
	}
}
