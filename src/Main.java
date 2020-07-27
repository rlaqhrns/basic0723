import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x, y, z, sum = 0;
		for (int i = N-54; i <= N; i++) {
			x = i / 100;
			y = (i / 10) % 10;
			z = i % 10;
			sum = i + x + y + z;
			if (sum == N) {
				System.out.println(i);
				return;
			}

		}
		System.out.println(0);

	}
}