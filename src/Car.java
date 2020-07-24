
public class Car {
	int code;//Car 클래스의 멤버 변수(상태/속성) 정수형
	String color;//Car 클래스의 멤버 변수(상태/속성) 문자열
	String driver;//Car 클래스의 멤버 변수(상태/속성) 문자형
	
	
	void drivigCar() {//Car 클래스의 멤버 함수(메서드/기능/동작)
		System.out.println(this.driver+"의 "+this.color+" 차가 달린다 붕붕");
	}
}
