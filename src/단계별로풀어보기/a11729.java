package 단계별로풀어보기;


import java.util.*;


public class a11729 {
	
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	
	static void hanoi(int n, int start, int mid, int target) {//원판의 개수와 중간에 옮겨둘 위치, 목표위치를 매개변수로 받음
		count++;
		
		if(n == 1) {
			sb.append(start+" "+target+"\n");
			return;
		}
		hanoi(n-1, start, target, mid); //n-1개의 원판을 중간지점으로 옮겨둠
		
		sb.append(start + " " + target+"\n"); //마지막 원판을 타겟지점으로 옮김
		
		hanoi(n-1,mid,start,target);
		
		
		
	} 
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //장대에 쌓인 원판의 개수
		hanoi(n,1,2,3);
		System.out.println(count);
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
