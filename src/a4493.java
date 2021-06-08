import java.util.*;


public class a4493 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int p1w = 0;
			int p2w = 0;
			for(int j = 0; j < n; j++) {
				String p1 = sc.next();
				String p2 = sc.next();
				char p1c = p1.charAt(0);
				char p2c = p2.charAt(0);
				if(p1c == 'R' && p2c == 'S') {
					p1w++;
				}
				else if(p1c == 'P' && p2c == 'R') {
					p1w++;
				}
				else if(p1c == 'S' && p2c == 'P') {
					p1w++;
				}
				else if(p1c == 'R' && p2c == 'P') {
					p2w++;
				}
				else if(p1c == 'P' && p2c == 'S') {
					p2w++;
				}
				else if(p1c == 'S' && p2c == 'R') {
					p2w++;
				}
			}
			if(p1w > p2w) {
				System.out.println("Player 1");
			}
			else if(p2w > p1w) {
				System.out.println("Player 2");
			}
			else {
				System.out.println("TIE");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
