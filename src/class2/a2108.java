package class2;


import java.util.*;
import java.io.*;


public class a2108 {
	
	
	static int mean(int arr[]) {
		double result = 0;
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		result = Math.round(sum/arr.length);
		
		return (int)result;
		
	}
	
	static int media(int arr[]) {
		
		int index = arr.length/2;
		
		return arr[index];
	}
	
	static int mode(int arr[]) {
		
		int count[] = new int[8001]; //나오는 빈도를 나타낼 배열
		ArrayList<Integer> list = new ArrayList<>(); //최빈값이 복수 일 경우 복수인 최빈값들을 저장할 배열
		boolean flag = false; //최빈값이 중복인지 아닌지를 판단할 변수
		int max = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) { //양수이면
				count[arr[i]]++;
			}
			else if(arr[i] < 0) { //음수이면 4000을 더해서 저장 예) -2라면 4002에 저장. -4000이라면 8000에 저장.
				count[Math.abs(arr[i])+4000]++;
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];
				if(i > 4000) { //절대값이 4000이므로 4000이후는 음수
					index = (i-4000)*-1;
				}
				else {
					index = i;
				}
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			if(max == count[i]) { //최빈값이 여러개일 경우
				flag = true;
				if(i > 4000) {
					list.add((i-4000)*-1);
				}
				else {
					list.add(i);
				}
			}
		}
		if(!list.isEmpty()) {
			Collections.sort(list);
		}
	
		if(!flag) { //최빈값이 여러개가 아닌 경우
			return index; //최빈값을 리턴
		}
		else { //최빈값이 여러개인 경우
			if(list.size() == 1) { //리스트가 하나밖에 없으면
				return list.get(0);
			}
			else {
			return list.get(1); //두번째로 작은 값을 리턴
			}
		}
		
	}
	
	static int range(int arr[]) {
		
		int result = arr[arr.length-1] - arr[0];
		
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); //단 N은 홀 수
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		sb.append(mean(arr)+"\n");
		sb.append(media(arr)+"\n");
		sb.append(mode(arr)+"\n");
		sb.append(range(arr)+"\n"); //range를 수행할 때 이미 정렬이 되어있음.
		
		System.out.print(sb.toString());
		
		
		
		// TODO Auto-generated method stub

	}

}
