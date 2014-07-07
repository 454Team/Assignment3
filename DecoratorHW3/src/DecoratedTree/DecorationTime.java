package DecoratedTree;

public class DecorationTime {
	
	public static void printTree(Tree tree){
		System.out.println(tree.getTreeDescription());
	}
	
	public static void main(String[] args){
		Tree tree = new TreeBalsamFir();
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		tree = new DecorationBallRed(tree);
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		
		tree = new DecorationStar(tree);
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		
		tree = new DecorationStar(tree);
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		tree = new DecorationStar(tree);
		printTree(tree);
		
		tree = new DecorationStar(tree);
		printTree(tree);
	}
}
