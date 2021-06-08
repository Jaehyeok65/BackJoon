package class2;


import java.util.*;


public class a11723 {
	
	static ArrayList<Integer> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static void add(int x) {
		if(list.indexOf(x) == -1) { //리스트에 매개변수 x가 없을 경우 x를 추가 (있을경우 추가하지 않음)
			list.add(x);
		}
	}
	
	static void remove(int x) {
		if(list.indexOf(x) != -1) {
		list.remove(list.indexOf(x));
		}
	}
	
	static void check(int x) {
		if(list.indexOf(x) == -1) {
			sb.append(0+"\n");
		}
		else {
			sb.append(1+"\n");
		}
	}
	
	static void toggle(int x) {
		if(list.indexOf(x) == -1) {
			list.add(x);
		}
		else {
			list.remove(list.indexOf(x));
		}
	}
	
	static void all() {
		list.clear();
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
	}
	
	static void empty() {
		list.clear();
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n --> 0) {
			String s = sc.next();
			if(s.equals("add")) {
				add(sc.nextInt());
			}
			else if(s.equals("remove")) {
				remove(sc.nextInt());
			}
			else if(s.equals("check")) {
				check(sc.nextInt());
			}
			else if(s.equals("toggle")) {
				toggle(sc.nextInt());
			}
			else if(s.equals("all")) {
				all();
			}
			else if(s.equals("empty")) {
				empty();
			}
		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}
