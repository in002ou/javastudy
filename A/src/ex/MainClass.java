package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void ex01() {
		
		List<String> list1 = new ArrayList<String>();		// 1.7 이후로 생성자는 타입을 생략할 수 있다.
		List<Integer> list2 = new ArrayList<Integer>();
		
		// add 메소드는 마지막 요소로 추가한다. 즉, 배열과 같이 순서가 있다.
		list1.add("봄");
		list1.add("여름");
		list1.add("가을");
		list1.add("겨울");
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		System.out.println(list1);
		System.out.println(list2);
		
		List<Car> list3 = new ArrayList<Car>();
		
		list3.add(new Car("벤츠", 100));
		list3.add(new Car("BMW", 100));
		System.out.println(list3);
	}
	
	public static void ex02() {
		
		List<String> list1 = Arrays.asList("봄", "여름", "가을", "겨울");		// 이후 add로 데이터 추가할 수 없음
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40);
		List<Car> list3 = Arrays.asList(
				new Car("벤츠", 100),
				new Car("BMW", 200)
				);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
	
	public static void ex03() {
		
		List<String> list = Arrays.asList("봄", "여름", "가을", "겨울");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		for(int i = 0, length = list.size(); i < length; i++) {
			System.out.println(list.get(i));
		}
		List<Car> list3 = Arrays.asList(
				new Car("벤츠", 100),
				new Car("BMW", 200)
				);
		for(int i = 0, length = list3.size(); i < length; i++) {
			System.out.println(list3.get(i));
		}
	}
	
	public static void ex04() {
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		// 추가
		map.put(1, new Car("벤츠", 100));
		map.put(2, new Car("BMW", 200));
		
		// Value 확인
		System.out.println(map.get(1)); 	// key가 1인 value 가져오기
		System.out.println(map.get(2)); 	// key가 2인 value 가져오기
		
	}
	
	public static void ex05() {
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		map.put(1, new Car("벤츠", 100));
		map.put(2, new Car("BMW", 200));
		
		for(Map.Entry<Integer, Car> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		for(Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
	}
	
	public static void ex06() {
		
		
		Map<Integer, Car> home1 = new HashMap<Integer, Car>();
		home1.put(1, new Car("벤츠", 100));
		home1.put(2, new Car("BMW", 200));
		
		Map<Integer, Car> home2 = new HashMap<Integer, Car>();
		home2.put(1, new Car("테슬라", 300));
		home2.put(2, new Car("람보르기니", 400));
		
		List<Map<Integer, Car>> list = new ArrayList<Map<Integer,Car>>();
		list.add(home1);
		list.add(home2);
		
		Map<Integer, Car> map1 = list.get(0);
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		Map<Integer, Car> map2 = list.get(1);
		System.out.println(map2.get(1));
		System.out.println(map2.get(2));
		
		for(Map<Integer, Car> map : list) {
			for(Integer key : map.keySet()) {
				System.out.println(map.get(key));
			}
		}
	}
	
	public static void main(String[] args) {

		ex06();
		
	}

}
