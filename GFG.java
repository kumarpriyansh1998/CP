//package Recursion;
import java.util.*;

public class GFG {
	public static List<Integer> ans;
	
	
	public class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public  Node formTree(List<Integer> list) {
		if(list.size()==1) {
			Node temp = new Node(list.get(0));
			return temp;
		}
		
		int root = Collections.max(list);
		int ind = list.indexOf(root);
//		System.out.println(root+"  "+ind);
		
		Node head = new Node(root);
		if(ind>0) {

			List<Integer> temp1 = list.subList(0, ind);
			head.left = formTree(temp1);
			
		}
		if(ind<list.size()-1) {
			List<Integer> temp2 = list.subList(ind+1, list.size());
			head.right = formTree(temp2);
			
		}
		return head;
		
		
	}
	
	
	public static void FindDepth(Node head,int level){
		
		if(head == null) {
			return;
		}
		level+=1;
		FindDepth(head.left,level);
		ans.add(level-1);
		FindDepth(head.right,level);
		level-=1;
		return;
		
		
	}
	
//	public static void printGraph(Node head) {
//		
//		if(head ==null) return;
//		printGraph(head.left);
//		System.out.print(head.data);
//		printGraph(head.right);
//		return;
//		
//		
//	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			
			
			ans = new ArrayList<>();
			
			
			int n = sc.nextInt();
			List<Integer> arr = new ArrayList<>();
			while(n-->0) {
				arr.add(sc.nextInt());
			}
			
			GFG Tree = new GFG();
			Node temp1 = Tree.formTree(arr);
			if(temp1.left ==null && temp1.right==null) {
				System.out.println(0);
			}
			else{
				Tree.FindDepth(temp1,0);
				for(int ele:ans) {
					System.out.print(ele+" ");
				}
				System.out.println();
			}
			
			
			
			
			
			
			
		}
		
	
		
		
		
	}
	

		
		
	

}
