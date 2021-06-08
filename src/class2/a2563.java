package class2;


import java.util.*;


public class a2563 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0; //넓이를 저장할 변수
		boolean sqa[][] = new boolean[100][100]; //흰 도화지 선언
		
		int n = sc.nextInt();
		
		while(n --> 0) {
			int width = sc.nextInt(); //가로
			int height = sc.nextInt(); //세로
			
			for(int i = width; i < width + 10; i++) {
				for(int j = height; j < height + 10; j++) {
					sqa[i][j] = true;
				}
				}
		}
		
		for(int i = 0; i < sqa.length; i++) {
			for(int j = 0; j < sqa[0].length; j++) {
				if(sqa[i][j] == true) {
					count++;
				}
			}
		}
		System.out.print(count);
		
		
		
		// TODO Auto-generated method stub

	}

}
