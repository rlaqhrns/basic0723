
public class Scanner_demo {
	
	int scanner;
	
	Scanner_demo(){
		
		
	}
	
	Scanner_demo(String a){
		System.out.println(a+"�� ����");
		System.out.println("���⿡�� ������ó��");
		System.out.println("System.in" + a + "�� ���ڷ� �������� �����δ�");
		System.out.println("System.in�� ���ڿ��� �ƴմϴ�.");
	}
	Scanner_demo(String a,int b){
		System.out.println(a+"�� ����");
		System.out.println("���⿡�� ������ó��");
		System.out.println("System.in" + a + "�� ���ڷ� �������� �����δ�");
		System.out.println("System.in�� ���ڿ��� �ƴմϴ�.");
		scanner = b;
		System.out.println("�ι�° �Ķ���ͷ� ������ ���� Ű����� �ԷµǴ� ���̶� ����");
	}		
		int nextInt() {
			System.out.println("����� Ű����� �Է¹��� ���� ������ ��ȯ");
			return this.scanner;
		}
	
	
	
}
