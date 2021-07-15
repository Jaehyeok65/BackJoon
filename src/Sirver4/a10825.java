package Sirver4;

import java.util.*;

class Student {
	
	String name;
	int monhak;
	int english;
	int math;
	
	public Student(String name, int monhak, int english, int math) {
		this.name = name;
		this.monhak = monhak;
		this.english = english;
		this.math = math;
	}
	
	public String toString() {
		return name;
	}
	
}


public class a10825 {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Student> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int monhak = sc.nextInt();
			int english = sc.nextInt();
			int math = sc.nextInt();
			list.add(new Student(name,monhak,english,math));
		}
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				int s1monhak = s1.monhak;
				int s2monhak = s2.monhak;
				int s1english = s1.english;
				int s2english = s2.english;
				int s1math = s1.math;
				int s2math = s2.math;
				if(s1monhak == s2monhak) {
					if(s1english == s2english) {
						if(s1math == s2math) {
							return s1.name.compareTo(s2.name);
						}
						return Integer.compare(s2math, s1math);
					}
					return Integer.compare(s1english,s2english);
				}
				return Integer.compare(s2monhak, s1monhak);
			}
		});
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		// TODO Auto-generated method stub

	}


}
