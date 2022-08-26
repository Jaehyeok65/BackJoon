package a20220826;


import java.util.*;
import java.io.*;


public class a3190 { //즉 사과를 먹으면 몸길이가 1늘어나고, 먹지않으면 꼬리를 1줄이므로 몸길이가 그대로임
	
	static int N;
	static int map[][]; //클래스 사용을 위해 static 타입으로 선언
	static boolean visited[][]; //자기 자신의 몸위치를 저장하기 위한 변수
	static int dx[] = {0,1,-0,-1}; //오른쪽 , 아래쪽, 왼쪽, 위쪽
	static int dy[] = {1,0,-1,-0};
	static int d = 0; //방향을 결정하는 변수
	static int px = 0;
	static int py = 0;
	static int count = 0; //매 초 1씩 증가하는 변수
	static int mom = 1;
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N]; //크기 N의 맵 생성
		visited = new boolean[N][N];
		HashMap<Integer, String> hash = new HashMap<>();
		Queue<Integer> que = new LinkedList<>();
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < k; i++) { //사과의 위치 초기화
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); 
			map[a-1][b-1] = 1; //배열은 0부터 시작하므로
		}
		
		int l = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < l; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			hash.put(x, s);
		}
		
		que.add(0);
		
		while(true) {
			
			int nx = px + dx[d];
			int ny = py + dy[d];  //nx, ny는 오른쪽 방향으로 이동
			count += 1; //매초 이동하므로 count 1 증가
			
			if(nx < 0 || ny < 0 || nx > N-1 || ny > N -1) { //벽에 부딪히면 종료
				break;
			}
			
			if(que.contains(N*ny + nx)) { //몸통에 부딪히면 종료
				break;
			}
			if(map[nx][ny] == 1) { //다음 위치에 사과가 있으면
				map[nx][ny] = 0; //사과를 먹었으므로 없애줌
				que.add(N * ny + nx); 
			}
			else {
				que.add(N * ny + nx);
				que.poll();
			}
			
			if(hash.containsKey(count)) {
				String data = hash.get(count);
				if(data.equals("D")) { //D라면 오른쪽으로 90도 꺾음 == 
					d += 1;
					if(d == 4) {
						d = 0;
					}
				}
				else {
					d -= 1;
					if(d == -1) {
						d = 3;
					}
				}
			}
			px = nx;
			py = ny;
		}
		
		System.out.print(count);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
