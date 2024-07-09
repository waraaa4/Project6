package object;

public class Quiz1 {

	// 문제1.
	// 학생이 대중교통을 타고 학교에 가는 상황을 구현하세요.
	
	// 학생 두 명을 생성하세요. (둘리, 5000)(도우너, 10000)
	
	// 둘리는 100번버스를 타고 학교에 갑니다.
	// 도우너는 2호선 지하철을 타고 학교에 갑니다.
	
	// 학생,버스,지하철의 현재 정보를 출력하세요.
	
	public static void main(String[] args) {
		
		Student student1 = new Student("둘리", 5000);
		Bus bus100 = new Bus(100);
		student1.takeBus(bus100);
		student1.showInfo();
		bus100.showInfo();
		
		
		Student student2 = new Student("도우너", 10000);
		Subway subway2 = new Subway("2");
		student2.takeSubway(subway2);
		student2.showInfo();
		subway2.showInfo();

	}

}

