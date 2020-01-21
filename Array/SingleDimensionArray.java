package Array;

public class SingleDimensionArray {
	int arr[] = null;
	
	SingleDimensionArray(int sizeOfArr) {
		arr = new int[sizeOfArr];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	void traverse() {
		try {
			for(int i : arr) {
				System.out.println(i + " ");
			}
		} catch (Exception e) {
			System.out.println("array doesn't exists !!!");
		}
	}
	
	void insert(int location,int insertValue) {
		try {
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = insertValue;
			}
			else {
				System.out.println("value can't be inserted!!!");
			}
		} catch (Exception e) {
			System.out.println("array doesn't exists!!!");
		}
		
	}
	
	void accesing(int cellNo) {
		try {
			System.out.println("element at " + cellNo + " : " + arr[cellNo]);
		} catch (Exception e) {
			System.out.println("can't access !!!");
		}
		
	}
	
	void search(int value) {
		try {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == value) {
					System.out.println("position is " + (i+1));
					return;
					}
			}
			System.out.println("value not found !!!");
		} catch (Exception e) {
			System.out.println("can't find!!!");
		}
	}
	
	void delete(int cellNo) { 
		try {
			arr[cellNo] = Integer.MIN_VALUE;
			System.out.println("value is deleted!!!");
		} catch (Exception e) {
			System.out.println("can't delete");
		}
	}
	
	void deleteArr() {
		arr = null;
		System.out.println("entire array is deleted!!!");
	}
	
}
