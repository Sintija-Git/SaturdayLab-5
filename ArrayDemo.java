package Lab5;

public class ArrayDemo {
	//declare data members
	
	private int nums[][];
	
	
	public ArrayDemo() {} //declare constructor


	public int[][] getNums() {
		return nums;
	}


	public void setNums(int[][] nums) {
		this.nums = nums;
	}
	
	public void SetArrayNumber (int row, int col, int num) {
		nums [row][col] = num;
	}

} //end class
