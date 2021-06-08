

import java.util.*;


public class a2511 {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		int ascore[] = new int[10]; //a의 승점
		int bscore[] = new int[10]; //b의 승점
		char result[] = new char[10];
		int Ascore = 0;
		int Bscore = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > b[i]) {
				ascore[i] = 3;
				result[i] = 'A';
			}
			else if(b[i] > a[i]) {
				bscore[i] = 3;
				result[i] = 'B';
			}
			else { // a[i] == b[i]
				ascore[i] = 1;
				bscore[i] = 1;
				result[i] = 'D';
			}
			Ascore = Ascore + ascore[i];
			Bscore = Bscore + bscore[i];
		}
		
		System.out.println(Ascore+" "+Bscore);
		if(Ascore > Bscore)
		{
			System.out.print('A');
		}
		else if(Bscore > Ascore) {
			System.out.print('B');
		}
		else { //Ascore과 Bscore이 같은 경우
			boolean flag = true;
			for(int i = result.length-1; i >=0; i--) {
				if(result[i] != 'D') {
					System.out.print(result[i]);
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print('D');
			}
		}

		
		
		// TODO Auto-generated method stub

	}

}
