package Array;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {
		
		TwoDimensionalArray tw = new TwoDimensionalArray(5,5);
		tw.traverse();
		System.out.println();
		tw.insert(1,2,231);
		tw.traverse();
		tw.access(1,2);
		tw.search(231);
		tw.delete(1,2);
		tw.search(231);
		tw.deleteAll();
		tw.traverse();
	}

}
