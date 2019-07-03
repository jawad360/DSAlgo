package arrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr, arr2;
		int n, d;
		Scanner scan = new Scanner(System.in);
		String[] nd = scan.nextLine().split(" ");
		n = Integer.parseInt(nd[0]);
		d = Integer.parseInt(nd[1]);
		
		arr = new int[n];
		String[] arrStr = scan.nextLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(arrStr[i]);
		}
		
		arr2 = rotateArrayTempArray(arr, d);
		for(int i=0; i<n; i++) {
			System.out.print(String.valueOf(arr2[i])+ " ");
		}
	}
	public static int[] rotateArrayTempArray(int[] arr, int d) {
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int pos = (i - d + arr.length) % arr.length;
			arr2[pos] = arr[i];
		}
		return arr2;
	}
}
