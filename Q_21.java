package day_29;

public class Q_21 {

	public static void main(String[] args) {
int[]x= {1,2,2,3,2,4,2};
		System.out.println(sum28(x));
	}

	public static boolean sum28(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				sum+=arr[i];
			}
		}
		if(sum==8) {
			return true;
		}
		return false;
	}
}
