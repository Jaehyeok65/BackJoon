package bronze2;


import java.util.*;


public class a6359 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			int n = sc.nextInt();
			boolean room[] = new boolean[n+1];
			for(int j = 1; j < room.length; j++) { //처음 방문을 모두 염
				room[j] = true;
			}
			int count = 0;
			for(int j = 2; j <= n; j++) { //n번째 라운드를 반복
				for(int k = 1; k <= n; k++) {
					if(k % j == 0) {
						if(room[k] == true) {
							room[k] = false;
						}
						else if(room[k] == false) {
							room[k] = true;
						}
					}
				}
			}
			for(int j = 1; j < room.length; j++) {
				if(room[j] == true) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		// TODO Auto-generated method stub

	}

}
