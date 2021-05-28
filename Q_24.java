package day_29;

public class Q_24 {

	public static void main(String[] args) {
	int []x= {1,2,1,3,1,5};
System.out.println(everywhere (x,1));
		
	}
public static boolean everywhere(int[]arr, int a) {
	int count=0;
	for (int i=0;i<arr.length-1;i++) {
		if(arr[i]==a || arr[i+1]==a) {
			count++;
		}
		
	}
	if(count==arr.length-1) {
		return true;
	}
	return false;
}
}
