package class2;


import java.util.*;


public class a11650 {
	
	public static class dot implements Comparable<dot> {
		
		int x1;
		int y1;
		
		public dot(int x1, int y1) {
			this.x1 = x1;
			this.y1 = y1;
		}
		
		@Override
		public int compareTo(dot d) {
			// TODO Auto-generated method stub
			if(this.x1 > d.x1) 
				return 1;
			else if(this.x1 < d.x1)
				return -1;
			else
				return this.y1 > d.y1 ? 1: -1;
		}
		@Override
		public String toString() {
			return x1 +" " +y1;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		List<dot> list = new ArrayList<dot>();
		
		while(n --> 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			list.add(new dot(x1,y1));
		
			
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+"\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
