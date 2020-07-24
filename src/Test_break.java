
public class Test_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		int cnt = 0;

		while (true) {
			i++;
			if (i % 2 == 1) {
				cnt++;
				sum += i;
			}
			if (sum > 10)
				break;

		}
		System.out.println("cnt = " + cnt);
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
