
import java.util.*;



public class a2506 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int que = sc.nextInt(); //문제의 개수
		int score = 0; //점수
		int count = 0; //가산점
		int dab[] = new int[que];
		for(int i = 0; i < que; i++) {
			dab[i] = sc.nextInt();
			if(i == 0) {
				if(dab[i] == 1)
					score = score + 1;
			}
			else { //i가 0이 아닐 때 (i가 index-1을 참조하는 오류를 방지하기 위함)
				if(dab[i] > 0 && dab[i] == dab[i-1]) {
					score = (score + 1) + ++count; 
				}
				else if(dab[i] == 0) {
					count = 0;
				}
				else if(dab[i] > 0 && dab[i] != dab[i-1]) {
					score = (score + 1);
				}
			}
		}
		System.out.print(score);
		
		
		
		// TODO Auto-generated method stub

	}

}
