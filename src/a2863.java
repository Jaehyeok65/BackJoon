
import java.util.*;


public class a2863 {
	
	public static void rotate(double[] a, int[] count) {
		double temp1 = a[0];
		double temp2 = a[1];
		double temp3 = a[2];
		double temp4 = a[3];
		a[0] = temp3;
		a[1] = temp1;
		a[2] = temp4;
		a[3] = temp2;
		count[0]++;
	}
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double graph[] = new double[4];
		int count[] = new int[1];
		int maxcount = 0;
		for(int i = 0; i < graph.length; i++) {
			graph[i] = sc.nextInt(); // 0이 a, 1이 b 2가 c 3이 d
		}
		double result = 0;
		double maxresult = graph[0]/graph[2] + graph[1]/graph[3];
		for(int i = 0; i < graph.length; i++) {				
				rotate(graph,count);
				result = graph[0]/graph[2] + graph[1]/graph[3];
				if(result > maxresult) {
					maxresult = result; //최대값을 저장하기 위한 변수 == 루프를 진행하는 도중 결과값이 더 크면 최대값 변수에 값을 저장.
					maxcount = count[0];
				}
			}
		System.out.print(maxcount);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
