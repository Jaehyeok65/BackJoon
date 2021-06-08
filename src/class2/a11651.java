package class2;


import java.util.*;

class dot implements Comparable<dot>{
	
	int x;
	int y;
	public dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(dot d) {
		if(this.y > d.y) {
			return 1;
		}
		else if(this.y < d.y) {
			return -1;
		}
		else {
			return this.x > d.x ? 1 : -1;
		}
	}
	@Override
	public String toString() {
		return x + " " + y;
	}
}

public class a11651 {
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		List<dot> list = new ArrayList<dot>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new dot(x,y));
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		// TODO Auto-generated method stub

	}

}
