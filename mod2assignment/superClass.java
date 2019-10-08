import java.util.Arrays;

public class superClass {
	public void displayArray1(int [] a){
			System.out.printf("Current array: %s", Arrays.toString(a));
			System.out.println("");	
	}
	
	public void sortArray1(int [] a) {
		Arrays.sort(a);
		System.out.printf("New sorted array: %s", Arrays.toString(a));
		System.out.println("");	
	}
	
}
