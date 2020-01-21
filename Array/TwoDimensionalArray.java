package Array;

public class TwoDimensionalArray {
	int arr[][] = null;

	TwoDimensionalArray(int rowNo,int colNo){
		arr = new int[rowNo][colNo];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	void traverse() {
		try {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j] + " ");
				}
			System.out.println();
			}
		} catch (Exception e) {
			System.out.println("array doesnot exists!!!");
		}		
	}

	void insert(int row,int col,int VTI) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = VTI;
			}
			else {
				System.out.println("already occupied!!!");
			}
		} catch (Exception e) {
			System.out.println("array doesn't exists!!!");
		}
	}
	
	void access(int row,int col) {
		try {
			System.out.println(arr[row][col]);
		} catch (Exception e) {
			System.out.println("Invalid");
		}
	}
	
	void search(int value) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] == value) {
					System.out.println("found!!!");
					return;
				}
			}
		}
	System.out.println("value not found");
	}
	
	void delete(int row,int col) {
		if(arr[row][col] != Integer.MIN_VALUE) {
			arr[row][col] = Integer.MIN_VALUE;
		}	else {
			System.out.println("can't delete!!!");
		}
	}
	
	void deleteAll() {
		arr = null;
	}
	
	
	
	
}
