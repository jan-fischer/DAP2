
public class Main {
	static int remainingBonus = 50;
	int[] I ={1,2,3,4};
	static int[] B = {35,10,15,20};
	static int[] P = {3,10,20,50};
	static boolean[] benutzt = {false, false, false, false};
	
	public static int A(int i, int j){
		
		if(i>0 && j>0) {
			int a = A(i-1,j-B[i])+P[i];
			int b = A(i-1,j);
			
			
		}
		else return(P[i]);
	}
	
	public static void main(String[] args) {
		int[] mem = new int[B.length];
		for(int i = 0; i< B.length; i++){
			mem[i]=-1;
			mem[i]=A(i,50);
			System.out.println(mem[i]);
			
		}
		
		
	}
}
