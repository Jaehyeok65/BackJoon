package a20210913;

import java.util.*;


public class a11758 {   //기하학 입문 문제  == 신발끈 공식으로 풀기
	
	public static int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		int result1 = x1 * y2 + x2 * y3 + x3 * y1;  //좌표를 나열한 후 오른쪽 아래 대각선으로 곱해줌
		int result2 = x2 * y1 + x3 * y2 + x1 * y3;  //좌표를 나열한 후 왼쪽 아래 대각선으로 곱해줌
		int result = result1 - result2;             //두 값을 뺌
		
		if(result > 0) {         //두 값을 뺀 결과가 0보다 크다면 반시계방향
			return 1;
		}
		else if(result < 0) {    //두 값을 뺀 결과가 0보다 작다면 시계방향
			return -1;
		}
		else {                   //둘 다 아니라면 (같다면) 평행
			return 0;
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();    //좌표를 입력받음
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.print(ccw(x1,y1,x2,y2,x3,y3));  //메소드 수행 후 출력
		
		// TODO Auto-generated method stub

	}

}
