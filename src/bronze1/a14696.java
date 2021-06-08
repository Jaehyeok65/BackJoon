package bronze1;


import java.util.*;


public class a14696 {
	
	public static String win(int a[], int b[]) {
		
		int counta[] = new int[4];
		int countb[] = new int[4];
		int rlwns[] = {1,2,3,4};
		String result = "";
		boolean pan = false;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < rlwns.length; j++) {
				if(a[i] == rlwns[j]) {
					counta[j]++;
				}
			}
		}
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < rlwns.length; j++) {
				if(b[i] == rlwns[j]) {
					countb[j]++;
				}
			}
		}
		for(int i = counta.length-1; i >= 0; i--) {
			if(counta[i] > countb[i]) {
				result = "A";
				pan = true;
				break;
			}
			if(counta[i] < countb[i]) {
				result = "B";
				pan = true;
				break;
			}
		}
		if(!pan) {
			result = "D";
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int a1[] = new int[a];
			for(int j = 0; j < a; j++) {
				a1[i] = sc.nextInt();
			}
			int b = sc.nextInt();
			int b1[] = new int[b];
			for(int j = 0; j < b; j++) {
				b1[i] = sc.nextInt();
			}
			System.out.println(win(a1,b1));
		}
		// TODO Auto-generated method stub

	}

}
