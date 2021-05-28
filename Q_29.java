package day_29;

import java.util.Arrays;

public class Q_29 {

	public static void main(String[] args) {

		int[]x= {2,3,10,3,4,20,50,7,10,7};
		System.out.println(Arrays.toString(multiple10(x)));
	}
public static int[] multiple10(int[]arr) {
	for(int i=1;i<arr.length;i++) {
		if(arr[i-1]%10 ==0) {
			if(arr[i]%10==0) {
				continue;
			}else {
				
				arr[i]=arr[i-1];
			}
			
		}
		continue;
	}
	return arr;
}
}
