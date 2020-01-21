package Array;

public class SingleDimensionArrayMain {

	public static void main(String[] args) {
		SingleDimensionArray sd = new SingleDimensionArray(6);
		sd.traverse();
		
		sd.insert(0,10);
		sd.insert(1,11);
		sd.insert(2,12);
		sd.insert(3,13);
		sd.insert(4,14);
		sd.insert(5,15);
		sd.traverse();
		
		sd.accesing(4);
		sd.accesing(23);
		
		sd.search(13);
		sd.search(67);
		
		sd.delete(3);
		sd.delete(12);
		sd.traverse();
		sd.deleteArr();
		sd.traverse();
		
	}

}
