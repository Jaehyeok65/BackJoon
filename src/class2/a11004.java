package class2;


import java.util.*;


public class a11004 {
	
	static void swap(int arr[],int left, int right) {
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}
	
	static int partition(int arr[],int left,int right) { //중간값을 기준으로 왼쪽과 오른쪽을 정렬
		
		int pivot = arr[(left + right)/2]; //맨 마지막 인덱스를 피벗으로 설정
		
		while(left <= right) { //left가 right보다 커질 때 반복을 종료 (정렬이 다 되었다는 뜻)
			while(arr[left] < pivot) 
				left++;
			while(arr[right] > pivot)
				right--;
			
			if(left <= right) {
				swap(arr,left,right);
				left++;
				right--;
			}
		}
		return left; //정렬 후 중간값의 인덱스를 리턴
	}
	
	static int quicksearch(int arr[], int left, int right, int k) {
		
		if(left <= right) {
			int pivotindex = partition(arr,left,right); //중간값으로 파티션 pivotindex = 중간위치의 인덱스
			
			
			if(k == pivotindex) { //만약 찾는 인덱스인 k와 pivot 인덱스가 같다면 값을 출력하고 종료
				return arr[pivotindex];
			}
			else if(pivotindex > k) { //pivot이 찾는 인덱스보다 크다면 왼쪽에서 찾음
				return quicksearch(arr,left,pivotindex-1,k);
			}
			else { //pivot이 찾는 인덱스보다 작다면 오른쪽에서 재귀를 통해 찾음
				return quicksearch(arr,pivotindex,right,k);
			}
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(quicksearch(arr,0,arr.length-1,k-1));
		// TODO Auto-generated method stub

	}

}
