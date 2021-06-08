import java.util.*;


public class a2884 {
	
	public static void early(int [] our) {
		our[1] = our[1] - 45;
		if(our[1] < 0) {
			our[1] = our[1] + 60;
			our[0]--;
			if(our[0] < 0)
				our[0] = 23;
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int our [] = new int[2];
		our[0] = sc.nextInt(); //시간
		our[1] = sc.nextInt(); //분
		early(our);
		for(int i = 0; i < our.length; i++) {
			System.out.print(our[i] + " ");
		}
		
		// TODO Auto-generated method stub

	}

}
