
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
				{{"�����1","�����2"},{"�����1","�����2"}},
				{{"ȫ�浿1","ȫ�浿2","ȫ�浿3"},{"ȫ�浿1","ȫ�浿2","ȫ�浿3"}},
				{{"�谳��12","�踻��23","ȫ����23","ȫ�׸�56"},{"�谳��12","�踻��23","ȫ����23","ȫ�׸�56"}}
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
