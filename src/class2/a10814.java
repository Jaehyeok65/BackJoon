package class2;


import java.util.*;



public class a10814 {
	
	
	public static class people implements Comparable<people> {
		
		int age;
		String name;
		
		
		public people(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public int compareTo(people p) {
			
			if(this.age > p.age ) {
				return 1;
			}
			else if(this.age < p.age) {
				return -1;
			}
			else {
				return 0;
			}
		}
		@Override
		public String toString() {
			return age + " " + name +"\n";
		}
		
		
		
		
	
		
	}
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0; //입력받은 순서를 저장할 카운트 변수
		List<people> list = new ArrayList<>();
		while(n --> 0) {
			
			int k = sc.nextInt();
			String s = sc.next();
			list.add(new people(k,s));
			
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		
	
		// TODO Auto-generated method stub

	}

}
