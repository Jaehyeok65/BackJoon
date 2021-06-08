import java.util.*;


public class a2476 {
	
	
	public static int max(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		}
		else if(b > a && b > c) {
			return b;
		}
		else
			return c;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //참여하는 사람의 명수
		int max = 0; //출력할 최대액수
		int won;
		for(int i = 0; i < num; i++) {
			int dice1 = sc.nextInt();
			int dice2 = sc.nextInt();
			int dice3 = sc.nextInt();
			
			if(dice1 == dice2 && dice2 == dice3) { //3개의 눈이 모두 같은 경우
				won = 10000 + dice1*1000;
			}
			else if(dice1 == dice2) { //else if이므로 3개의 눈이 모두 같지 않다고 가정
				won = 1000 + dice1*100;
			}
			else if(dice2 == dice3) {
				won = 1000 + dice2*100;
			}
			else if(dice1 == dice3) {
				won = 1000 + dice1*100;
			}
			else {
				won = max(dice1,dice2,dice3)*100;
			}
			if(won > max) 
				max = won;
		}
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}
