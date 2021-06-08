import java.util.*;

public class a2547 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int candysum = 0;
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			for(int j = 0; j < n; j++) {
				int candy = sc.nextInt();
				candysum = (candysum + candy) % n; 
			}
			if(candysum % n == 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
