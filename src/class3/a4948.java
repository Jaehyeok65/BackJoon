package class3;



import java.util.*;


public class a4948 {
	
	
	static int getsosu(int n) {
		int last = n*2;
		boolean array[] = new boolean[last+1];
		array[0] = array[1] = true;
		int count = 0;
		int result = 0;
			for(int i = 2; i <= Math.sqrt(last); i++) {
				
				for(int j = i*i; j <= last; j = j + i) {
					array[j] = true;
				}
			}
		
		for(int i = n+1; i <= last; i++) {
			if(array[i] == false) {
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			sb.append(getsosu(n)+"\n");
			
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
