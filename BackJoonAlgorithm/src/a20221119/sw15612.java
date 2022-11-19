package a20221119;

import java.io.*;




public class sw15612 {
	
	static int T;
	
	public static String solve(char [][] map) {
		if(!checklook(map)) {
			return "no";
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(map[i][j] == 'O') {
					if(!checkrow(i,j,map) || !checkcol(i,j,map)) {
						return "no";
					}
				}
			}
		}
		return "yes";
	}
	
	public static boolean checkrow(int y, int x, char [][] map) { //가로 체크 y는 세로 좌표, x는 가로 좌표
		
		for(int i = 0; i < 8; i++) {
			if(i != x && map[y][i] == 'O') { //가로 좌표에 본인 말고 룩이 또 있다면 return false
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkcol(int y, int x, char [][] map) { //세로 체크
		for(int i = 0; i < 8; i++) {
			if(i != y && map[i][x] == 'O') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checklook(char [][] map) {
		int count = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(map[i][j] == 'O') {
					count++;
				}
			}
		}
		if(count == 8) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= T; t++) {
			
			char map[][] = new char[8][8]; //체스판 선언
			for(int i = 0; i < 8; i++) {
				String s = br.readLine();
				for(int j = 0; j < 8; j++) {
					map[i][j] = s.charAt(j);
				}
			} //입력 완료
			
			String result = solve(map);
			sb.append("#"+t+" "+result+"\n");
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
