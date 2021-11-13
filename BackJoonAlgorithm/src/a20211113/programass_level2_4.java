package a20211113;

import java.util.*;

public class programass_level2_4 {
	
	
	public static int[] solution(int progress[], int speed[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int day = 1;
		int j = 0;
		while(j < progress.length) {
			while(progress[j] + (speed[j] * day) < 100) {
				day++; //day는 5, 10
			}
			int count = 0;
			while(progress[j] + (speed[j] * day) >= 100) {
				j++;
				count++;
				if(j == progress.length) {
					break;
				}
			}
			list.add(count); //첫 번재 : 리스트에 1 추가	
		}
		int answer[] = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		int[] progress = {93,30,55};
		int[] speed = {1,30,5};
		int result[] = solution(progress,speed);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		// TODO Auto-generated method stub

	}

}
