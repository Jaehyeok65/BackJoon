package bronze2;


import java.util.*;


public class a13300 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int room = 0;
		int woman[] = new int[7];
		int man[] = new int[7];
		
		for(int i = 0; i < n; i++) {
			int sex = sc.nextInt();
			int grade = sc.nextInt();
			if(sex == 0) {
				woman[grade]++;
			}
			else if(sex == 1) {
				man[grade]++;
			}
		}
		for(int i = 0; i < woman.length; i++) {
				while(woman[i] > 0) { //같은 성별 같은 학년 일 경우 최대 2명씩 방을 부여
					room++;
					woman[i] = woman[i] - k;
				}
		}
		for(int i = 0; i < man.length; i++) {
			while(man[i] > 0) {
				room++;
				man[i] = man[i] - k;
			}
		}
		System.out.print(room);
		
		
		// TODO Auto-generated method stub

	}

}
