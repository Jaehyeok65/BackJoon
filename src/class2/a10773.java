package class2;


import java.util.*;


public class a10773 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int result = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		while(k --> 0) {
			int n = sc.nextInt();
			if(n != 0) {
				list.add(n);
			}
			else {
				list.remove(list.size()-1); //크기 -1 == 마지막 인덱스
			}
		}
		if(list.isEmpty()) {
			result = 0;
		}
		else {
			for(int i = 0; i < list.size(); i++) {
				result += list.get(i);
			}
		}
		System.out.print(result);
		// TODO Auto-generated method stub

	}

}
