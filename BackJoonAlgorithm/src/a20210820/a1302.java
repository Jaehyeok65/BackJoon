package a20210820;


import java.util.*;


public class a1302 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<String,Integer> hash = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		int max = 0;
		String best = "";
		for(int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(!hash.containsKey(list.get(i))) { // 처음 나오는 책이면 해쉬에 푸쉬
				hash.put(list.get(i), 1);
			}
			else {
				hash.replace(list.get(i), hash.get(list.get(i)) + 1); // 이미 나온 책이라면 개수를 셈
			}
		}
		
		for(String key : hash.keySet()) {
			
			int value  = hash.get(key);
			
			if(value > max) {
				max = value;
				best = key;
			}
			
		}
		
		for(String key : hash.keySet()) {
			
			int value = hash.get(key);
			
			if(value == max && key != best) {
				list1.add(key);
			}
		}
		
		if(list1.isEmpty()) {
			System.out.print(best);
		}
		else {
			list1.add(best);
			list1.sort(null);
			System.out.print(list1.get(0));
		}
		// TODO Auto-generated method stub

	}

}
