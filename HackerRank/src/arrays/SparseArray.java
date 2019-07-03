package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		
		String[] input, query;
		int[] output;
		int n1, n2;
		
		Scanner scan = new Scanner(System.in);
		
		input = new String[Integer.parseInt(scan.nextLine())];
		for(int i =0; i < input.length; i++)
			input[i] = scan.nextLine();
		
		query = new String[Integer.parseInt(scan.nextLine())];
		for(int i =0; i < query.length; i++)
			query[i] = scan.nextLine();
		
		output = matchingStrings(input, query);
		for(int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
	public static int[] matchingStrings(String[] input, String[] query) {
		int[] output = new int[query.length];
		int i;
		for(i=0; i<query.length; i++) {
			String q = query[i];
			output[i] = Arrays.stream(input).filter(s -> s.equals(q)).toArray().length;
		}
		return output;
	}

}
