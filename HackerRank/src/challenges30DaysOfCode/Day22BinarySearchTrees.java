package challenges30DaysOfCode;

import java.util.Scanner;

public class Day22BinarySearchTrees {

	public static int getHeight(Day22Node root){
		return getHeight(root, 0, 0);
	}
	
	public static int getHeight(Day22Node root, int heightTree, int max){
		if(root == null){
			return heightTree;
		} else if(root.left != null || root.right != null){
			heightTree++;			
		}
		
		int height = getHeight(root.left, heightTree, max);
		if(height>max) max = height;
		
		height = getHeight(root.right, heightTree, max);
		if(height>max) max = height;
		
		return max;
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
		int height=getHeight(root);
		System.out.println(height);
		sc.close();
	}

}
