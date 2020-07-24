
public class Scanner_demo {
	
	int scanner;
	
	Scanner_demo(){
		
		
	}
	
	Scanner_demo(String a){
		System.out.println(a+"가 들어옴");
		System.out.println("여기에서 복잡한처리");
		System.out.println("System.in" + a + "이 문자로 들어오지만 실제로는");
		System.out.println("System.in이 문자열이 아닙니다.");
	}
	Scanner_demo(String a,int b){
		System.out.println(a+"가 들어옴");
		System.out.println("여기에서 복잡한처리");
		System.out.println("System.in" + a + "이 문자로 들어오지만 실제로는");
		System.out.println("System.in이 문자열이 아닙니다.");
		scanner = b;
		System.out.println("두번째 파라미터로 들어오는 것은 키보드로 입력되는 것이라 가정");
	}		
		int nextInt() {
			System.out.println("여기는 키보드로 입력받은 값을 정수로 반환");
			return this.scanner;
		}
	
	
	
}
