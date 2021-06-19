package class2;


import java.util.*;


public class a1966 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		LinkedList<pair> que = new LinkedList<>();
		int T = sc.nextInt(); //테스트 케이스를 입력받음.
		
		while(T --> 0) {
			
			int n = sc.nextInt(); //n개를 입력받음
			int index = sc.nextInt(); //입력받은 위치에 있는 수가 몇번째로 출력되는지 확인
			
			for(int i = 0; i < n; i++) {
				int ans = sc.nextInt();
				que.add(new pair(i,ans));
			}
			int count = 0;
			while(!que.isEmpty()) {
			boolean flag = true; // 최대값인지 확인하기 위한 변수
			pair p = que.poll();
		
			for(int i = 0; i < que.size(); i++) {
				
				if(p.val < que.get(i).val) { //중요도가 더 큰 인덱스가 있다면
					
					que.offer(p); //뽑은 원소와 중요도가 높은 인덱스 앞에 있는 수들을
					for(int j = 0; j < i; j++) { //뒤로 넘겨버림
						que.offer(que.poll());
					}
					
					flag = false; //맨 앞에 있는 수가 최대값이 아니므로 false로 초기화한 후 루프 종료
					break;
				}
			}
			
			if(flag) {
				count++;
				if(p.index == index) {
					break;
				}
			}
			
			
			}
			sb.append(count+"\n");
		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}

class pair {
	
	int index;
	int val;
	
	public pair(int index, int val) {
		this.index = index;
		this.val = val;
	}
}
