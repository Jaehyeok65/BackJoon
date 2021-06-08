import java.util.*;


public class a10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int Fibo[] = new int[n+1];
		
		
		
		for(int i = 0; i < Fibo.length; i++) {
			if(i == 0) Fibo[i] = 0;
			else if(i == 1) Fibo[i] = 1;
			else {
			Fibo[i] = Fibo[i-1] + Fibo[i-2];
			}
		}
		
		System.out.print(Fibo[n]);
		
		
	
		// TODO Auto-generated method stub

	}

}
