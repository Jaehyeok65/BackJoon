package a20210916;

import java.util.*;



public class a12015 {
	static int arr[];
	static int N;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static int binary(int value) { //이분 탐색
		
		int start = 0;
		int end = list.size()-1;
		
		while(start < end) {
			int mid = (start + end) /2;
			if(list.get(mid) >= value) { //가운데 값이 찾으려는 값보다 큰 경우
				end = mid;  //찾으려는 값은 가운데보다 왼쪽에 있으므로 end에 mid값 대입
			}
			else {                       //가운데 값이 찾으려는 값보다 작은 경우
				start = mid + 1;         //찾으려는 값은 가운데보다 오른쪽에 있으므로 start에 mid + 1 대입.
			}
		}
		
		return end; //부합하는 인덱스는 end에 있으므로 end를 리턴.
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		list.add(0);
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > list.get(list.size() - 1)) {  //입력된 값이 리스트에 있는 마지막 값보다 크다면
				list.add(arr[i]);   //리스트에 추가 해줌
			}
			else {  //입력된 값이 리스트의 마지막 값보다 작다면 이분탐색을 통해 적당한 자리를 찾아야함
				list.set(binary(arr[i]), arr[i]);
			}
		}
		
		System.out.print(list.size() - 1);
	
		
		
		
		// TODO Auto-generated method stub

	}

}
