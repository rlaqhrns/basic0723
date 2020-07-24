import java.util.Scanner;

public class Score01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇÐ»ý ¼ö : ");
		int N = sc.nextInt();
		Caculator[] cacl = new Caculator[N];
		for (int i = 0; i < cacl.length; i++) {
			cacl[i] = new Caculator(i);
			System.out.print("korea : ");
			cacl[i].setKorea(sc.nextInt());
			System.out.print("eng : ");
			cacl[i].setEng(sc.nextInt());
			System.out.print("math : ");
			cacl[i].setMath(sc.nextInt());
			cacl[i].ratingPrint();
			System.out.println();
		}
		for(int i = 0;i<cacl.length;i++) {
			
		}
		sc.close();
	}
}
