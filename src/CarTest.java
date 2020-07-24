import java.util.ArrayList;
import java.util.List;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		List<String> b = new ArrayList<String>();
		List<Car> c = new ArrayList<Car>();
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		c.add(car1);
		c.add(car2);
		c.add(car3);
		a.add(1);
		a.add(5);
		a.add(7);
		b.add("´Ò´Ï¸®");
		b.add("´Ò´Ï¸®¾ß");
		for(Integer mul_10 : a) {
			System.out.println(mul_10*10);
		}
		for(String str : b) {
			System.out.println(str);
		}
		System.out.println();
		for(Car n : c) {
			n.drivigCar();
		}
	}

}
