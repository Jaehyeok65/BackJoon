import java.util.*;


public class a2875d1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int team = n/2 < m ? n/2 : m; //최대 팀수를 짜줌
		k = k - (n - team*2) + (m - team);
		
		while(k > 0) {
			k -=3; 
			team--;
		}
		System.out.print(team);
		// TODO Auto-generated method stub

	}

}
