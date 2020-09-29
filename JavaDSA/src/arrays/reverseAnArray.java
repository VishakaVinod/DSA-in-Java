package arrays;

public class reverseAnArray {
	public static void main(String[] args) {
		int arr [] = {99, 22, 14, 43, 24, 10, 23};
		System.out.println("Arrays List");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int rev [] = new int[arr.length];
		int j=0;
		for(int i=rev.length-1; i>=0; i--) {
			rev[j] = arr[i];
			j++;
		}
		System.out.println("\nReversed List");
		for(int i=0; i<arr.length; i++) {
			System.out.print(rev[i] + " ");
		}
	}
}
