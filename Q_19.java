package day_29;

public class Q_19 {

	public static void main(String[] args) {
int []x= {1,2,2,6,99,99,7};
		System.out.println(sum67(x));
		
	}

	public static int sum67(int []arr) {
		int sum=0;int sum1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=6) {
				sum+=arr[i];
			}else {
				for(int k=0;k<arr.length;k++) {
					if(arr[k]!=7) {
						sum+=arr[i-1];
					}else {
					sum+=arr[i-1];
					if(i>k) {
						sum+=arr[i];
					}else {
						sum+=arr[i];
						sum1+=arr[]
					}
					}
				}sum+=sum1;
			}
		}
		return sum;
	}
}
