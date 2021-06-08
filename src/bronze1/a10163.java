package bronze1;


import java.util.*;


public class a10163 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sq [][] = new int[101][101]; //1차원 배열은 가로 2차원 배열은 세로
		
		for(int i = 0; i < sq.length; i++) {
			for(int j = 0; j < sq.length; j++) {
				sq[i][j] = 0;
			}
		}
		
		int n = sc.nextInt();
		
		for(int k = 1; k <= n; k++) {
			int a = sc.nextInt(); 
			int b = sc.nextInt(); //왼쪽 아래 좌표
			int width = sc.nextInt(); //너비 (가로)
			int high = sc.nextInt(); //높이 (세로)
			
			for(int i = a; i < width + a; i++) {
				for(int j = b; j < high + b; j++) {
					sq[i][j] = k;
				}
			}
		}
		
		for(int t = 1; t <= n; t++) {
			int cnt = 0;
			for(int i = 0; i < sq.length; i++) {
				for(int j = 0; j < sq.length; j++) {
					if(sq[i][j] == t) {
						cnt++;
					}

					}
				}
			System.out.println(cnt);
		}
			}	
			
			
		}
		
		// TODO Auto-generated method stub

	


