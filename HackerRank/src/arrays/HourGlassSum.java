package arrays;

import java.util.Scanner;

public class HourGlassSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[6][6];
		
		for(int i=0; i<6; i++) {
			String[] line = scan.nextLine().split(" ");
			scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for(int j=0; j<6; j++) {
				arr[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		int result = calculateSum(arr);
		System.out.print(result);
	}
	public static int calculateSum(int[][] arr) {
		int max = -63;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
						arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(sum > max)
					max = sum;
			}
		}
		return max;
	}
}
