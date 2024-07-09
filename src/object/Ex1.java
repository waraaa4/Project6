package object;

public class Ex1 {

	public static void main(String[] args) {

		// 민원을 가진 둘리라는 학생을 만든다
		Student student = new Student("둘리", 10000);
		// 100 버스를 만든다
		Bus bus = new Bus(100);

		// 학생이 100번 버스에 탄다
		student.takeBus(bus);

		student.showInfo();
		bus.showInfo();

	}

}

// 버스 클래스
class Bus {
	int busNumber; // 번스번호
	int passengerCount; // 승객수
	int money; // 수입

	// 버스번호를 초기화하는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 버스에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money; // 버스 수입 증가
		passengerCount++; // 승객수 1명 증가
	}

	// 버스의 상태
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

// 지하철
class Subway {
	String lineNumber; // 지하철 노선번호
	int passengerCount; // 승객수
	int money; // 수입

	// 지하철 노선번호를 초기화하는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	// 지하철에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}

	// 지하철의 상태
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다");
	}
}

// 택시
class Tax {
	String lineNumber;
	int passengerCount; // 승객수
	int money; // 수입

	public Tax(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "번호 " + money + "원 " + passengerCount + "명");
	}
}

class Cafe {
	String cafeName; // 카페이름
	int money; // 매상

	// 카페이름을 초기화하는 생성자
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	// 손님에게 커피를 파는 메소드
	public void sellCoffee(int price) {
		this.money = this.money + price;
	}

	public void showInfo() {
		System.out.println("카페 " + cafeName + "의 수입은 " + money + "입니다.");
	}

}

class Student {
	String studentName; // 학생이름
	int money; // 소지금

	// 학생이름과 가진돈을 초기화하는 생성자
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

	// 버스에 타서 요금을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진돈 1000원 잃음
	}

	// 지하철에 타서 요금을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500); // 1500원 지출
		this.money = this.money - 1500; // 가진돈 1500원 잃음
	}

	// 택시요금은 1만원을 지불했습니다.
	// 단, 소지금이 만원보다 적으면 택시에 탈 수 없습니다.
	public void takeTax(Tax tax) {
		if (money < 10000) {
			return;
		}
		tax.take(10000);
		this.money = this.money - 10000;
	}

	// 카페에서 아메리카노를 사고 4000원을 지불하는 메소드
	public void buyAmericano(Cafe cafe) {
		if (money < 4000) {
			System.out.println(studentName + "의 소지금이 적어 커피를 살 수 없습니다..");
			return;
		}
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}

	// 카페에서 라떼를 사고 4500원을 지불하는 메소드
	public void buyCaffelatte(Cafe cafe) {
		if (money < 4500) {
			System.out.println(studentName + "의 소지금이 적어 커피를 살 수 없습니다..");
			return;
		}
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}

	// 카페에서 커피를 사고 커피값을 지불하는 메소드
	public void buyCoffe(Cafe cafe, int price) {
		if (money < price) {
			System.out.println(studentName + "의 소지금이 적어 커피를 살 수 없습니다..");
			return;
		}
		cafe.sellCoffee(price);
		this.money = this.money - price;
	}

	// 학생의 상태
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
