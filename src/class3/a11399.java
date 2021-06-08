package class3;


import java.util.*;


public class a11399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //돈을 뽑기 위해 줄 서 있는 사람 수 n < 1000
		List<Integer> list = new ArrayList<>();
		int time[] = new int[1001]; //n <= 1000
		for(int i = 0; i < n; i++) {
			
			list.add(sc.nextInt());
			Collections.sort(list);
			
		}
		time[0] = list.get(0);
		int sumtime = time[0];
		for(int i = 1; i < n; i++) {
			time[i] = time[i-1] + list.get(i);
			sumtime += time[i];
		}
		System.out.print(sumtime);
		
		
		// TODO Auto-generated method stub

	}

}
