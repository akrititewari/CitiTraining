import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers = {123, 34, 55, 65, 41, 55, 67, 89, 90};
		
//		Arrays.fill(numbers, 0);
//		
//		for(int num:numbers) {
//			System.out.println(num);
//		}
//		
//		Arrays.fill(numbers, 1, 9, 100);
//		
//		for(int num:numbers) {
//			System.out.println(num);
//		}
		
		int []x = Arrays.copyOf(numbers, 50);
		for(int i:x) {
			System.out.println(i);
		}
		
		bool x;
		System.out.println("" + x);
	}

}
