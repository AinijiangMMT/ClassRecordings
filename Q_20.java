package day_29;

public class Q_20 {
	public static void main(String[] args) {
		int[] x = { 2, 2, 1, 2 };
		System.out.println(next2(x));
	}

	public static boolean next2(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 2 && arr[i + 1] == 2) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}
}
