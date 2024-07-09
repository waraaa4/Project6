package object;

public class Quiz3 {

	// 3번.
	// 손님이 카페에서 커피를 사는 과정 구현하세요.
	
	// 10000원을 가진 둘리는 별다방 카페에서 4000원을 내고 아메리카노를 샀습니다
	// 20000원을 가진 또치는 별다방 카페에서 4500원을 내고 라떼를 샀습니다.
	
	// 단, 소지금이 가격보다 적으면 커피를 살 수 없습니다.
	public static void main(String[] args) {
		
		Student student1 = new Student("둘리", 10000);
		Cafe cafe = new Cafe("별다방");
		student1.buyAmericano(cafe);
		student1.showInfo();
		
		Student student2 = new Student("또치", 20000);
		student2.buyCaffelatte(cafe);
		student2.showInfo();
		
		cafe.showInfo();
	}

}

