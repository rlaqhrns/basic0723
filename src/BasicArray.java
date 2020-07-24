
public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		String[] arr1 = new String[10];
		for (int i = 0, j = 5; i < arr.length; i++, j += 5) {
			if (j % 2 == 0) {
				arr[i] = j * 6;
			} else {
				arr[i] = j + 5;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] % 3 == 0) {
				arr1[i] = arr[i] + " : 3의 배수입니다.";
			} else {
				arr1[i] = arr[i] + " : 3의 배수가 아닙니다.";
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
