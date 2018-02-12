package labs.comp3111.ust.hk;

public class Lab1Activity{
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(String.format("Sum of the numbers is %d", sum));
		int min = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(String.format("Min = %d", min));
		int max = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(String.format("Min = %d", min,"Max = %d", max));
	}
}