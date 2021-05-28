package day_29;

public class Q_18 {

	public static void main(String[] args) {

		int[]a= {1,2,2,1,13,3,45};
		System.out.println(sum(a));
		
	}
public static int sum(int[]x) {
	int sum=0;
	for(int i=0;i<x.length;i++) {
		if(x[i]!=13) {
			
		sum+=x[i];
		}else {
		break;
		}
		
	}
	return sum;
}
}
