package challenges30DaysOfCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {

	static void levelOrder(Day22Node root){
		ArrayList<Day22Node> fila = new ArrayList<Day22Node>();
	    int i, f;
	    fila.add(0, root); 
	    i = 0; f = 1;
	    while (f > i) {
	       root = fila.get(i++);
	       System.out.print(root.data + " ");
	       if (root.left != null) fila.add(f++, root.left);
	       if (root.right != null) fila.add(f++, root.right);
	    }

	}
	
	
	public static Day22Node insert(Day22Node root,int data){
		if(root==null){
			return new Day22Node(data);
		}
		else{
			Day22Node cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Day22Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		levelOrder(root);
		sc.close();
	}

}
