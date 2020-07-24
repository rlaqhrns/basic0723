
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{ 100, 100, 100, 100, 100 },
				{ 20, 20, 20, 20, 20 },
				{ 40, 50, 60, 70, 80 },
				{ 10, 20, 30, 40 }
				};
		String[][][] str = {
				{{"ÀÌÀç¿À1","ÀÌÀç¿À2"},{"ÀÌÀç¿À1","ÀÌÀç¿À2"}},
				{{"È«±æµ¿1","È«±æµ¿2","È«±æµ¿3"},{"È«±æµ¿1","È«±æµ¿2","È«±æµ¿3"}},
				{{"±è°³¶Ë12","±è¸»ÀÚ23","È«¼øÀÚ23","È«±×¸°56"},{"±è°³¶Ë12","±è¸»ÀÚ23","È«¼øÀÚ23","È«±×¸°56"}}
		};
	for(String[][] k: str) {
		for(String[] i : k) {
			for(String j : i) {
				System.out.print(j.substring(0,3)+" ");
			}
		}
	System.out.println();}
	for(String[][] k: str) {
		for(String[] i : k) {
			for(String j : i) {
				System.out.print(j.substring(3)+" ");
			}
		}
		System.out.println();
	}}

}
