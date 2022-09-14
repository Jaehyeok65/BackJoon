package a20220914;


import java.util.*;


public class a1043 {
	static int N; //사람의 수
	static int M; //파티의 수
	static ArrayList<Integer> list[];
	static boolean visited[];
	static int party[][];
	
	
	public static void dfs(int num) {
		
		for(int next : list[num]) {
			if(!visited[next]) {
				visited[next] = true;
				dfs(next);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //사람의 수를 입력받음 
		M = sc.nextInt(); //파티의 수를 입력받음
		
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>(); //리스트 초기화
		}
		
		
		
		int t = sc.nextInt(); //진실을 아는 사람의 수를 입력받음
		
		if(t != 0) { //진실을 아는 사람의 수가 0이 아니면 진실의 수를 아는 사람의 배열을 선언하여 입력받음
			for(int i = 0; i < t; i++) {
				int tr = sc.nextInt();
				visited[tr] = true; //진실을 아는 사람이므로 방문처리해줌
			}
		}
		
		party = new int[M][];
		
		for(int i = 0; i < M; i++) {
			int parpe = sc.nextInt(); //파티에 오는 사람의 수
			party[i] = new int[parpe];
			for(int j = 0; j < parpe; j++) { //파티에 오는 사람들을 2차원 배열에 담듬
				party[i][j] = sc.nextInt();
			}
			for(int j = 0; j < parpe; j++) {
				for(int k = j +1; k < parpe; k++) {
					if(!list[party[i][j]].contains(party[i][k])) {
						list[party[i][j]].add(party[i][k]);
						list[party[i][k]].add(party[i][j]);
					}
				}
			}
		}
		
		for(int i = 1; i <= N; i++) {
			if(visited[i]) {
				dfs(i);
			}
		}
		int cnt = 0;
		for(int[] p: party) {
			boolean check = true;
			for(int i=0;i<p.length;i++) {
				if(visited[p[i]]) {
					//진실을 아는사람이 있으면 break
					check = false;
					break;
				}
			}
			if(check) cnt++; //진실이 아는 사람이 존재하지 않는다면 cnt 증가해준다.
		}
		System.out.print(cnt);
		
		
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}
