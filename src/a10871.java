import java.util.*;


public class a10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int ans = sc.nextInt();
			if(ans < x) {
				System.out.print(ans+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
