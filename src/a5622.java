import java.util.*;


public class a5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char c[] = s.toCharArray();
		int sumtime = 0; //총 걸리는 시간
		for(int i = 0; i < c.length; i++) {
			int dial = 1; //숫자
			int time = 2; //시간
			int j = 'A';
			while(j <= c[i]) { //다음 숫자로 이동  7과 9를 제외한 숫자는 문자가 3개씩 배분. (대문자 아스키 코드 활용)
				if(dial == 6 || dial == 8) { //7과 9는 문자가 4개.
					j += 4;
					dial++;
					time++;
					continue;
				}
				j += 3;
				dial++; //다음 숫자로 이동
				time++; //시간추가
			}
			sumtime = sumtime + time; 
		}
		System.out.print(sumtime);
		
		// TODO Auto-generated method stub

	}

}
