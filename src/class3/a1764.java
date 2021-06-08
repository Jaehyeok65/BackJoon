package class3;


import java.util.*;


public class a1764 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Set<String> set = new HashSet<>(); //해쉬는 중복값을 차단해주므로 중복된 값은 따로 list에 저장.
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			set.add(sc.next());
		}
		for(int i = 0; i < M; i++) {
			String ans = sc.next();
			if(!set.add(ans)) {
				list.add(ans);
			}
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+"\n");
		}
		System.out.println(list.size());
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
