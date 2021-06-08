import java.util.*;



public class a2798 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int [n];
		int result = 0; //3 수의 합을 저장할 변수.
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i+1; j < n; j++) {
				
				for(int k = j+1; k < n; k++) {
					
					int temp = arr[i] + arr[j] + arr[k];
					
					if(temp == m) {
						result = temp;
						break;
					}
					
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		
		System.out.print(result);
		// TODO Auto-generated method stub

	}

}
