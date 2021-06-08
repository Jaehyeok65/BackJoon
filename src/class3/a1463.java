package class3;


import java.util.*;


public class a1463 {//동적 프로그래밍 문제 (사실상 노가다) -> 값을 저장해 재사용하는 것이 핵심.
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		
		while(n != 1) { //n == 1이 될 경우에 종료
			if(n == 2) {
				n = n / 2;
				count++;
			}
			else { // n이 2가 아니라면 3으로 나눠서 값을 최대한 작게 만듬.
				if(n % 3 == 0) { //n이 3으로 나뉘어 떨어진다면
					n = n / 3;
					count++;
				}
				else {
					n = n - 1;
					count++;
				}
			}
			
		}
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
