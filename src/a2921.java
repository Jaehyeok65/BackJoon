import java.util.*;


public class a2921 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n이 늘어날때마다 도미노의 개수도 n+1개씩 늘어남 		
		int dot = 3; //찍을 수 있는 최대 점의 개수 = 2n
		int x = 3;
		int y = 3;
		for(int i = 1; i <= n; i++) {
			dot = i*x;
			x = x + y++;
		}
		System.out.print(dot);

		
		// TODO Auto-generated method stub

	}

}
