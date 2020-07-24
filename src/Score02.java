import java.util.Scanner;

public class Score02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caculator caculator = new Caculator();
		Caculator caculator1 = new Caculator(60,80,100);
			
			System.out.print("korea : ");
			caculator.setKorea(sc.nextInt());
			System.out.print("eng : ");
			caculator.setEng(sc.nextInt());
			System.out.print("math : ");
			caculator.setMath(sc.nextInt());
			caculator.ratingPrint();
			caculator1.ratingPrint();
		
		sc.close();
	}
}
