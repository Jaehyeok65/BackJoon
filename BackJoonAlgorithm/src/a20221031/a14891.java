package a20221031;


import java.util.*;
import java.io.*;
	

public class a14891 {
	
	static int k; //회전시킬 횟수
	static int num; //회전시킬 톱니바퀴의 번호
	static int navi[]; // 회전시킬 톱니바퀴의 방향 == 1이라면 시계방향, -1이라면 반시계 방향
	static int n;
	static int gear[][] = new int[4][8];
	//0~7까지 임의의 방향을 부여해야함 0이 12시, 1이 1~2시, 2가 3시, 3이 4~5시, 4가 6시, 5가 7~8시, 6이 9시, 7이 10~11시임
	
	
	public static void rotatecheck(int num) { //회전시킬 톱니바퀴의 번호를 입력받음
		
		for(int i = num; i >= 1; i--) { //왼쪽 방향 체크
			if(gear[i][6] != gear[i-1][2]) { //마주보는 극이 다르다면
				navi[i-1] = -navi[i];
			}
			else {
				break; //회전하지 않으면 옆에 톱니바퀴도 회전할 일이 없기 때문에
			}
		}
		
		for(int i = num; i < 3; i++) { //오른쪽 방향 체크
			if(gear[i][2] != gear[i+1][6]) {
				navi[i+1] = -navi[i];
			}
			else {
				break;
			}
		}
	}
	
	public static void rotate() {
		int temp = 0;
		
		for(int i=0; i<4; i++) { //모든 톱니에 대해서
			//시계방향 회전
			if(navi[i] == 1) {
				temp = gear[i][7];
				for(int j=7; j>0; j--) {
					gear[i][j] = gear[i][j-1];
				}
				gear[i][0] = temp;
			}
			//반시계방향회전
			if(navi[i] == -1) {
				temp = gear[i][0];
				for(int j=0; j<7; j++) {
					gear[i][j] = gear[i][j+1];
				}
				gear[i][7] = temp;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=0; i<4 ;i++) {
			String s = br.readLine();
			for(int j=0; j<8; j++) {
				gear[i][j] = s.charAt(j) - '0';
			}
		}
		
		
		k = Integer.parseInt(br.readLine());
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken()) - 1;
			n = Integer.parseInt(st.nextToken());
			
			navi = new int[4]; //4가지 톱니바퀴의 방향 정보를 얻음
			navi[num] = n; //선택된 기어의 방향 정보를 얻음
			rotatecheck(num); //초반 톱니바퀴 번호를 매개변수로하여 회전방향 정보를 입력받음
			rotate();
		}
		
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			if(gear[i][0] == 1) {
				sum += Math.pow(2, i);
			}
		}
		System.out.print(sum);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
