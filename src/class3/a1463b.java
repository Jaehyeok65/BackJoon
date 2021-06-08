package class3;


import java.util.*;


public class a1463b {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int recur[] = new int[n+1];
		
		recur[0] = recur[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			recur[i] = recur[i-1] + 1; //한번의 연산을 수행;
			
			if(i % 2 == 0) { 
				recur[i] = Math.min(recur[i], recur[i/2] + 1);
			}
			if(i % 3 == 0) {
				recur[i] = Math.min(recur[i], recur[i/3] + 1);
			}
		}
		System.out.print(recur[n]);
		// TODO Auto-generated method stub

	}

}
