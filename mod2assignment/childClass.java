import java.util.stream.IntStream;

public class childClass extends superClass {
	public void addArray1(int [] a) {
			
		int sum = IntStream.of(a).sum();
		System.out.println("The sum of the array is " + sum);
		
	}
}
