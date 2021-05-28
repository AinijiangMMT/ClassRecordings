package day_29;

import java.util.Arrays;
import java.util.Scanner;

public class Q_23 {

	public static void main(String[] args) {

	System.out.println(Arrays.toString(creARR()));	
		
	}
	public static int[] creARR() {	
Scanner sc=new Scanner(System.in);

System.out.println("enter a number:");
int num=sc.nextInt();
int[]arr=new int[num];
	for(int i=0;i<num;i++) {
		arr[i]=i;
	}
	return arr;
	}
}
