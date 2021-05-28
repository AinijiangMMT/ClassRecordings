package day_29;

public class Q_20_01 {

	public static void main(String[] args) {
		int[]x= {1,2,4,2,25};
System.out.println(double2(x));
		
	}
public static boolean double2(int[]arr) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==2 && arr[i+1]==2) {
			return true;
		}
	}return false;
}
}
