package day_29;

import java.util.Arrays;

public class Q_17 {

	public static void main(String[] args) {
		int[] y = {0, 7, 2, 10, 9,56 };
		System.out.println(difference(y));

	}

	public static int difference(int[] x) {
		int max = x[0];
		int min = x[0];
		for (int value : x) {
			if (value >= max) {
				max = value;
			} else if(value<min){
				min=value;
			}
			
			 else {
				continue;

			}
		}
		return max - min;

	}
}
