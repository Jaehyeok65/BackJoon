import java.util.*;


public class a3009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dot1[] = new int[2];
		int dot2[] = new int[2];
		int dot3[] = new int[2];
		int dot4[] = new int[2];
		for(int i = 0; i < dot1.length; i++) {
			dot1[i] = sc.nextInt(); //0 = x좌표 1 = y좌표
		}
		for(int i = 0; i < dot2.length; i++) {
			dot2[i] = sc.nextInt();
		}
		for(int i = 0; i < dot3.length; i++) {
			dot3[i] = sc.nextInt();
		}
		//축이 x축에 평행하는 직사각형
		if(dot1[0] == dot2[0]) {
			dot4[0] = dot3[0];
		}
		else if(dot2[0] == dot3[0]) {
			dot4[0] = dot1[0];
		}
		else if(dot1[0] == dot3[0]) {
			dot4[0] = dot2[0];
		}
		if(dot1[1] == dot2[1]) {
			dot4[1] = dot3[1];
		}
		else if(dot1[1] == dot3[1]) {
			dot4[1] = dot2[1];
		}
		else if(dot2[1] == dot3[1]) {
			dot4[1] = dot1[1];
		}
		System.out.print(dot4[0]+" "+dot4[1]);
 		// TODO Auto-generated method stub

	}

}
