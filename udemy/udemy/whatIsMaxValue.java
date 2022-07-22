package udemy;

public class whatIsMaxValue {

	public static void main(String[] args) {
		System.out.println(inputValue());
		
	}

	public static int inputValue() {
	
		int[] array= {4,3,2,1,3,5,6};
		int max = array[0];
		for(int i = 1; i<array.length;i++ ) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
}
}
