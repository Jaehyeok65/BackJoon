import java.util.*;


public class a2875 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//2명의 여학생과 1명의 남학생 여 = n 남 = m 대회에 참여하려는 학생 중 k명은 인턴십, 대회와 인턴십 중복 불가능
		
		int n = sc.nextInt(); //여학생의 수
		int m = sc.nextInt(); //남학생의 수
		int k = sc.nextInt(); //인턴십 참가해야하는 학생 수
		int teammale = 1; //남자 1명이 1팀 가능
		int teamwoman = 2; //여자 2명이 1팀 가능
		int team = 0;
		
		while(n >= 2 && m >= 1) { //여학생수가 다 떨어지거나 남학생 수가 다 떨어지면 루프 종료.
			while(k > 0) { //인턴십을 참여해야하는 학생 수
			if((n/teamwoman) > (m/teammale)) // 참가할 수 있는 여성 팀이 남성 팀보다 많을 경우
			{
				n = n - 1; 
				k--;
			}
			else if((n/teamwoman) < (m/teammale)) {
				m = m - 1;
				k--;
			}
			else { //남자팀수와 여자팀수가 같은 경우
				n = n-1;
				k--;
			}
			}
			n = n - 2;
			m = m - 1;
			team++;
		}
		System.out.print(team);
		// TODO Auto-generated method stub

	}

}
