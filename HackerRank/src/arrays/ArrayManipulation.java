package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntToLongFunction;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(String.valueOf(result));

        scanner.close();
	}
	public static long arrayManipulation(int n, int[][] queries) {
		long[] arr = new long[n+1];
		long result = 0;

		for(int[] query : queries) {
//			IntToLongFunction g = e-> {
//				if(e>=query[0] && e<=query[1])
//					arr[(int) e] += query[2];
//				return arr[(int) e];
//			};
//			Arrays.setAll(arr, g);
			for(int i=query[0]; i<=query[1]; i++) {
				arr[i] += query[2];
				if(arr[i]>result)
					result = arr[i];
			}
		}
		return result;
	}
}
