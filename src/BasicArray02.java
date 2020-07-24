
public class BasicArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i * 3;
		}
		for (int i = 1; i <= arr1.length; i++) {
			arr1[i - 1] = i * 5;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i] + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[i] = arr[i] * 3 + arr1[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr [%d] : %2d ", i, arr[i]);
		}

		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] : %2d ", i, arr1[i]);
		}

		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d] : %2d ", i, arr2[i]);
		}
	}
}
