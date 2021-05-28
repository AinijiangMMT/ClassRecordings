package day_29;

public class Q_22 {

	public static void main(String[] args) {
int[]x= {1,1};
		System.out.println(onefour(x));
		
	}
public static boolean onefour(int[]arr) {
	int count1=0;
	int count4=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count1++;
		}
		if(arr[i]==4) {
			count4++;
		}
	}
	if(count1>count4) {
		return true;
	}
	return false;
}
	
	
}
