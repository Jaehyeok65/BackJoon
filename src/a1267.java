import java.util.*;


// 1 .영식 요금제 = 30초마다 10원 청구
// 2 .민식 요금제 = 60초마다 15원 청구
public class a1267 {
	
	public static int y(int time) {
		int money = 0;
		while(time >= 0) {
			time = time - 30;
			money = money + 10;
		}
		return money;
	}
	
	public static int m(int time) {
		int money = 0;
		while(time >= 0) {
			time = time - 60;
			money = money + 15;
		}
		return money;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //통화의 개수 n < 20
		int ymoney = 0; //영식 요금제
		int mmoney = 0; //민식 요금제
		
		for(int i = 0; i < n; i++)
		{
			int t = sc.nextInt(); //통화의 시간 t < 10000
			ymoney += y(t);
			mmoney += m(t);
		}
		if(ymoney == mmoney) {
			System.out.print("Y " + "M "+ ymoney);
		}
		else if(ymoney < mmoney) {
			System.out.print("Y " + ymoney);
		}
		else if(mmoney < ymoney) {
			System.out.print("M " + mmoney);
		}
	
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
