
public class Scanner_Demo_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner_demo sc = new Scanner_demo();
		Scanner_demo sc1 = new Scanner_demo("System.in");
		Scanner_demo sc2 = new Scanner_demo("System.in", 9);

		int korea = sc2.nextInt();
		System.out.println("국어 점수 : " + korea);
	}

}
