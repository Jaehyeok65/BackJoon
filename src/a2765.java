import java.util.*;


public class a2765 {

	public static void main(String[] args) {
		
		//바퀴와 지름과 회전 수를 통해 속도를 유추 가능. 또한 걸린 시간을 통해 평균 속도 유추 가능.
		
		Scanner sc = new Scanner(System.in);
		
		int rotate1 = 1000;
		double inch1 = 26;
		double distance1 = 1.29;
		
		int rotate2 = 873234;
		double inch2 = 27.25;
		double distance2 = 1179.86;
		
		double gob = rotate1 * inch1;
		double dab = distance1/gob;
		
		double gob2 = rotate2 * inch2;
		double dab2 = distance2/gob2;
		
		System.out.print(dab + " "+ dab2);
		
		
		
		// TODO Auto-generated method stub

	}

}
