package a20220904;

import java.io.*;



public class a5639 {


	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BinaryTree tree = new BinaryTree(Integer.parseInt(br.readLine()));
		String s;
		while(true) {
			s = br.readLine();
			if(s == null || s.equals("")) { //종료조건
				break;
			}
			tree.insert(tree.root,Integer.parseInt(s));
		}
		
		tree.preorder(tree.root);
		
		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}


class BinaryTree {
	Node root; //루트 노드 선언
	
	public BinaryTree(int item) {
		root = new Node(item,null,null);
	}
	
	public Node insert(Node n, int item) { 
		if(n == null) { //n이 null이라면 루트노드가 null이라는 뜻이므로 루트노드에 item을 삽입
			return new Node(item);
		}
		 //null이 아니라면 item과 노드의 키를 비교하여 이진탐색트리의 맞게 서브트리 갱신 
			if(item < n.key) { //item이 더 작다면 왼쪽 서브트리로 갱신
				if(n.left == null) {
					n.setLeft(new Node(item));
				}
				else {
				n.setLeft(insert(n.getLeft(),item));
				}
			}
			else if(item > n.key) {
				if(n.right == null) {
					n.setRight(new Node(item));
				}
				else {
				n.setRight(insert(n.getRight(),item));
				}
			}
			return n;
		
	}
	
	public void preorder(Node root) {
		if(root == null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.key);
	}
}



class Node {
	int key;
	Node left;
	Node right;
	
	
	
	public Node(int newkey, Node newleft, Node newright) {
		key = newkey;
		left = newleft;
		right = newright;
	}
	
	public Node(int newkey) {
		key = newkey;
	}
	
	
	public void setLeft(Node newleft) {
		left = newleft;
	}
	
	public void setRight(Node newright) {
		right = newright;
	}
	
	public void setKey(int newkey) {
		key = newkey;
	}
	
	
	public int getKey() {
		return key;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
}



