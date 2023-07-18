package rowsum;

import java.util.Arrays;
import java.util.Scanner;

public class RowSum {
	public static int[] rowsum(int arr[][], int A, int B) {
		int ar[] = new int[B];
		for(int j=0; j<B; j++) {
			int sum = 0;
			for(int i=0; i<A; i++) {
				sum = sum + arr[j][i];
			}
			ar[j] = sum;
		}
		return ar;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int [a][b];
		for (int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int value[] = rowsum(arr,a,b);
		System.out.println(Arrays.toString(value));
		
	}
}



