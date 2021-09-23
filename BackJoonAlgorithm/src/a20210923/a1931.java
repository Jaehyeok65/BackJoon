package a20210923;


import java.util.*;


class Point implements Comparable<Point> {
	int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point p) {
		if(this.y > p.y) {
			return 1;
		}
		else if(this.y == p.y) {
			if(this.x > p.x) {
				return 1;
			}
		}
		return -1;
	}
}
public class a1931 {
	
	public static void get(ArrayList<Point> list) {
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Point> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(new Point(a,b));
		}
		
		Collections.sort(list);
		
		int end = 0;
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			Point p = list.get(i);
			if(p.x >= end) {
				end = p.y;
				count++;
			}
		}
		
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
