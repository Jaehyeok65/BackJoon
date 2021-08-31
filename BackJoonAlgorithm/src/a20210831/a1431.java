package a20210831;


import java.util.*;




public class a1431 {
	
	static int sum(String s) {
		int size = s.length();
		int sum = 0;
		
		for(int i = 0; i < size; i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') { //숫자라면
				sum += s.charAt(i) - '0';
			}
		}
		
		return sum;
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		
		Collections.sort(list, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() < s2.length()) { //길이가 작은순으로 정렬
					return -1;
				}
				else if(s1.length() > s2.length()) {
					return 1;
				}
				else {  //길이가 같다면
					int length1 = sum(s1);
					int length2 = sum(s2);
					if(length1 == length2) {
						return s1.compareTo(s2);
					}
					else {
						return Integer.compare(sum(s1), sum(s2));
					}
				}
			}
		});
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
		// TODO Auto-generated method stub

	}

}
