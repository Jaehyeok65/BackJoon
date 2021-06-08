import java.util.*;


public class a10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			
			int h = sc.nextInt(); //층의 높이
			int w = sc.nextInt(); //각층의 방 개수
			int n = sc.nextInt();
			int x = 1;
			int y = 0;
			while(n > 0) {
				y++;
				if(y > h) {
					x++;
					y = 1;
				}
				n--;
			}
			
			System.out.println(y*100+x);
			
			
		}
		// TODO Auto-generated method stub

	}

}
