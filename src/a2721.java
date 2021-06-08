import java.util.*;


public class a2721 {
	
	public static int tn(int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //테스트 케이스
		for(int i = 0; i < t; i++) {
		int n = sc.nextInt();
		int wn = 0;
		int k = 1;
		while(k <= n) {
			wn = wn + k*tn(k+1);
			k++;
		}
		System.out.println(wn);
		}
		// TODO Auto-generated method stub

	}

}
